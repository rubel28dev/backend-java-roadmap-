public class AcumuladorWhile {
    public static void main(String[] args) {
        int contador = 1;
        int acumulador = 0;
        while(contador <= 100){
            acumulador += contador;
            contador++;
        }
        System.out.println(acumulador);
    }
}
