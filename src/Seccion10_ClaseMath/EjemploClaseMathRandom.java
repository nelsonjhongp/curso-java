package Seccion10_ClaseMath;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        for (int i = 0; i < 100; i++){
            double random = Math.random();
            //System.out.println("random = " + random);
            random*= colores.length;
            //System.out.println("random = " + random);
            random = Math.floor(random);
            System.out.println(i + ".- " + random + " color: " + colores[(int) random]);
        }
    }
}
