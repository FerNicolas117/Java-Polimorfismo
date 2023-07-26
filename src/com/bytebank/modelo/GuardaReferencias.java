package com.bytebank.modelo;

public class GuardaReferencias {

    // array del tipo Object con diez posiciones
    Object[] referencia = new Object[10];
    int indice = 0; // Porque la posicion del array comienza en cero

    // Metodo para adicionar elementos al array
    public void adicionar(Object objeto) {
        referencia[indice] = objeto;
        indice++;
    }

    // Metodo para obtener los datos de cada posicion del arreglo
    public Object obtener(int indice) {
        return referencia[indice];
    }
}
