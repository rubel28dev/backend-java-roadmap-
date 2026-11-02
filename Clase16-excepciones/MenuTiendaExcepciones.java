
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTiendaExcepciones {


    public static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Agregar producto");
        System.out.println("2. Ver resumen");
        System.out.println("3. Salir");
    }

    public static void mostrarBienvenida(String nombreTienda) {
        System.out.println("==============================");
        System.out.println(nombreTienda);
        System.out.println("Bienvenido al sistema");
        System.out.println("==============================");
    }

    public static void mostrarDespedida() {
        System.out.println("Gracias por su compra");
    }

    public static void mostrarEnvioGratis() {
        System.out.println("¡Felicidades, calificas para envío gratis!");
    }

    public static void mostrarOpcionInvalida() {
        System.out.println("Opcion invalida");
    }

    public static void mostrarSolicitudOpcion() {
        System.out.println("Ingrese opcion: ");
    }

    public static void mostrarResumen(int productos, double total) {
        System.out.println("Productos agregados: " + productos);
        System.out.println("Total: " + total);
        if (total > 100) {
            mostrarEnvioGratis();
        }
    }

    public static double pedirPrecio(Scanner sc) {
        double precio = 0;
        do {
            try {
                System.out.println("Ingrese precio (debe ser mayor a 0): ");
                precio = sc.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida: escriba solo numeros.");
                sc.next();
            }
        } while (precio <= 0);
        return precio;
    }

    public static int pedirOpcion(Scanner sc) {
        int opcion = 0;
        boolean repetir = true;
        while (repetir) {
            try {
                mostrarSolicitudOpcion();
                opcion = sc.nextInt();
                if (opcion > 0 && opcion < 4) {
                    repetir = false;
                } else {
                    mostrarOpcionInvalida();
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida: escriba solo numeros.");
                sc.next();
            }
        }
        return opcion;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreTienda = "Tienda Work Out";
        int productos = 0;
        double total = 0;
        int opcion;
        mostrarBienvenida(nombreTienda);
        do {
            mostrarMenu();
            opcion = pedirOpcion(sc);
            if (opcion == 1) {
                double precio = pedirPrecio(sc);
                total += precio;
                productos++;
            } else if (opcion == 2) {
                mostrarResumen(productos, total);
            } else if (opcion == 3) {
                mostrarDespedida();
            }
        } while (opcion != 3);
    }
}
