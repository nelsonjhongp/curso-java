package Seccion03_TipoString;

import java.util.Scanner;
public class TAREA {
    public static void main(String[] args) {
        //Considerando Padre = 0; Madre = 1; Hermana = 2;
        String[] nombresFamilia = new String[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de tu padre: ");
        nombresFamilia[0] = scanner.nextLine();

        System.out.println("Ingrese el nombre de tu madre: ");
        nombresFamilia[1] = scanner.nextLine();

        System.out.println("Ingrese el nombre de tu hermana: ");
        nombresFamilia[2] = scanner.nextLine();

        for (int i = 0; i < nombresFamilia.length; i++){
            nombresFamilia[i] = String.valueOf(nombresFamilia[i].charAt(1)).toUpperCase() +
                                "." +
                                nombresFamilia[i].substring(nombresFamilia[i].length()-2);
        }
        String textoFamilia = nombresFamilia[0] + "_" + nombresFamilia[1] + "_" + nombresFamilia[2];
        System.out.println("textoFamilia = " + textoFamilia);
    }
}
