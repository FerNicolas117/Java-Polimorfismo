package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.cliente.Cliente;

public class TestArregloReferencias {

    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        // La variable cc es la referencia al objeto de CuentaCorriente con dichos valores que esta
        // en la memoria heap
        CuentaCorriente cc = new CuentaCorriente(23, 44);

        //                          [ new  | cc  | null  | null  | null  ]
        referencias[1] = cc;

        Cliente cliente = new Cliente();
        referencias[4] = cliente;

        Cliente obtenido = (Cliente) referencias[4];
        System.out.println("Imprimiendo cliente obtenido: " + obtenido);

        CuentaAhorros ca = new CuentaAhorros(44, 55);
        referencias[3] = ca;

        System.out.println(cc);
        System.out.println(referencias[1]);

        referencias[0] = new CuentaCorriente(11, 99);
        System.out.println(referencias[0]);

        // Cast
        CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
        System.out.println(cuenta);

        System.out.println();
        System.out.println("Iterando todas las cuentas");
        for (int i = 0; i < referencias.length; i ++) {
            System.out.println(referencias[i]);
        }

        System.out.println();

        /*
        for (CuentaCorriente i : cuentas) {
            System.out.println(i);
        }
         */

        // Creando un arreglo de forma literal
        double[] numeros = {1.1, 1.2, 1.3, 1.4};
        System.out.println();
        for (double numero : numeros) {
            System.out.println(numero);
        }
    }
}
