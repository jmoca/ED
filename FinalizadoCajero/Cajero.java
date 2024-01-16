import java.util.Scanner;

public class Cajero {

    float saldo;
    float tope;
    int conta = 0;

    // Constructor de la clase
    public Cajero(float saldo, float tope) {
        this.saldo = saldo;
        this.tope = tope;
    }

    // Método para mostrar el menú y obtener la opción del usuario
    public void Menu() {
        System.out.println("\n\t\t\tMenú de Opciones");
        System.out.println("\t\t\t================");
        System.out.println("\n1) Retirada de dinero");
        System.out.println("2) Ingreso de dinero");
        System.out.println("3) Salir");
        System.out.print("\t\tOpción: ");
    }

    // Método para realizar una retirada de dinero
    public void retirar() {
        float usu_retira;
        Scanner teclado = new Scanner(System.in);
        verif_saldo(saldo);
        System.out.println("Teclee dinero a retirar: ");
        usu_retira = teclado.nextFloat();

        // Verificar si la cantidad a retirar es menor o igual al saldo
        if (usu_retira <= saldo) {
            // Verificar tope solo si la cantidad a retirar es menor o igual al tope
            if (usu_retira <= tope) {
                System.out.println("Usted retiró " + usu_retira + "€");
                tope = verif_tope(usu_retira, tope);
                // Restar la cantidad retirada al saldo
                saldo = saldo - usu_retira;
            } else {
                System.out.println("Intenta retirar " + usu_retira + "€");
                System.out.println("Tiene establecido ahora un tope de " + tope + "€");
            }
            // Mostrar el saldo después de la retirada
            verif_saldo(saldo);
        } else {
            System.out.println("No puedes retirar dinero, tendrías saldo negativo");
        }
    }

    // Método para realizar un depósito de dinero
    public void depositar() {
        Scanner teclado = new Scanner(System.in);
        verif_saldo(saldo);
        System.out.println("Teclee dinero a ingresar: ");
        float usu_deposita = teclado.nextFloat();
        System.out.println("Usted ingresó " + usu_deposita + "€");
        // Mostrar el saldo después del depósito
        saldo = saldo + usu_deposita;
        verif_saldo(saldo);
    }

    // Método para verificar el tope de retirada
    public float verif_tope(float usu_retira, float tope) {

        if (usu_retira <= tope) {
            // Verificar si es la primera vez que se retira
            if (conta == 0) {
                tope = tope - usu_retira;
                conta += 1;
            } else {
                tope = tope - usu_retira;
                System.out.println("Tiene establecido ahora un tope de " + tope + "€");
            }
        } else {
            System.out.println("Tiene establecido ahora un tope de " + tope + "€");
        }
        return tope;
    }
    // Método para mostrar el saldo "en ese momento"
    public void verif_saldo(float saldo) {
        System.out.println("Su saldo actual es de " + saldo + "€");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int saldo = Integer.parseInt(args[0]);
        int tope = Integer.parseInt(args[1]);
        // Crear una instancia de la clase Cajero
        Cajero cajero_auto = new Cajero(saldo, tope);
        System.out.println("\t\t\u001B[4mPROGRAMA CAJERO AUTOMÁTICO\u001B[0m");
        String opcion;
        do {
            cajero_auto.Menu();
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1" -> cajero_auto.retirar();
                case "2" -> cajero_auto.depositar();
                case "3" -> System.out.println("Saliendo del programa de cajero automático ...");
                default -> System.out.println("Por favor, introduce una opción válida (1-3)");
            }
        } while (!opcion.equals("3")); // Cambiado a .equals() para comparar cadenas

    }
}