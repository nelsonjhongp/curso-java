package Seccion08_ClasesDateYCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.set(2020, 11, 25, 18, 20, 25);

        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, 8);
        calendario.set(Calendar.DATE, 22);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);

        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);

        //System.out.println("calendar = " + calendario);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        DateFormat df = new SimpleDateFormat("dd-MMMM-yyy, HH:mm:ss:SSS a");
        System.out.println(df.format(fecha));
    }
}
