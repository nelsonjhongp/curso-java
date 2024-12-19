package Seccion03_TipoString;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.js";
        //int i = archivo.indexOf("."); Puede surgir error!
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.lenght() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
    }
}
