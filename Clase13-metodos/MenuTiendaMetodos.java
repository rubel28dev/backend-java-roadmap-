import java.util.Scanner;

public class MenuTiendaMetodos {
    public static void mostrarMenu() {
        System.out.println("=== TIENDA ===");
        System.out.println("1. Agregar producto");
        System.out.println("2. Ver resumen");
        System.out.println("3. Salir");
    }
    public static void mostrarBienvenida() {
        System.out.println("==============================");
        System.out.println("TIENDA VIRTUAL");
        System.out.println("Bienvenido al sistema");
        System.out.println("==============================");
    }
    public static void mostrarDespedida() {
        System.out.println("Gracias por su compra");
    }
    public static void mostrarSolicitudPrecio() {
        System.out.println("Ingrese precio (debe ser mayor a 0): ");
    }
    public static void mostrarEnvioGratis() {
        System.out.println("¡Felicidades, calificas para envío gratis!");
    }
    public static void mostrarOpcionInvalida(){
        System.out.println("Opcion invalida");
    }
    public static void mostrarSolicitudOpcion(){
        System.out.println("Ingrese opcion: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productos = 0;
        double total = 0;
        int opcion;
        mostrarBienvenida();
        do {
            mostrarMenu();
            mostrarSolicitudOpcion();
            opcion = sc.nextInt();
            if (opcion == 1) {
                double precio = 0;
                while (precio <= 0){
                    mostrarSolicitudPrecio();
                    precio = sc.nextDouble();
                }
                total += precio;
                productos++;
            } else if (opcion == 2) {
                System.out.println("Productos agregados: " + productos);
                System.out.println("Total: " + total);
                if (total > 100){
                    mostrarEnvioGratis();
                }
            } else if (opcion == 3) {
                mostrarDespedida();
            } else {
                mostrarOpcionInvalida();
            }
        } while(opcion != 3);
    }
}
