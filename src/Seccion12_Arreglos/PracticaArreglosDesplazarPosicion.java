package Seccion12_Arreglos;

import java.util.Scanner;

public class PracticaArreglosDesplazarPosicion {
    public static void main(String[] args) {
        int[] lista = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] temportal = new int[lista.length];

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el numero a insertar: ");
        int nuevoNum = s.nextInt();
        System.out.println("lista.length = " + lista.length);

        boolean encontrado = false;
        for (int i = 0; i < lista.length; i++){
            System.out.println(i + ".- " + lista[i]);
            if (encontrado) {
                lista[i] = lista[i-1];
            }
            if (lista[i] >= nuevoNum && !encontrado){
                System.out.println(i + ".- nuevoNum: " + nuevoNum);
                encontrado = true;
            }
        }
        /*
        System.out.println("La lista nueva es:");
        for (int i = 0; i < lista.length; i++){
            System.out.println(i + ".- " + lista[i]);
        }*/
    }
}
