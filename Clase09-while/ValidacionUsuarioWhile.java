import java.util.Scanner;

public class ValidacionUsuarioWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contra = 0;
        while (contra != 1234) {
            System.out.println("ingrese contraseña: ");
            contra  = sc.nextInt();
            if (contra == 1234) {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Incorrecta");
            }
        }

    }
}
