public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    private double saldo;

    CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    double getSaldo() {
        return saldo;
    }

    void mostrarDatos() {
        System.out.println(titular + " " + numeroCuenta + " " + saldo);
    }

    boolean depositar(double monto) {
        boolean depositado;
        if (monto > 0) {
            depositado = true;
            saldo += monto;
        } else {
            depositado = false;
        }
        return depositado;
    }

    boolean retirar(double monto) {
        boolean retirado;
        if (monto <= 0) {
            retirado = false;
        } else if (monto > saldo) {
            retirado = false;
        } else {
            saldo -= monto;
            retirado = true;
        }
        return retirado;
    }

}
