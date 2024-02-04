package ED;



public class Segmento implements Interfaz_segmento {
    private Punto3D extremo1;
    private Punto3D extremo2;

    public Segmento(Punto3D extremo1, Punto3D extremo2) {
        this.extremo1 = extremo1;
        this.extremo2 = extremo2;
    }

    public Punto3D getExtremo1() {
        return extremo1;
    }

    public void setExtremo1(Punto3D extremo1) {
        this.extremo1 = extremo1;
    }

    public Punto3D getExtremo2() {
        return extremo2;
    }

    public void setExtremo2(Punto3D extremo2) {
        this.extremo2 = extremo2;
    }

    public double longitud() {
        double dx = extremo2.getX() - extremo1.getX();
        double dy = extremo2.getY() - extremo1.getY();
        double dz = extremo2.getZ() - extremo1.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        return "[" + extremo1 + ", " + extremo2 + "]";
    }
}
