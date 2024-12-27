package Seccion09_ClaseSystem;

import java.util.Map;

public class EjemploVariableDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("-------- Listando variables del sistema --------");
        for (String key: varEnv.keySet()){
            System.out.println("key => " + varEnv.get(key));
        }

        System.out.println("-------- Testeando con System.getEnv --------");
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);

        String appEnv2 = System.getenv("APPLICATION_ENV");
        System.out.println("appEnv2 = " + appEnv2);
    }
}
