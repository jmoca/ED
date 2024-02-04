package ED_pract4;


public class Punto3D implements Punto3D_interfaz {
    private Double x;
    private Double y;
    private Double z;

    public Punto3D(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        if (x == null || y == null || z == null) {
            System.out.println("Error: no se puede crear un punto con coordenadas nulas");
            // Asignar un valor predeterminado en caso de coordenadas nulas
            this.x = 0.0;
            this.y = 0.0;
            this.z = 0.0;
        } else {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
        // operador || es para hacer un or
        // operador && es para hacer un and
    }

    public double distancia(Punto3D otroPunto) {
        double dx = this.x - otroPunto.x;
        double dy = this.y - otroPunto.y;
        double dz = this.z - otroPunto.z;
        //sqrt es para hacer la raiz cuadrada
        return Math.sqrt(dx * dx + dy * dy + dz * dz);

    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
