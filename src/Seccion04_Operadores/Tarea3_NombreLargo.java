package Seccion04_Operadores;

import javax.swing.*;

public class Tarea3_NombreLargo {
    public static void main(String[] args) {
        String nombreApellidoPadre = JOptionPane.showInputDialog("Ingrese el nombre y apellido de tu padre");
        String nombrePadre  = nombreApellidoPadre.split(" ") [0];

        String nombreApellidoMadre = JOptionPane.showInputDialog("Ingrese el nombre y apellido de tu madre");
        String nombreMadre  = nombreApellidoMadre.split(" ") [0];

        String nombreApellidoHermana = JOptionPane.showInputDialog("Ingrese el nombre y apellido de tu hermana");
        String nombreHermana  = nombreApellidoHermana.split(" ") [0];

        String nombreMasLargo;

        nombreMasLargo = nombrePadre.length() > nombreMadre.length() ? nombreApellidoPadre : nombreApellidoMadre;
        nombreMasLargo = nombreMasLargo.split(" ") [0].length() > nombreHermana.length() ? nombreMasLargo : nombreApellidoHermana;

        System.out.println(nombreMasLargo + " tiene el nombre más largo.");
    }
}
