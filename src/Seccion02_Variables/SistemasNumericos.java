package Seccion02_Variables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(null, "Ingresar un numero entero : ");
        int numeroDecimal = 0 ;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            //return;
            // O alternativa para no seguir el código de abajo, se inicia de nuevo el main
            System.exit(0);
        }

        /*  Codio
            System.out.println("numeroDecimal = " + numeroDecimal);
            int numeroBinario = 0b111110100; // 0b para binario
            System.out.println("numeroBinario = " + numeroBinario);
            int numeroOctal = 0764;
            System.out.println("numeroOctal = " + numeroOctal);
            int numeroHex = 0x1f4;
            System.out.println("numeroHex = " + numeroHex);
        */

        String mensajeInicial = "Para el numero " + numeroDecimal + ", tenemos :";
        String mensajeBinario = "\n- numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "\n- numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "\n- numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeInicial;
        mensaje += mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += mensajeHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
