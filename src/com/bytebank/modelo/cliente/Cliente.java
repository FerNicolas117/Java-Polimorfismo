package com.bytebank.modelo.cliente;

import com.bytebank.modelo.Autenticable;
import com.bytebank.modelo.AutenticacionUtil;

public class Cliente implements Autenticable {

    private String nombre;
    private String documento;
    private String telefono;

    private AutenticacionUtil util;

    // Metodo Constructor
    public Cliente() {
        this.util = new AutenticacionUtil();
    }

    // Getters ans setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
