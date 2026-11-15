public class Banco {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria();
        c1.titular = "Carlos";
        c1.numeroCuenta = "00123457";
        depositarConMensaje(c1 ,2000.0);
        retirarConMensaje(c1 ,1000.0);
        retirarConMensaje(c1 ,-100.0);
        retirarConMensaje(c1 ,2000.0);
        c1.mostrarDatos();
        //prueba con c1.saldo = -999999;
        //java: saldo has private access in CuentaBancaria

        CuentaBancaria c2 = new CuentaBancaria();
        c2.titular = "Sebastian";
        c2.numeroCuenta = "00123456";
        depositarConMensaje(c2 , 0.0);
        retirarConMensaje(c2 , 2000.0);
        c2.mostrarDatos();

    }
    public static void retirarConMensaje(CuentaBancaria cuenta, double monto) {
        if (cuenta.retirar(monto)) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("No se pudo retirar");
        }
    }

    public static void depositarConMensaje(CuentaBancaria cuenta, double monto) {
        if (cuenta.depositar(monto)) {
            System.out.println("Deposito exitoso");
        } else {
            System.out.println("Deposito fallido");
        }
    }


}
