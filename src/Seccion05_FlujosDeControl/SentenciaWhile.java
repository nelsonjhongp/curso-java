package Seccion05_FlujosDeControl;

public class SentenciaWhile {
    public static void main(String[] args) {
        System.out.println("Prueba while con incremento de i");
        int i = 0;
        while (i < 5){
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Prueba while con boolean");
        i = 0;
        boolean prueba = true;
        while (prueba) {
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Prueba do while con boolean");
        prueba = true;
        i = 0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);
    }
}
