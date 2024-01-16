package ED.Prac2;

public class Despegar {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1,1,2019);
        Persona Piloto1 = new Persona("Vicente","Coronel Diaz","39542154T","49 años");
        VueloImpl Vuelo1 = new VueloImpl("IB2349","(Madrid)",Piloto1,fecha1);
        System.out.println(Vuelo1);
    }
}
