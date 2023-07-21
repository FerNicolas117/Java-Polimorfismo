package com.bytebank.test;

import com.bytebank.modelo.cliente.Cliente;

public class TestCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setClave("1234");

        System.out.println(cliente.iniciarSesion("1234"));
    }
}
