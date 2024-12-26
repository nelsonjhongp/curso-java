package Seccion06_ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(32768);
        Integer intOjeto2 = 32768;

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjetto = intObjeto.longValue();
        System.out.println("longObjetto = " + longObjetto);
    }
}
