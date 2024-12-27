package Seccion09_ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        String ruta = "src/Seccion09_ClaseSystem/config.properties";
        try {
            FileInputStream archivo = new FileInputStream(ruta);

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);
            Properties ps = System.getProperties();
            ps.list(System.out);

            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));


        } catch (FileNotFoundException e) {
            System.err.println("No existet el archivo = " + e);
            System.exit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
