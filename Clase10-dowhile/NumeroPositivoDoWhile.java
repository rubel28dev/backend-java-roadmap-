import java.util.Scanner;
public class NumeroPositivoDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            if (numero > 0 ) {
                System.out.println("Numero aceptado: " + numero);
            } else {
                System.out.println("Numero invalido");
            }
        } while(numero <= 0);
    }
}
