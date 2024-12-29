package Seccion10_ClaseMath;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        int tamaño = 5;
        for (int i = 0; i < tamaño; i++){
            double random = Math.random();
            //System.out.println("random = " + random);
            random*= colores.length;
            //System.out.println("random = " + random);
            random = Math.floor(random);
            System.out.println(i + ".- " + random + " color: " + colores[(int) random]);
        }

        Random randomObj = new Random();
        //long randomLong = randomObj.nextLong();
        //System.out.println("randomLong = " + randomLong);
        //Seria desde 25-15, o sea desde 0 hasta 10, pero al sumarle 15, seria entonces desde 15 hasta 25
        int randomInt = 15 + randomObj.nextInt(25-15);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);

    }
}
