package Seccion12_Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
        /*int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print(i + ".- Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println("\r\nIngrese un numero a buscar: ");
        int num = s.nextInt();
        int i = 0;
        while (i < a.length && a[i] != num){
            i++;
        }
        if (i == a.length){
            System.out.println("El numero no se encontro");
        } else {
            System.out.println("El numero se encontro en la posicion " + i);
        }
        */
        String[] a = new String[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print(i + ".- Ingrese un nombre: ");
            a[i] = s.next();
        }
        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre = s.next();
        int i = 0;
        while (i < a.length && !a[i].equalsIgnoreCase(nombre)){
            i++;
        }
        if (i == a.length){
            System.out.println("El nombre no se encontro");
        } else {
            System.out.println("El nombre se encontro en la posicion " + i);
        }
    }
}
