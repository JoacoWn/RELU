import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO: Implementar la lógica inicial y llamada a los métodos necesarios.
        menu();
        sc.close();
        System.out.println("Terminado ");
    }

    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion(0);
            if (opcion != -1) {
                ejecutarOpcion(opcion);
            }
        } while (opcion != 5);
    }

    public static void mostrarOpciones() {
        System.out.println("\n=============================");
        System.out.println("            RELU            ");
        System.out.println("      Opciones      ");
        System.out.println("============================= ");
        System.out.println("    [1] Agendar Reservas Logias      ");
        System.out.println("    [2] Eliminar Reservas Logias      ");
        System.out.println("    [3] Ver Reservas Logias      ");
        System.out.println("    [4] Ver Historial Reservas      ");
        System.out.println("    [5] Salir       ");


        System.out.println("============================= ");
        System.out.print("      Opcion: ");
    }

    public static int obtenerOpcion(int opcion) {
        try {
            opcion = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un numero valido");
            return -1; // Devolver un valor inválido para que no ejecute ninguna opción
        }
        return opcion;
    }

    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> {
                System.out.println("Opcion 1 ");
            }
            case 2 -> System.out.println("Opcion 2 ");
            case 3 -> System.out.println("Opcion 3 ");
            case 4 -> System.out.println("Opcion 4 ");
            case 5 -> System.out.println("Opcion 5 ");
            default -> System.out.println("Opción inválida...");
        }
    }
}
