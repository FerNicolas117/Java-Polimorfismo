package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {

    public static void main(String[] args) {

        // Sobre los arreglos
        int[] numeros = new int[10]; // Requiere un tamanio fijo

        int numero = 40;

        // Wrapper, envuelve al valor primitivo
        // Integer numeroObjeto = new Integer(40); deprecado
        Integer numeroObjeto = Integer.valueOf(40);

        // Lista
        // primitivo != object
        List<Integer> lista = new ArrayList<Integer>(); // Ventaja: este es dinamico y permite la interaccio mas facil
        lista.add(numero); // Autoboxing ->
        lista.add(Integer.valueOf(40)); // esto es lo que se hace por dentro

        // Ubboxing
        // int valorPrimitivo = numeroObjeto;
        int valorPrimitivo = numeroObjeto.intValue();

        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE); // Bits
        System.out.println(Integer.BYTES);
    }
}
