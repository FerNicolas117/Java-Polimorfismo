package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;
import com.bytebank.modelo.cliente.Cliente;

public class TestGuardaCuentas {

    public static void main(String[] args) {

        GuardaCuentas guardaCuentas = new GuardaCuentas();
        Cuenta cc = new CuentaCorriente(11, 22);
        guardaCuentas.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(22, 44);
        guardaCuentas.adicionar(cc2);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(111, 222);
        guardaCuentas.adicionar(cuentaCorriente);

        guardaCuentas.obtener(1);
        System.out.println(guardaCuentas.obtener(0));
        System.out.println(guardaCuentas.obtener(1));
        System.out.println(guardaCuentas.obtener(2));
        System.out.println(guardaCuentas.obtener(3));
    }
}
