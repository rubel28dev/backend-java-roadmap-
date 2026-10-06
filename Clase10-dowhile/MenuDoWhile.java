
import java.util.Scanner;
public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar mensaje");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Hola usuario");
            } else if (opcion == 2) {
                System.out.println("Aprendiendo Java");
            } else if (opcion == 3) {
                System.out.println("Programa terminado");
            } else {
                System.out.println("invalido");
            }
        } while(opcion != 3);
    }

}
