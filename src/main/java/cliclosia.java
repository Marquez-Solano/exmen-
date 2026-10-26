import java.util.Scanner;

public class cliclosia {

    public static void menu() {
        System.out.println("Calculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
    }

    public static void operacion(int opcion) {
        if (opcion < 1 || opcion > 5) {
            System.out.println("Opcion invalida");
            return;
        }

        if (opcion == 1) {
            System.out.println("Seleccionaste Suma");
        } else if (opcion == 2) {
            System.out.println("Seleccionaste Resta");
        } else if (opcion == 3) {
            System.out.println("Seleccionaste Multiplicacion");
        } else if (opcion == 4) {
            System.out.println("Seleccionaste Division");
        }
    } // <-- AQUÍ SE CIERRA EL MÉTODO operacion

    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 5) {
            menu();
            opcion = scanner.nextInt();
            operacion(opcion);
        }

        System.out.println("sali");
        scanner.close();
    }
}