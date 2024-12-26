package Seccion06_ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //Se puede comparar valores con objetos en caso Boolean!, sin problema como con Integer
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean2 == objBoolean));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean2.equals(objBoolean)));

        boolean primBoolean2 = objBoolean2.booleanValue();
    }
}
