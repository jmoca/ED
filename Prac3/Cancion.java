public class Cancion implements  InterfazCancion{
    private String Nombre;
    private  String Interprete;
    private  Integer Duracion;
    private  Fecha   Fecha_Lanzamiento;
    private  String Genero;
    private  Integer NumeroDeReproducciones;
    private Double Calificacion;
    private Boolean Reproducir;

    public Cancion(String Nombre, String Interprete,Double calificacion){
        this.Nombre =Nombre;
        this.Interprete =Interprete;
        if (Calificacion<=10 && Calificacion>=0 ){
            this.Calificacion = calificacion;
        }else {
            System.out.println("Error.Introduce un valor del 0 al 10");
            System.out.println("Valor por defecto = 0");
            this.Calificacion = (double) 0;
        }
    }
    public String getNombre(){
        return Nombre;
    }
    public String getInterprete() {
        return Interprete;
    }
    public Integer getDuracion(){
        return Duracion;
    }
    public String getGenero(){
        return Genero;
    }
    public  Integer getNumeroDeReproducciones(){
        return NumeroDeReproducciones;

    }

    public void setNumeroDeReproducciones(Integer numeroDeReproducciones) {
        NumeroDeReproducciones = numeroDeReproducciones;
    }

    public Double getCalificacion(){

        return Calificacion;
    }
    private void setCalificacion(Double calificacion){
        if (Calificacion<=10 && Calificacion>=0 ){
            Calificacion = calificacion;
        }else {
            System.out.println("Error.Introduce un valor del 0 al 10");
            System.out.println("Valor por defecto = 0");
            this.Calificacion = (double) 0;
        }
    }

    public Boolean getReproducir() {
        return Reproducir;
    }

    public void setReproducir(Boolean reproducir) {
        Reproducir = reproducir;
    }
    public String toString(){
        return " "+getNombre()+getInterprete();
    }

}