package Seccion5_FlujosDeControl;

import java.util.Scanner;

public class Tarea3_MultiplicarSinSimbolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        boolean signoNumero1 = numero1 > 0 ? true : false;
        boolean signoNumero2 = numero2 > 0 ? true : false;

        int multiplicacion = 0;
        for (int i = 0; i < Math.abs(numero1); i++){
            multiplicacion+=Math.abs(numero2);
        }

        if ((signoNumero1 == true && signoNumero2 == false) || (signoNumero1 == false && signoNumero2 == true)){
            multiplicacion = -multiplicacion;
        }
        System.out.println("La multiplicacion de : " + numero1 + " y " + numero2 + " es de : " + multiplicacion);
    }
}
