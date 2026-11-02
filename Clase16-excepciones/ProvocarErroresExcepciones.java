
import java.util.Scanner;

public class ProvocarErroresExcepciones {
    public static void mostrarSolicitudNumero() {
        System.out.println("introducir un numero entero positivo: ");
    }

    public static int provocarErrorEntrada(Scanner sc) {
        mostrarSolicitudNumero();
        int numero = sc.nextInt();
        // Exception in thread "main" java.util.InputMismatchException
        //mensaje: ninguno
        // ProvocarErroresExcepciones.java:11
        return numero;
    }

    public static double provocarErrorIndice(Scanner sc) {
        double[] precios = new double[5];
        for (int i = 0; i <= precios.length; i++) {
            double precio = 0;
            while (precio <= 0) {
                System.out.println("Introduce el precio numero " + (i + 1) + ":");
                precio = sc.nextDouble();
            }
            precios[i] = precio;
        }
        return precios[0];
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // ProvocarErroresExcepciones.java:26
    }

    public static int provocarErrorDivision(Scanner sc) {
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Introduce el dividendo como numero entero positivo: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce el divisor: ");
        numero2 = sc.nextInt();
        return numero1 / numero2;
        // ProvocarErroresExcepciones.java:40
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //provocarErrorEntrada(sc);
        //provocarErrorIndice(sc);
        provocarErrorDivision(sc);
    }
}
