import java.util.Scanner;

public class MenuTiendaRetorno {

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
        double precio;
        do {
            System.out.println("Ingrese precio (debe ser mayor a 0): ");
            precio = sc.nextDouble();
        } while (precio <= 0);
        return precio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreTienda = "Tienda Work Out";
        int productos = 0;
        int opcion;
        double total = 0;
        mostrarBienvenida(nombreTienda);
        do {
            mostrarMenu();
            mostrarSolicitudOpcion();
            opcion = sc.nextInt();
            if (opcion == 1) {
                double precio = pedirPrecio(sc);
                total += precio;
                productos++;
            } else if (opcion == 2) {
                mostrarResumen(productos, total);
            } else if (opcion == 3) {
                mostrarDespedida();
            } else {
                mostrarOpcionInvalida();
            }
        } while (opcion != 3);
    }
}
