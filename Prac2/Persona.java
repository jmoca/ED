package ED.Prac2;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String edad;
    public Persona(String nombre, String apellidos, String dni, String edad){
        this.nombre = nombre;
        this.apellidos =apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String toString(){
        return nombre+" "+apellidos+", "+dni+", "+edad+" ";
    }
}
