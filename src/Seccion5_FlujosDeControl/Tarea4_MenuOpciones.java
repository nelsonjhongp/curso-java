package Seccion5_FlujosDeControl;

import javax.swing.*;
import java.util.Scanner;

public class Tarea4_MenuOpciones {
    public static void main(String[] args) {
        String producto = "Computadora";
        boolean salir = false;
        do {
            String mensaje = "- Eliga la opcion para el producto, ingrese numero: " +
                    "\nActualizar \t: 1" +
                    "\nEliminar \t: 2" +
                    "\nAgregar \t: 3" +
                    "\nListar \t\t: 4" +
                    "\nSalir \t\t: 5";
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

            switch (opcion){
                case 1:
                    //Actualizar nombre de producto
                    producto = JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto");
                    JOptionPane.showMessageDialog(null, "Ahora el producto se llama " + producto + "!");
                    break;
                case 2:
                    //Eliminar producto
                    JOptionPane.showMessageDialog(null, "Producto eliminado con exito!");
                    producto = "Null.";
                    break;
                case 3:
                    //Agregar
                    producto = JOptionPane.showInputDialog("Ingrese el producto a agregar");
                    JOptionPane.showMessageDialog(null, "Nuevo producto es " + producto + "!");
                    break;
                case 4:
                    //listar
                    JOptionPane.showMessageDialog(null, "La lista de producto contiene " + producto + "!");
                    break;
                case 5:
                    //Salir
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}
