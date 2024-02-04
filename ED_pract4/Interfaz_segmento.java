package ED;

public interface Interfaz_segmento {
    Punto3D getExtremo1();
    Punto3D getExtremo2();
    void setExtremo1(Punto3D extremo1);
    void setExtremo2(Punto3D extremo2);
    double longitud();
}
