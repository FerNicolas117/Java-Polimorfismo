package com.bytebank.test;

import com.bytebank.exceptions.SaldoInsuficienteException;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;

public class TestCuentaExceptionSaldo {

    public static void main(String[] args) {

        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.depositar(210);
        try {
            cuenta.saca(210);
            cuenta.saca(10);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo disponible: " + cuenta.getSaldo());
    }
}
