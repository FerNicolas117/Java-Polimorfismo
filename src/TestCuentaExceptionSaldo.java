public class TestCuentaExceptionSaldo {

    public static void main(String[] args) {

        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.depositar(210);
        cuenta.saca(210);
        cuenta.saca(10);

        System.out.println("Saldo disponible: " + cuenta.saldo);
    }
}
