package Seccion10_ClaseMath;

import javax.swing.*;

public class Tarea01_RadioAreaCirculo {
    public static void main(String[] args) {
        int radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar radio del circulo."));
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo es de: " + area);
    }
}
