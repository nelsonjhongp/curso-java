package Seccion05_FlujosDeControl;

public class SentenciaForJava {
    public static void main(String[] args) {
        System.out.println("- Incremento de i");
        for (int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }

        System.out.println("- Decremento de i");
        for (int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        System.out.println("- Incremento de i y decremento de j");
        for (int i = 1, j = 10; i < j; i++, j--){
            System.out.println("i:"+ i + " - j:" + j);
        }

        System.out.println("- Cuando el residuo de 2 es 0");
        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }
        /* Alternativa
        int i = 0;
        for (;;){
            if (i <= 5){
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("i = " + i);
        */
    }
}
