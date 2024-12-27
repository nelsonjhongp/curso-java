package Seccion10_ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        System.out.println("------ Redondeando ------");
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
        
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(2,3);
        System.out.println("potencia : Math.pow(2,3) = " + potencia);

        double raiz = Math.sqrt(16);
        System.out.println("Raiz de 16: " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(180) = " + Math.cos(radianes));
    }
}
