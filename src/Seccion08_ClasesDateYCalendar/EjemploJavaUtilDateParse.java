package Seccion08_ClasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese una fecha con formato yyyy-MM-dd: ");
        try {
            Date fecha = format.parse(sc.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            System.out.println("- Comparacion con fecha actual: ");
            if (fecha.after(fecha2)){
                System.out.println(format.format(fecha)  + " es mayor que la fecha actual " + format.format(fecha2) + "");
            } else if (fecha2.after(fecha)){
                System.out.println(format.format(fecha) + " es menor que la fecha actual " + format.format(fecha2) + "");
            } else if (fecha2.equals(fecha)){
                System.out.println("Las fechas son iguales");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
