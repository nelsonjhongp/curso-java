package Seccion12_Arreglos;

import java.util.Scanner;

public class Tarea16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = new int[10];
        int[] contador = new int[10];

        System.out.println("Ingrese 10 numeros enteros (1-9):");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 9) {
                System.out.println("El numero no esta dentro del rango (1-9).");
                i--;
            } else {
                arreglo[i] = numero;
                contador[numero]++;
            }
        }

        int numeroMasRepite = 0;
        int maxOcurrencias = 0;

        for (int i = 1; i <= 9; i++) {
            if (contador[i] > maxOcurrencias) {
                maxOcurrencias = contador[i];
                numeroMasRepite = i;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("El numero que mas se repite es " + numeroMasRepite +
                " con " + maxOcurrencias + " ocurrencias.");
    }
}
