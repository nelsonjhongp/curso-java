package Seccion03_TipoString;

import java.util.Arrays;

public class StringPrueba {
    public static void main(String[] args) {
        //25 Introduction to Strings
        //Se puede usar tanto como nuevo objeto o directo con las comillas
        String univ = new String("Utp");
        String lenguaje = new String("Java");

        String nombre = "Nelson";
        String tema = "Manejo de\"String\"";

        String str1 = "Hola Andres";
        String str2 = new String("Hola Andres");

        //Chequea si son el mismo objeto
        System.out.println("Son el mismo objeto?\t"+(str1==str2));
        //Chequea si tienen el mismo valor
        System.out.println("Tienen el mismo valor?\t"+str1.equals(str2));

        //Más Metodos
        char[] cadena = str1.toCharArray();//Convierte a una cadena de caracteres
        String subcadena1 = str1.substring(0,3); //Extrae una subcadena entre las posiciones 1 y 3
        String subcadena2 = str1.substring(3); //Extrae una subcadena desde la posicion 3
        int posicionCaracter = str1.indexOf("Character"); //Indica en que posicion está el caracter o cadena
        int posicionDesdeElFinal = str1.lastIndexOf("El"); //Indica la posicion del caracter o cadena desde el final
        boolean comienzaCon = str1.startsWith("Hola"); //Devuelve boolean si comiienza con el prefijo Hola
        boolean terminaCon = str1.endsWith("Adios"); //Devuelve boolean si termina con el sufijo Adios
        String[] particiones = str1.split(" "); //Devuelve cadena de strings usando el patron indicado como separador
    }
}