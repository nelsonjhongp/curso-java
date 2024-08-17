package Seccion02_Variables;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero entero : ");

        int numeroDecimal = 0 ;
        try {
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String mensajeInicial = "Para el numero " + numeroDecimal + ", tenemos :";
        String mensajeBinario = "\n- numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "\n- numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "\n- numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeInicial;
        mensaje += mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += mensajeHexadecimal;

        System.out.println(mensaje);
    }
}
