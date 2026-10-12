import java.util.Scanner;

public class PreciosTiendaMetodos {
    public static void mostrarPrecios (double [] precios){
        System.out.println("Precios ingresados: ");
        for (int i = 0; i<precios.length; i++){
            System.out.println(precios[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] precios = new double[5];
        for (int i = 0; i < precios.length; i++) {
            double precio = 0;
            while (precio <= 0) {
                System.out.println("inserta precio " + (i + 1) + " (debe ser mayor a 0): ");
                precio = sc.nextDouble();
            }
            precios[i] = precio;
        }
        double total = 0;
        for (int i=0; i<precios.length; i++){
            total += precios[i];
        }
        double precioCaro = precios[0];
        for (int i=0; i < precios.length; i++){
            if (precioCaro < precios[i]){
                precioCaro = precios[i];
            }
        }

        System.out.println("Total: " +total);
        mostrarPrecios (precios);
        System.out.println("Precio mas caro: " + precioCaro);
    }
}
