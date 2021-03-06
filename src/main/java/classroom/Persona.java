package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this(nombre,1);
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    Persona(){
        this(0);
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
