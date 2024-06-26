package com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable {

    private AutenticacionUtil util;

    // Metodo Constructor
    public Administrador() {
        this.util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
