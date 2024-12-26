package Seccion05_FlujosDeControl;

import java.util.Scanner;

public class Tarea1_MenorNumeroDeArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanio = 10;
        int [] numeros = new int[tamanio];
        for (int i = 0; i < tamanio; i++){
            System.out.print((i+1) + ".- Ingrese numero: ");
            numeros[i] = sc.nextInt();
        }

        int numeroLargo = numeros.length;
        int menornumero = numeros[0];
        for (int i = 0; i < numeroLargo; i++){
            if (menornumero > numeros[i]){
                menornumero = numeros[i];
            }
        }

        System.out.println("El menor numero es: " + menornumero);
        if (menornumero < 10){
            System.out.println("El numero menor (" + menornumero+ ") es menor que 10!");
        } else {
            System.out.println("El numero menor (" + menornumero+ ") es igual o mayor que 10!");
        }
    }
}
