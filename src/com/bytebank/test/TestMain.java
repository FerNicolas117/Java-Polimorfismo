package com.bytebank.test;

public class TestMain {

    public static void main(String[] args) {

        int edad = 20;
        int eddad2 = 15;
        int edad3 = 67;

        // Todos los arrays deben de crearse con un tamanio fijo
        // indice es el numero de posicion del array, el primer indice es 0
        int[] edades = new int[5];
        edades[2] = 30;

        System.out.println(edades[2]);
        System.out.println(edades[0]);
    }
}
