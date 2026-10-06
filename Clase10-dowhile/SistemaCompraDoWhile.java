import java.util.Scanner;
public class SistemaCompraDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double total = 0;
        double precio;
        do {
            System.out.println("=== TIENDA ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver total");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            if(opcion == 1) {
                System.out.println("Ingrese precio: ");
                precio = sc.nextDouble();
                total += precio;
            } else if(opcion == 2) {
                System.out.println("Total compra: " + total);
            }  else if(opcion == 3) {
                System.out.println("Compra finalizada");
            } else {
                System.out.println("Opcion invalida");
            }

        } while (opcion != 3);
    }
}
