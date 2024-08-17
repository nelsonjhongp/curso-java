package Seccion02_Variables;

public class PrimitivosFloat {
    public static void main(String[] args) {
        String separator = "--------------------------------------------";
        System.out.println(separator);
        float numeroFloat = 3.4028235E38f;//15000f;
        System.out.println("Numero float : "+numeroFloat);
        System.out.println("Tipo float corresponde en byte a: "+Float.BYTES);
        System.out.println("Tipo float corresponde en bites a: "+Float.SIZE);
        System.out.println("Valor maximo de un float: "+Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: "+Float.MIN_VALUE);

        System.out.println(separator);
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("Numero double : "+numeroDouble);
        System.out.println("Tipo double corresponde en byte a: "+Double.BYTES);
        System.out.println("Tipo double corresponde en bites a: "+Double.SIZE);
        System.out.println("Valor maximo de un double: "+Double.MAX_VALUE);
        System.out.println("Valor minimo de un double: "+Double.MIN_VALUE);
    }
}