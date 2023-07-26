package com.bytebank.test;

import java.util.ArrayList;

public class TestArrayListPrueba {

    public static void main(String[] args) {

        System.out.println("Practicando ArrayList!");
        System.out.println();

        // Creando el ArrayList
        ArrayList<String> listaPersonas = new ArrayList<String>();

        listaPersonas.add("Fernando Nicolas");
        listaPersonas.add("Owen Luna");

        System.out.println(listaPersonas);

        System.out.println("-------------------");
        for (String persona : listaPersonas) {
            System.out.println(persona);
        }

        ArrayList<String> listaPaises = new ArrayList<>(4);
        listaPaises.add("Mexico");
        System.out.println(listaPaises);

        System.out.println();
        System.out.println("Lista a partir de otra!");

        ArrayList<String> listaEstados = new ArrayList<>();
        listaEstados.add("Hidalgo");
        listaEstados.add("Quintana Roo");
        ArrayList<String> listaEstadosNueva = new ArrayList<>(listaEstados);
        listaEstadosNueva.add("Monterrey");
        System.out.println(listaEstadosNueva);
    }
}
