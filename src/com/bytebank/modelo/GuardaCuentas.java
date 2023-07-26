package com.bytebank.modelo;

public class GuardaCuentas {

    /**
     * Crear un objeto para guardar muchas cuentas
     * Permitir agregar cuentas con un metodo
     * guardaCuentas.adiciona(cuenta);
     * remover, ...
     */

    Cuenta[] cuenta = new Cuenta[10];
    int indice = 0;

    //                  [ X  |   |   |   | ...  ]
    public void adicionar(Cuenta cc) {
        cuenta[indice] = cc;
        indice++;
    }

    public Cuenta obtener(int indice) {
        return cuenta[indice];
    }
}
