package Seccion04_Operadores;

import java.util.Scanner;

public class Tarea1_OrdenarNumeros {
    public static void main(String[] args) {
        //Mostrar ordenados dos números
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        String mensaje;

        mensaje = numero1 > numero2 ? (numero1 + " es mayor que "+ numero2) : (numero2 + " es mayor que "+ numero1);
        mensaje = numero1 == numero2 ? ("Ambos numeros ("+ numero1 +" y "+ numero2 +") son iguales") : mensaje;

        System.out.println(mensaje);
    }
}
