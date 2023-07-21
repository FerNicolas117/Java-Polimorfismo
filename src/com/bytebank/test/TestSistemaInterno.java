package com.bytebank.test;

import com.bytebank.modelo.Administrador;
import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.SistemaInterno;

public class TestSistemaInterno {

    public static void main(String[] args) {

        SistemaInterno sistemaInterno = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin = new Administrador();

        sistemaInterno.auntentica(gerente1);
        sistemaInterno.auntentica(admin);
    }
}
