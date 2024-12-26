package Seccion05_FlujosDeControl;

public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {
        System.out.println("- Prueba de interrupcion de bucle 1 -");
        bucle1: for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == 2){
                    System.out.println("Cuando i = 2  se omite");
                    continue bucle1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("- Prueba de interrupcion de bucle 2 -");
        etiqueta: for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == 2){
                    System.out.println("Cuando i = 2  se detiene el bucle");
                    break etiqueta;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("- Prueba de interrupcion de bucle de dias laborales con horas -");
        bucle1: for (int i = 0; i <= 7; i++){
            int j = 1; // j es horas
            while (j <= 8){
                if (i == 6 || i == 7){
                    System.out.println("Dia " + i + ": de descanso de fin de semana!");
                    continue bucle1;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs.");
                j++;
            }
        }
    }
}