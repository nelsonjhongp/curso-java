package Seccion02_Variables;

import java.util.Scanner;

public class TAREA {
    public static void main(String[] args) {
        //Se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.println("Ingresar precio: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingresar cantidad: ");
        int cantidad = scanner.nextInt();

        double igv = 0.18;
        double precioFinal = (precio*cantidad)*(1-igv);

        String mensaje = "Usted compro " + cantidad + " productos de " + producto;
        mensaje += "\nPrecio final con impuestos: " + precioFinal;

        System.out.println(mensaje);
    }
}
