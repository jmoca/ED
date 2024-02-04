public interface Cancion {
    String getNombre();
    String getInterprete();
    Integer getDuracion();
    Fecha getFechaLanzamiento();
    String getGenero();
    Integer getNumReprod();
    void setNumReprod(Integer n);
    Double getCalificacion();
    void setCalificacion(Double c);
    Boolean getReproducir();
    void setReproducir(Boolean r);
}
