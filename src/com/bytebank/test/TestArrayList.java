package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.cliente.Cliente;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        // ArrayList es dinamico, <> Forzando a que acepte solo un tipo de dato
        ArrayList<Cuenta> lista = new ArrayList<>();
        // Referencia   Objeto
        Cuenta cc = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(13, 42);
        Cuenta cc3 = new CuentaCorriente(11, 22);

        lista.add(cc);
        lista.add(cc2);

        // Cliente cliente = new Cliente();
        // lista.add(cliente);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        System.out.println();
        System.out.println("Listado los elementos:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println();
        System.out.println("Otra forma de listar los elementos: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        System.out.println();
        System.out.println("Probando el metodo contains");
        boolean contiene = lista.contains(cc3);
        // Comparando por referencia
        // Con equals se compara la informacion, no la referencia
        if (contiene) {
            System.out.println("Si, es igual con (equals)!");
        }
    }
}
