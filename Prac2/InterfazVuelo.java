package ED.Prac2;


public interface InterfazVuelo {
    String getCod_Vuelo();
    String getDestino();
    Double getPrecio();
    void setPrecio(Double Precio);
    Integer getNum_Plazas();
    Integer getNum_Pasajeros();
    void setNum_Pasajeros(Integer Num_Pasajeros);
    Fecha getFecha_sali();


}
