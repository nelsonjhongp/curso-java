package Seccion12_Arreglos;

import javax.swing.*;
import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];

        int tamano = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        System.out.println("----- Usando for -----");
        Arrays.sort(productos);//Ordenamos
        for (int i = 0; i < tamano; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("----- Usando foreach -----");
        for (String prod: productos){
            System.out.println("Producto = " + prod);
        }

        System.out.println("----- Usando while -----");
        int i = 0;
        while (i < tamano){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("----- Usando do while -----");
        int j = 0;
        do {
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        } while (j < tamano);

        //Iniciamos el arreglo del numero
        int[] numeros = new int[10];
        int totalNumeros = numeros.length;

        //Rellenamos el arreglo
        for (int k = 0; k < totalNumeros; k++){
            numeros[k] = k;
        }

        //Mostramos en consola el arreglo
        for (int k = 0; k < totalNumeros; k++){
            System.out.println("Numeros : " + numeros[k]);
        }

    }
}
