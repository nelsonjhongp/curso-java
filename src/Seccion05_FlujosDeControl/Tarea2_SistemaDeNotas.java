package Seccion05_FlujosDeControl;

import java.util.Scanner;

public class Tarea2_SistemaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanioNotas = 20;
        double[] notas = new double[tamanioNotas];
        for (int i = 0; i < notas.length; i++){
            System.out.print((i+1) + ".- Ingresar la nota: ");
            double nota = sc.nextDouble();

            if (nota >= 1 && nota <=7){
                notas[i] = nota;
            } else if (nota == 0){
                System.out.println("ERROR 0!!");
                System.exit(1);
            } else {
                System.out.println("Nota " + nota + " esta fuera del rango (1-7), intentar de nuevo");
                i--;
            }
        }
        double promedioSuperior = 0;
        double promedioInferior = 0;

        int cantidadSuperior = 0;
        int cantidadInferior = 0;

        for (double nota:notas){
            if (nota > 5){
                promedioSuperior += nota;
                cantidadSuperior++;
            } else {
                promedioInferior += nota;
                cantidadInferior++;
            }
        }

        promedioSuperior /= cantidadSuperior;
        promedioInferior /= cantidadInferior;

        System.out.println("El promedio de las notas inferiores es de: " + promedioInferior);
        System.out.println("El promedio de las notas superiores es de: " + promedioSuperior);
    }
}
