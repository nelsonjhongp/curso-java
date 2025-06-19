package Seccion12_Arreglos;

import java.util.Scanner;

public class Tarea13 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("La lista invertida es asi: (Ultimo -> Primero)");

        int[] b = new int[10];
        for (int i = 0; i < a.length; i++){
            b[b.length-1-i] = a[i];
        }

        System.out.println("El arreglo invertido es:");
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        //hola gentita nooo otra vez porque
    }
}
