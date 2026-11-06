public class Banco {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.titular = "Carlos";
        c1.numeroCuenta = "00123457";
        c1.depositar(2000.0);
        c1.retirar(1000.0);
        c1.mostrarDatos();
        //prueba con c1.saldo = -999999;
        //java: saldo has private access in CuentaBancaria

        CuentaBancaria c2 = new CuentaBancaria();
        c2.titular = "Sebastian";
        c2.numeroCuenta = "00123456";
        c2.depositar(0.0);
        c2.retirar(2000.0);
        c2.mostrarDatos();
    }
}
