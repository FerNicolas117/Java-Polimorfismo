package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Funcionario;

public class TestFuncionario {

    public static void main(String[] args) {

        Funcionario diego = new Contador();
        diego.setNombre("Diego");
        diego.setDocumento("2234234234234");
        diego.setSalario(2000);
        diego.setTipo(0);

        System.out.println(diego.getSalario());
        System.out.println("La bonificacion es: " + diego.getBonificacion());
    }
}
