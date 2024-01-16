package ED.Prac2;

public class VueloImpl implements InterfazVuelo{
    // Atributos
    private String Cod_Vuelo;
    private String Destino;
    private Double Precio;
    private Integer Num_Plazas;
    private Integer Num_Pasajeros;
    private Fecha Fecha_sali;
    private Double Recaudcion;
    private Persona Piloto;

    //Constructor
    public VueloImpl(String Cod_Vuelo,String Destino, Persona Piloto, Fecha Fecha_sali){
        this.Cod_Vuelo = Cod_Vuelo;
        this.Destino = Destino;
        this.Piloto = Piloto;
        this.Fecha_sali =Fecha_sali;
    }

    //Get y Set
    public String getCod_Vuelo(){
        return Cod_Vuelo;
    }
    public String getDestino(){
        return Destino;
    }
    public Double getPrecio(){
        return Precio;
    }
    public void setPrecio(Double Precio){
        Precio = Precio;
    }
    public Integer getNum_Plazas(){
        return Num_Plazas;
    }
    public Integer getNum_Pasajeros(){
        return Num_Pasajeros;
    }


    public void setNum_Pasajeros(Integer Num_Pasajeros){
        Num_Pasajeros = Num_Pasajeros;
    }
    public Fecha getFecha_sali(){
        return Fecha_sali;
    }
    public Persona getPiloto(){
        return Piloto;
    }
    public void setPiloto(Persona Piloto){
        Piloto = Piloto;
    }

    public String toString(){
        return Cod_Vuelo+" "+Destino+"-"+getPiloto()+getFecha_sali();
    }
}
