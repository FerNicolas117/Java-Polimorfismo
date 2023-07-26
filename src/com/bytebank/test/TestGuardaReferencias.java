package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaReferencias;

public class TestGuardaReferencias {

    public static void main(String[] args) {

        GuardaReferencias guardaReferencias = new GuardaReferencias();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(11, 22);
        guardaReferencias.adicionar(cuentaCorriente);
        System.out.println(guardaReferencias.obtener(0));

        Cuenta cc = new CuentaAhorros(33, 44);
        guardaReferencias.adicionar(cc);
        System.out.println(guardaReferencias.obtener(1));
    }
}
