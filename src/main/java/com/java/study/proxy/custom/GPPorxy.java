package com.java.study.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 生成代理对象的代码
 * create by Nemo
 * 2018/7/17  15:34
 */
public class GPPorxy {
    private static String in = "\r\n";

    public static Object newProxyInstance(GPClassLoader loader, Class<?>[] interfaces, GPInvocvationHandler h) throws IOException {
        File f =null;
        try {


            //1 生成源代码
            String proxySrc = generateSrc(interfaces[0]);

            //2 将生成的源代码输出到磁盘，保存为.java文件
            String filePath = GPPorxy.class.getResource("").getPath();
            System.out.println(filePath);
            f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(proxySrc);
            fw.close();
            // 3 编译源代码，并且生成.class 文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> javaFileObjects = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task=compiler.getTask(null,manager,null,null,null,javaFileObjects);
            task.call();
            manager.close();
            // 4 将class 文件中的内容，动态加载到JVM 中
            Class proxyClass = loader.findClass("$Proxy0");
            // 5 返回被代理后的代理对象
            Constructor c = proxyClass.getConstructor(GPInvocvationHandler.class);

            return c.newInstance(h);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            if (f!=null){
                f.deleteOnExit();
            }
        }

        return null;
    }

    private static String generateSrc(Class<?> interfaces) {
        StringBuffer src = new StringBuffer();
        src.append("package com.java.study.proxy.custom;" + in);
//        public  class $Proxy extends Proxy implements Person
        src.append("import java.lang.reflect.Method;" + in);
        src.append("public  class $Proxy0 implements " + interfaces.getName() + "{" + in);

        src.append("GPInvocvationHandler h;");

        src.append("public $Proxy0(GPInvocvationHandler h) {" + in);
        src.append("this.h=h;" + in);
        src.append("}" + in);

        for (Method m : interfaces.getMethods()) {
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "() { " + in);
            src.append("try{" + in);


            src.append("Method m= " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + in);
            if (!m.getReturnType().getName().equals("void")) {
                src.append("return (" + m.getReturnType().getName() + ")this.h.invoke(this,m,null);" + in);
                src.append("}catch(Exception e){}catch (Throwable throwable) {\n" +
                        "            throwable.printStackTrace();\n" +
                        "        }" + in);
                src.append("return null;");
            } else {
                src.append("this.h.invoke(this,m,null);" + in);
                src.append("}catch(Exception e){}catch (Throwable throwable) {\n" +
                        "            throwable.printStackTrace();\n" +
                        "        }" + in);
            }

            src.append("}" + in);
        }


        src.append("}");

        return src.toString();

    }

}
