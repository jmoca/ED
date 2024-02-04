package ED_pract4;


public class Test_punto {
    public static void main(String[] args) {
        // Crear puntos en 3D
        Punto3D punto1 = new Punto3D(0, 0, 0);
        Punto3D punto2 = new Punto3D(1, 1, 1);
        Punto3D punto3 = new Punto3D(2, 3, 4);

        // Imprimir coordenadas de los puntos
        System.out.println("Coordenadas de los puntos:");
        System.out.println("Punto1: " + punto1);
        System.out.println("Punto2: " + punto2);
        System.out.println("Punto3: " + punto3);

        // Calcular distancia entre puntos
        System.out.println("\nDistancia entre puntos:");
        System.out.println("Distancia entre Punto1 y Punto2: " + punto1.distancia(punto2));
        System.out.println("Distancia entre Punto1 y Punto3: " + punto1.distancia(punto3));
        System.out.println("Distancia entre Punto2 y Punto3: " + punto2.distancia(punto3));

        // Crear segmento
        Segmento segmento = new Segmento(punto1, punto2);

        // Imprimir extremos del segmento y su longitud
        System.out.println("\nExtremos y longitud del segmento:");
        System.out.println("Extremo1: " + segmento.getExtremo1());
        System.out.println("Extremo2: " + segmento.getExtremo2());
        System.out.println("Longitud del segmento: " + segmento.longitud());
    }
}
