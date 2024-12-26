package Seccion06_ClasesWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        //Comparando si el OBJETO nume 1 es igual a num2 que contiene el mismo OBJETO que num1
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("- Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;
        //Comparando si el OBJETO num 1 es igual a num2 con valor 1000
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // No se aplica comparar los valores si superan el valor de 128 con equals
        System.out.println("- Son el mismo objeto? " + (num1 == num2));
        System.out.println("- Tienen el mismo valor? " + (num1.equals(num2)));

        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);
    }
}
