package Seccion12_Arreglos;

import java.util.Scanner;

public class PracticaArreglosDesplazarPosicion02 {
    public static void main(String[] args) {
        int tamanio = 10;
        int[] lista = new int[tamanio];

        //Ingreso de numeros a la lista
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++){
            System.out.print("Ingrese numero: ");
            lista[i] = s.nextInt();

        }

        //Indicamos el numero y posicion a ingresar a la lista
        int posicion = 0, numero = 0;
        System.out.print("- Digite el numero a ingresar: ");
        numero = s.nextInt();


        while (true){
            System.out.print("- Digite la posicion donde ingresar: ");
            posicion = s.nextInt();
            if (posicion < 0 || posicion > lista.length){
                System.out.println("!!POSICION FUERA DEL RANGO, VUELVA A INGRESAR!!");
            } else {
                break;
            }
        }

        //Iniciamos el algoritmo para ingresar el numero y desplazar los siguientes elementos
        for (int i = lista.length-1; i > posicion; i--){
            lista[i] = lista[i-1];
        }
        //Ahora agregaos el numero en la posicion de lista
        lista [posicion] = numero;

        //Mostrando la lista
        System.out.println("Visualizacion de la lista:");
        for (int i = 0; i < lista.length; i++){
            if (posicion == i) {
                System.out.println("lista[" + i + "] = " + lista[i] + " <- Nuevo");
            } else {
                System.out.println("lista[" + i + "] = " + lista[i]);
            }
        }
    }
}
