package Seccion03_TipoString;

public class StringInmutabilidad {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        //Se concatena en curso
        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c ->{
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        //Para resultado 3 se cambio a diferencia de resultado con Mayuscula
        String resultado3 = resultado.replace("a", "A");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
