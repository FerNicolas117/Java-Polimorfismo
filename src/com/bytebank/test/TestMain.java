package com.bytebank.test;

public class TestMain {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        int edad = 20;
        int eddad2 = 15;
        int edad3 = 67;

        // Todos los arrays deben de crearse con un tamanio fijo
        // indice es el numero de posicion del array, el primer indice es 0
        // indices      0     1     2      3     4
        //             [0  |  0  |  30  |  0  |  0  ]
        int[] edades = new int[5];
        edades[2] = 30;

        System.out.println(edades[2]);
        System.out.println(edades[0]);
        //System.out.println(edades[5]);

        int tamanioArray = edades.length;
        System.out.println("El tamanio del array es de: " + tamanioArray);

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }

        System.out.println("----------------");

        // "enhanced for loop" o "for-each loop"
        for (int i : edades) {
            System.out.println(i);
        }
    }
}
