package Seccion12_Arreglos;

import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[7];

        int contarPositivos = 0, contarNegativos = 0, contarCeros = 0;
        double promPositivos = 0, promNegativos = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i+1 + ".- Ingrese un numero (+,- o cero): ");
            arreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0){
                contarCeros++;
            }
            if (arreglo[i] < 0){
                promNegativos += arreglo[i];
                contarNegativos++;
            } else {
                promPositivos += arreglo[i];
                contarPositivos++;
            }
        }

        promPositivos /= contarPositivos;
        promNegativos /= contarNegativos;

        System.out.println("El promedio de positivos (" + contarPositivos + ") es: " + promPositivos);
        System.out.println("El promedio de negativos (" + contarNegativos + ") es: " + promNegativos);
        System.out.println("Cantidad de Ceros contados: " + contarCeros);

        /*
        int[] arreglo = new int[7];
        // ingreamos los datos por ejemplo {14, 33, 15, 36, 78, 21, 43}
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese un numero de 11 a 99: ");
            arreglo[i] = scanner.nextInt();
        }

        int max = 0;

        // luego obtenemos el valor mayor
        for (int i = 0; i < 7; i++) {
            max = (max > arreglo[i])? max: arreglo[i];
        }
        System.out.println("El valor mas alto es: " + max);

        //arregloNejigiku();

         */
    }

    public static void arregloNejigiku() {
        Scanner scanner = new Scanner(System.in);

        int numero, arreglo[], tamanoArreglo = 7;
        arreglo = new int[tamanoArreglo];

        System.out.println("Ingrese 7 numeros (rango 11-99).");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i+1 + ".- Ingrese numero: ");
            numero = scanner.nextInt();
            if (numero >= 11 && numero <= 99){
                arreglo[i] = numero;
            } else {
                System.out.println("Numero fuera de rango (11-99). Intente de nuevo!");
                i--;
            }
        }

        int numeroAlto = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > numeroAlto){
                numeroAlto = arreglo[i];
            }
        }

        System.out.println("El numero mas alto del arreglo es: " + numeroAlto);
    }
}
