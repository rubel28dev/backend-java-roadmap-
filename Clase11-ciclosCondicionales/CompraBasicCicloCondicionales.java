import java.util.Scanner;
public class CompraBasicCicloCondicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productos = 0;
        double total = 0;
        int opcion;
        do {
            System.out.println("=== TIENDA ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver resumen");
            System.out.println("3. Salir");

            System.out.println("Ingrese opcion: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                double precio = 0;
                while (precio <= 0){
                System.out.println("Ingrese precio (debe ser mayor a 0): ");
                precio = sc.nextDouble();
                }
                total += precio;
                productos++;
            } else if (opcion == 2) {
                System.out.println("Productos agregados: " + productos);
                System.out.println("Total: " + total);
                if (total > 100){
                    System.out.println("¡Felicidades, calificas para envío gratis!");
                }
            } else if (opcion == 3) {
                System.out.println("Gracias por su compra");
            } else {
                System.out.println("Opcion invalida");
            }
        } while(opcion != 3);
    }
}
