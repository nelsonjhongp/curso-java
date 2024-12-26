package Seccion04_Operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 28;
        System.out.println("- Valores");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        System.out.println("\n- Promedios:");

        double promedio = i + j + k / 3d;
        System.out.println("i + j + k / 3 = " + promedio);

        promedio = (i + j + k) / 3d;
        System.out.println("(i + j + k) / 3 = " + promedio);

        promedio = (i + j + k) / 3d * 10;
        System.out.println("(i + j + k) / 3d * 10 = " + promedio);

        promedio = ++i + j-- + k / 3d * 10;
        System.out.println("++i + j-- + k / 3d * 10 = " + promedio);
    }
}
