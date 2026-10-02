
import java.util.Scanner;

public class MenuCajeroWhile {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cajero = 0;
            while( cajero != 3){
                System.out.println("=== CAJERO ===");
                System.out.println("1. Consultar saldo ");
                System.out.println("2. Retirar dinero ");
                System.out.println("3. Salir ");
                System.out.println("ingrese opcion: ");
                cajero = sc.nextInt();
                if (cajero == 1){
                    System.out.println("Su saldo es: 1000");
                } else if (cajero == 2){
                    System.out.println("Retiro realizado ");
                } else if (cajero == 3){
                    System.out.println("Gracias por usar el cajero");
                } else {
                    System.out.println("Opcion invalida");
                }
            }
        }
}
