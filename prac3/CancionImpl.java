import jdk.internal.org.objectweb.asm.tree.analysis.Interpreter;

import javax.swing.event.CaretListener;
import java.util.Calendar;

public class CancionImpl implements Cancion{
    private String nombre;
    private String interprete;
    private Integer duracion;
    private Fecha fechaSalida;
    private String genero;
    private Integer numReproducciones;
    private Double calificacion;
    private Boolean reproducir;

    public CancionImpl(){

    }
    public CancionImpl(String nom, String in, Double cal){
        nombre=nom;
        interprete=in;
        if(cal<0.0 || cal >10.0){
            System.out.println("El valor es incorrecto.");
            calificacion = 0.0;
        }else{
            calificacion=cal;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public String getInterprete() {
        return interprete;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Fecha getFechaLanzamiento() {
        return fechaSalida;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getNumReprod() {
        return numReproducciones;
    }

    public void setNumReprod(Integer n) {
        numReproducciones=n;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double c) {
        if(c<0.0 || c >10.0){
            System.out.println("La calificación es incorrecta.");
            calificacion = 0.0;
        }else{
            calificacion=c;
        }
    }

    public Boolean getReproducir() {
        return reproducir;
    }

    public void setReproducir(Boolean r) {
        reproducir=r;
    }

    public String toString(){
        return "["+getNombre()+", "+getInterprete()+"]";
    }
}
