package Seccion5_FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {
        System.out.println("- Iteracion de arreglo con numeros");
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num: numeros){
            System.out.println("Numeros impares = " + num);
        }

        System.out.println("- Iteracion de arreglo con nombres");
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        for (String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
