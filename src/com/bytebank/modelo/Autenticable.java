package com.bytebank.modelo;

// Esta es una superclase
public interface Autenticable {

    public void setClave(String clave);

    public boolean iniciarSesion(String clave);
}
