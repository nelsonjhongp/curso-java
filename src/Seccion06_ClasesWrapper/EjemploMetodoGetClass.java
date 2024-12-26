package Seccion06_ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal!";
        Class strClas = texto.getClass();
        System.out.println("strClas = " + strClas);
        System.out.println("strClas.getName() = " + strClas.getName());
        System.out.println("strClas.getSimpleName() = " + strClas.getSimpleName());
        System.out.println("strClas.getPackageName() = " + strClas.getPackageName());
        
        for (Method metodo: strClas.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
