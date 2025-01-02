package Seccion12_Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        //String[] productos = new String[7];



        String[] productos = {"Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4ta generacion",
                "Bicicleta Oxford"};

        int tamano = productos.length;
        /*
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";
        */
        Arrays.sort(productos);
        System.out.println("---- Usando for ----");
        for (int i = 0; i < tamano; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("---- Usando for inverso ----");
        for (int i = 0; i < tamano; i++){
            System.out.println("Para indice " + (tamano-1-i) + " : " + productos[tamano-1-i]);
        }

        System.out.println("---- Usando for inverso 2 ----");
        for (int i = tamano - 1; i >= 0; i--){
            System.out.println("Para indice " + (i) + " : " + productos[i]);
        }
    }
}
