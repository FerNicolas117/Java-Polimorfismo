package com.bytebank.modelo;

// El gerente tambien corresponde a un fucionario del banco
// Modelo.Gerente es o extiende de Modelo.Funcionario
// Modelo.Gerente ahora extiende de FuncionarioAutenticable
public class Gerente extends Funcionario implements Autenticable {

    // Sobreescritura de metodo
    public double getBonificacion() {
        // Corresponde al 110% del salario.
        System.out.println("EJECUTANDO DESDE GERENTE!");
        return 2000;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
