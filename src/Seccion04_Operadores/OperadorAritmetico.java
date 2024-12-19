package Seccion04_Operadores;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4;
        int suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j);
        System.out.println("(i + j) = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        //System.out.println("i - j = " + i - j); NO ES POSIBLE
        System.out.println("(i - j) = " + (i - j));
        
        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("(i * j) = " + (i * j));
        
        //int div = i / j; NO ES EXACTO
        float div = (float) i / j;
        System.out.println("div = " + div);
        System.out.println("(i / j) = " + (i / j));
        
        int resto = i % j;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        boolean esParI = (i % 2) == 0;
        System.out.println("esParI = " + esParI);
        boolean esParJ = (j % 2) == 0;
        System.out.println("esParJ = " + esParJ);


    }
}
