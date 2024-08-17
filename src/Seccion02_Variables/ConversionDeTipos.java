package Seccion02_Variables;

public class ConversionDeTipos {
    public static void main(String[] args) {
        //Conversion de String a primitivo
        String numero = "50";
        int numeroInt = Integer.parseInt(numero);
        System.out.println("numeroInt = " + numeroInt);
        
        String real = "9876.543";
        double realDouble = Double.parseDouble(real);
        System.out.println("realDouble = " + realDouble);

        String logico = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logico);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //Conversion de primitivo a String
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        //tener cuidado porque valueOf puede recibir también string
        otroNumeroStr = String.valueOf(100);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 12345.678e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);

        // Conversion entre primitivos, Casting
        int i = 10000;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;     //No hay problema porque es mayor tamaño
        System.out.println("l = " + l);
    }
}
