package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestCuenta {

    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(1, 123423);
        CuentaAhorros ca = new CuentaAhorros(2, 2234232);

        cc.depositar(2000);
        cc.transferir(1000, ca);

        System.out.println();
        System.out.println("Saldo de Modelo.CuentaCorriente: " + cc.getSaldo());
        System.out.println("Saldo de Modelo.Cuenta Ahorros: " + ca.getSaldo());
    }
}
