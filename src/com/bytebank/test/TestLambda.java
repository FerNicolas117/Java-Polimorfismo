package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.cliente.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(62, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorros(32, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorros(2, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println();
        System.out.println("Antes de ordenar!");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        /* Emplenado Lambdas */
        lista.sort((Cuenta o1, Cuenta o2) ->
                Integer.compare(o1.getNumero(), o2.getNumero())
        );

        System.out.println();
        System.out.println("Despues de ordenar!");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        // Ordenando de la manera antgua por titular con Lambda
        Collections.sort(lista, (Cuenta cuenta1, Cuenta cuenta2) -> {
            return cuenta1.getTitular().getNombre()
                    .compareTo(cuenta2.getTitular().getNombre());
        });

        System.out.println();
        System.out.println("Despues de ordenar por nombre!");
        /*for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }*/

        lista.forEach(cuenta -> System.out.println(cuenta));

        Collections.sort(lista);
        System.out.println();
        System.out.println("Despues de ordenar de forma natural!");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        System.out.println();
        System.out.println("Invirtiendo los elementos de la lista con Collections!");
        Collections.reverse(lista);
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        System.out.println();
        System.out.println("Mezclando los elementos de la lista con Collections!");
        Collections.shuffle(lista);
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        System.out.println();
        System.out.println("Rotando los elementos de la lista con Collections!");
        Collections.rotate(lista, 2);
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
}
