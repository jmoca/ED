package ED;

public interface Punto3D_interfaz {
    double getX();
    double getY();
    double getZ();
    void setX(double x);
    void setY(double y);
    void setZ(double z);
    double distancia(Punto3D otroPunto);
}
