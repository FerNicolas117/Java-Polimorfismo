package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {

    public static void main(String[] args) {

        String nombre = "Alura";
        // String nombre2 = new String("Allura");

        System.out.println("Antes de replace: " + nombre);
        nombre = nombre.replace("A", "a");
        nombre = nombre.concat(" Cursos Online");
        nombre = nombre.toUpperCase();
        nombre = nombre.toLowerCase();
            //01234
        char letra = nombre.charAt(5);
        int indice = nombre.indexOf("e");
        System.out.println("Desoues de replace: " + nombre);
        System.out.println("Caracter encontrado: " + letra);
        System.out.println("Indice encontrado: " + indice);
        System.out.println(nombre.length());

        if (nombre.isEmpty()) {
            System.out.println("La cadena esta vacia");
        } else {
            System.out.println("La cadena no es vacia, contiene: " + nombre);
        }

        String saludo = "Hola!";
        String mensaje = nombre.equals(saludo) ? "Las cadenas son iguales" : "Las cadenas son diferentes";
        printLine(mensaje);

        char letraA = 'A';
        System.out.println(letraA);
        printLine(letraA);

        printLine(new CuentaAhorros(344, 544));  // Cuenta de ahorros es un objeto
    }

    public static void printLine(Object valor) {
        System.out.println(valor.toString());
    }

    /*
    public static void printLine(char valor) {
        System.out.println(valor);
    }
     */
}
