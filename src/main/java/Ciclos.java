import java.util.Scanner;
public class Ciclos {
    public static void menu() {
        System.out.println("Calculadora");
        System.out.println("Suma");
        System.out.println("Resta");
        System.out.println("Multiplicacion");
        System.out.println("Division");
        System.out.println("Salir");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double num1, num2, resultado;

        while (opcion != 5) {
            menu();
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                System.out.print("Ingresa un número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingresa un número: ");
                num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println(" Resultado de la Suma: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println(" Resultado de la Resta: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado de la Multiplicación: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println(" Resultado de la División: " + resultado);
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Salir");
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}

