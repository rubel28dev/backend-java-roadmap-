import java.util.Scanner;

public class PreciosTiendaRetorno {

    public static void mostrarPrecios(double[] precios) {
        System.out.println("Precios ingresados: ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
    }

    public static double calcularTotal(double[] precios) {
        double total = 0;
        for (int i = 0; i < precios.length; i++) {
            total += precios[i];
        }
        return total;
    }

    public static double obtenerMayor(double[] precios) {
        double precioCaro = precios[0];
        for (int i = 0; i < precios.length; i++) {
            if (precioCaro < precios[i]) {
                precioCaro = precios[i];
            }
        }
        return precioCaro;
    }

    public static boolean esPrecioValido(double precio) {
        return precio > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precios = new double[5];
        for (int i = 0; i < precios.length; i++) {
            double precio = 0;
            while (!esPrecioValido(precio)) {
                System.out.println("inserta precio " + (i + 1) + " (debe ser mayor a 0): ");
                precio = sc.nextDouble();
            }
            precios[i] = precio;
        }


        double total = calcularTotal(precios);
        System.out.println("Total: " + total);
        mostrarPrecios(precios);
        double precioCaro = obtenerMayor(precios);
        System.out.println("Precio mas caro: " + precioCaro);
    }
}
