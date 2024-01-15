package ED.Prac2;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String edad;

    public String toString(){
        return nombre+apellidos+","+dni+edad;
    }
}
