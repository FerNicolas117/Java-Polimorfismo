public class TestCuenta {

    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(1, 123423);
        CuentaAhorros ca = new CuentaAhorros(2, 2234232);

        cc.depositar(2000);
        cc.transferir(1000, ca);

        System.out.println();
        System.out.println("Saldo de CuentaCorriente: " + cc.getSaldo());
        System.out.println("Saldo de Cuenta Ahorros: " + ca.getSaldo());
    }
}
