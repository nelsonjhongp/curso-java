package Seccion12_Arreglos;

import java.util.Scanner;

public class PracticaArreglosDesplazarPosicion01 {
    public static void main(String[] args) {
        int [] lista = new int[]{1,2,3,4,5,6,7,8,9,10};
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.print("\nIngrese el nuevo numero: ");
            int numero = s.nextInt();
            nuevoNumero(lista, numero);
        }
    }

    public static void opcionDesplazamientoUno (){
        int[] lista = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] temportal = new int[lista.length];

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el numero a insertar: ");
        int nuevoNum = s.nextInt();
        System.out.println("lista.length = " + lista.length);

        loopBusqueda:
        for (int i = 0; i < lista.length; i++){
            System.out.println(i + ".- " + lista[i]);
            if (lista[i] >= nuevoNum){
                System.out.println("Encontrado en " + i + ".- nuevoNum: " + nuevoNum);
                System.out.println("Ahora loop j");
                for (int j = lista.length-1; i+1 < j; j--){
                    lista[j] = lista[j-1];
                    //System.out.println(j + ".- " + lista[j]);
                }
                lista[i+1] = nuevoNum;
                break loopBusqueda;
            }
        }

        System.out.println("La lista nueva es:");
        for (int i = 0; i < lista.length; i++){
            System.out.println(i + ".- " + lista[i]);
        }
    }

    public static void nuevoNumero (int [] lista, int numero) {
        for (int i = lista.length-1; i > 0; i--){
            lista[i] = lista[i-1];
        }
        lista[0] = numero;

        for (int i = 0; i < lista.length; i++){
            System.out.print(lista[i] + " | ");
        }
    }
}
