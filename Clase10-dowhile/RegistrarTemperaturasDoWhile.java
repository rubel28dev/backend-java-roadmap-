import java.util.Scanner;
public class RegistrarTemperaturasDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double promedio;
        int acumulador = 0;
        int contador = 1;
        int temperatura = 0;
        do{
            System.out.println("Temperatura " + contador + ":");
            temperatura = sc.nextInt();
            contador++;
            acumulador += temperatura;
        } while(contador <= 5);
        promedio = acumulador/5;
        System.out.println("Promedio: " + promedio);
    }
}
