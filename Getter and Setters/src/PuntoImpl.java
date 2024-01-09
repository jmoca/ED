public class PuntoImpl implements Punto{
    //1º variables
    private Double x;
    private Double y;
    //2º constructor
    public PuntoImpl(Double x1,Double y1 ){
        this.x = x1;
        this.y = y1;
    }
    //3º getters y setters
    public Double getX(){
        return x;
    }
    public void setX(Double x1){
        x  = x1;
    }
    public Double getY(){
        return y;
    }
    public void setY(Double y1){
        y  = y1;
    }
    //4º toString
    public String toString(){
         return "("+x+", "+y+")";
    }
}
