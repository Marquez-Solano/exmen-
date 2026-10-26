import java.util.Scanner;

public class calificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlumnos = 0;
        double sumaCalificaciones = 0.0;
        char respuesta;

        System.out.println(" REGISTRO DE CALIFICACIONES ");

        do {
            double calificacion = solicitarCalificacionValidada(scanner);
            sumaCalificaciones += calificacion;
            totalAlumnos++;

            System.out.print("¿Desea registrar otra calificación? (S/N): ");
            respuesta = solicitarRespuestaSN(scanner);
            System.out.println();

        } while (respuesta == 'S' || respuesta == 's');

        mostrarResumen(totalAlumnos, sumaCalificaciones);
        scanner.close();
    }


    public static double solicitarCalificacionValidada(Scanner scanner) {
        double cal;
        while (true) {
            System.out.print("Ingrese la calificación del alumno (0 a 10): ");
            if (scanner.hasNextDouble()) {
                cal = scanner.nextDouble();
                if (esCalificacionValida(cal)) {
                    return cal;
                }
            } else {
                scanner.next();
            }
            System.out.println("Calificación inválida.");
        }
    }

    public static boolean esCalificacionValida(double calificacion) {
        return calificacion >= 0.0 && calificacion <= 10.0;
    }


    public static double calcularPromedio(double suma, int cantidad) {
        if (cantidad == 0) {
            return 0.0;
        }
        return suma / cantidad;
    }

    public static void mostrarResumen(int totalAlumnos, double sumaCalificaciones) {

        System.out.println("          RESUMEN DE RESULTADOS           ");
        System.out.println("Total de alumnos registrados : " + totalAlumnos);
        System.out.printf("Suma de calificaciones       : %.2f\n", sumaCalificaciones);

        if (totalAlumnos > 0) {
            double promedio = calcularPromedio(sumaCalificaciones, totalAlumnos);
            System.out.printf("Promedio general             : %.2f\n", promedio);
        } else {
            System.out.println("Promedio general             : N/A (Sin registros)");
        }

    }

    public static char solicitarRespuestaSN(Scanner scanner) {
        char resp = scanner.next().charAt(0);
        while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n') {
            System.out.print("Respuesta no válida. Ingrese 'S' para Sí o 'N' para No: ");
            resp = scanner.next().charAt(0);
        }
        return resp;
    }
}