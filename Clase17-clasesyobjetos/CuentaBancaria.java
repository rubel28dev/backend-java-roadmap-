public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    private double saldo;

    double getSaldo() {
        return saldo;
    }

    void mostrarDatos() {
        System.out.println(titular + " " + numeroCuenta + " " + saldo);
    }

    void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("Deposito fallido de " + titular);
            System.out.println("Ingreso un monto no valido debe ser mayor a 0");
        }
    }

    boolean retirar(double monto) {
        boolean retirado = false;
        if (monto <= 0) {
            System.out.println("Retiro fallido de " + titular);
            System.out.println("Ingreso un monto no valido debe ser mayor a 0");
        } else if (monto > saldo){
            System.out.println("No hay saldo suficiente para retirar");
        } else {
            saldo -= monto;
            retirado = true;
        }
        return retirado;
    }

}
