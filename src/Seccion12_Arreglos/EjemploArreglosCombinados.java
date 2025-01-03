package Seccion12_Arreglos;

public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a, b ,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++){
            b[i] = (i + 1) * 5;
        }

        int cadaCuanto = 2;
        int aux = 0;
        for (int i = 0; i < b.length; i+=cadaCuanto){
            for (int j = 0; j < cadaCuanto; j++){
                c[aux++] = a[i+j];
            }
            for (int k = 0; k < cadaCuanto; k++){
                c[aux++] = b[i+k];
            }
        }

        for (int i = 0; i < c.length; i++){
            System.out.println("c[" + i + "] = " + c[i]);
        }
    }
}
