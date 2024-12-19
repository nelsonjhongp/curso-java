package Seccion04_Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "michi";
        passwords[2] = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();
        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;
        }

        /*
        for(int i = 0; i < usernames.length; i++){
            if ((usernames[i].equals(u) && passwords[i].equals(p))){
                esAutenticado = true;
                break;
            }
        }
        * */

        String mensaje = esAutenticado? "Bienvenido usuario ".concat(u).concat("!"):"Username o contraseña incorrecta!";
        System.out.println(mensaje);
    }
}
