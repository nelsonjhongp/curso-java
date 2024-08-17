package Seccion02_Variables;

public class Primitivos {
    public static void main(String[] args) {
        String separator = "--------------------------------------------";
        byte numeroByte = 127;
        System.out.println("Numero Byte: "+numeroByte);
        System.out.println("Tipo byte corresponde en byte a: "+Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a: "+Byte.SIZE);
        System.out.println("Valor maximo de un byte: "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: "+Byte.MIN_VALUE);

        System.out.println(separator);
        short numeroShort = 32767;
        System.out.println("Numero Short: "+numeroShort);
        System.out.println("Tipo Short corresponde en byte a: "+Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a: "+Short.SIZE);
        System.out.println("Valor maximo de un Short: "+Short.MAX_VALUE);
        System.out.println("Valor minimo de un Short: "+Short.MIN_VALUE);

        System.out.println(separator);
        int  numeroInt = 2147483647;
        System.out.println("Numero int : "+numeroInt);
        System.out.println("Tipo int corresponde en byte a: "+Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: "+Integer.SIZE);
        System.out.println("Valor maximo de un int: "+Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: "+Integer.MIN_VALUE);

        System.out.println(separator);
        long  numeroLong = 9223372036854775807L;
        System.out.println("Numero long : "+numeroLong);
        System.out.println("Tipo long corresponde en byte a: "+Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: "+Long.SIZE);
        System.out.println("Valor maximo de un long: "+Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: "+Long.MIN_VALUE);

        //Si nos pasamos de long seria usar float, double o podria ser String
    }
}
