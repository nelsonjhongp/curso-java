package Seccion12_Arreglos;

import java.util.Scanner;

public class Tarea14 {
    public static void main(String[] args) {
        //Imprimir el numero mas alto de un arreglo
        Scanner scanner = new Scanner(System.in);

        int numero, arreglo[];
        arreglo = new int[10];

        // Ingreso de valores
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i + ".- Ingrese numero: ");
            arreglo[i] = scanner.nextInt();
        }

        int numeroAlto = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > numeroAlto){
                numeroAlto = arreglo[i];
            }
        }

        System.out.println("El numero alto es: " + numeroAlto);

        // Mostrar arreglo final
        /* for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i + "-> " + arreglo[i]);
        } */
    }
}
