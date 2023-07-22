package com.bytebank.test;

public class TestString {

    public static void main(String[] args) {

        String nombre = "Alura";
        // String nombre2 = new String("Allura");

        System.out.println("Antes de replace: " + nombre);
        nombre = nombre.replace("A", "a");
        nombre = nombre.concat(" Cursos Online");
        System.out.println("Desoues de replace: " + nombre);
    }
}
