package Seccion08_ClasesDateYCalendar;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tarea01_CalcularEdad {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Calendar fechaActual = Calendar.getInstance();
        try {
            Calendar fechaNacimiento = Calendar.getInstance();
            fechaNacimiento.setTime(formato.parse(JOptionPane.showInputDialog(null, "Ingrese fecha de nacimiento en formato (yyyy-MM-dd)")));

            int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
            System.out.println("Su edad es de = " + edad);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
