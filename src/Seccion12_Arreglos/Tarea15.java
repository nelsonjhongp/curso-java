package Seccion12_Arreglos;

import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contarPositivos = 0, contarNegativos = 0, contarCeros = 0;
        double promPositivos = 0, promNegativos = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print((i+1) + ".- Ingrese un número (+,- o cero): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                contarCeros++;
            } else if (numero < 0) {
                promNegativos += numero;
                contarNegativos++;
            } else {
                promPositivos += numero;
                contarPositivos++;
            }
        }

        if (contarPositivos > 0) {
            promPositivos /= contarPositivos;
            System.out.println("El promedio de positivos (" + contarPositivos + ") es: " + promPositivos);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        if (contarNegativos > 0) {
            promNegativos /= contarNegativos;
            System.out.println("El promedio de negativos (" + contarNegativos + ") es: " + promNegativos);
        } else {
            System.out.println("No se ingresaron números negativos.");
        }

        System.out.println("Cantidad de ceros contados: " + contarCeros);
    }
}
