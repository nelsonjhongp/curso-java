package Seccion07_ValoresVersusReferencia;
class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String conseguirNombre(){
        return nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("persona = " + persona.conseguirNombre());

        test(persona);

        System.out.println("persona = " + persona.conseguirNombre());
    }

    public static void test(Persona persona) {
        persona.modificarNombre("Pepe");
    }
}
