package Seccion12_Arreglos;

import java.util.Formattable;
import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {
        double [] claseMatematicas, claseHistoria, claseLenguaje;
        int cantidadNotas = 7;
        int sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[cantidadNotas];
        claseHistoria = new double[cantidadNotas];
        claseLenguaje = new double[cantidadNotas];

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para Matematicas:");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas de estudiantes para Historia:");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje:");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < cantidadNotas; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasLenguaje += claseLenguaje[i];
            sumNotasHistoria += claseHistoria[i];
        }

        double promMatematicas = sumNotasMatematicas/cantidadNotas;
        double promHistoria = sumNotasHistoria/cantidadNotas;
        double promLenguaje = sumNotasLenguaje/cantidadNotas;

        System.out.println("Promedio clase Matematicas: " + (promMatematicas));
        System.out.println("Promedio clase Historia: " + (promHistoria));
        System.out.println("Promedio clase Lenguaje: " + (promLenguaje));
        System.out.println("Promedio total de los cursos: "
                + ((promMatematicas + promHistoria + promLenguaje)/3));

        System.out.println("Ingrese el identificador del alumno (de 0-6): ");
        int id = s.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id])/3;
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);
    }
}
