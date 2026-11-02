import java.util.InputMismatchException;
import java.util.Scanner;

public class ObtenerMayorExcepciones {

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
        if (precios.length == 0) {
            return -1;
        }
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
                try {
                    precio = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada invalida: escriba solo numeros.");
                    sc.next();
                }
            }

            precios[i] = precio;
        }


        double total = calcularTotal(precios);
        System.out.println("Total: " + total);
        mostrarPrecios(precios);
        double precioCaro = obtenerMayor(precios);
        if (precioCaro <= 0) {
            System.out.println("Precio invalido");
        } else {
            System.out.println("Precio mas caro: " + precioCaro);
        }
        System.out.println(obtenerMayor(new double[0]));
    }
}
