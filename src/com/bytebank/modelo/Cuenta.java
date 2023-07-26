package com.bytebank.modelo;

import com.bytebank.exceptions.SaldoInsuficienteException;
import com.bytebank.modelo.cliente.Cliente;

/**
 * Cuenta va a crear nuevas instancias  de CuentaCorriente
 * @version 1.0
 * @author Fernando Nicolas
 */

public abstract class Cuenta {

    // public   -> Accesible desde cualquier parte del proyecto
    // default  -> Accesible dentro del paquete
    // protected    -> default + clases hijas
    // private  -> solo desde la clase misma

    // Atributos
    protected double saldo; // Es accesible desde sus clases hijas
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    // Este no es un atributo
    private static int total = 0;

    // Metodo constructor default

    /**
     * Instancia una nueva cuenta sin parametros
     */
    public Cuenta() {}

    // Metodo constructor

    /**
     * Instancia una cuenta usando agencia y numero
     * @param agencia
     * @param numero
     */
    public Cuenta(int agencia, int numero) {
        if (agencia <= 0 && numero <= 0) {
            System.out.println("No se permite 0!");
            this.agencia = 1;
            this.numero = 1;
        } else {
            this.agencia = agencia;
            this.numero = numero;
        }
        System.out.println("Estoy creando una cuenta con numero: " + numero);
        Cuenta.total++;
        // System.out.println("Se van creando: " + total + " cuentas!");
    }

    // void no retorna valor
    public abstract void depositar(double valor);
    //{this.saldo += valor;}

    // Metodo que retorna verdadero o falso
    // Saca -> retirar

    /*
     * La condicion para que una persona no pueda sacar dinero, a primera instancia
     * es que el usuario no tuviera saldo, sin embargo, se pueden agregar mas motivos haciendo
     * uso de las excepciones.
     * Por ejemplo, que la cuenta fue bloqueada, no hay saldo...
     */

    /**
     * Este metodo retira dinero de la cuenta, y si ocurre un error devuelve una excepcion
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("No tienes suficiente saldo!");
        }
        this.saldo -= valor;
    }

    public boolean transferir(double valor, Cuenta destino) {
        if (this.saldo >= valor) {
            try {
                this.saca(valor);
            } catch (SaldoInsuficienteException e) {
                e.printStackTrace();
            }
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    // Getters ans setters

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        String cuenta = "Numero: " + this.numero + ", Agencia: " + this.agencia;
        return cuenta;
    }

    @Override
    public boolean equals(Object obj) {
        // Comparacion basada en valores
        Cuenta cuenta = (Cuenta) obj;
        return this.agencia == cuenta.getAgencia() &&
                this.numero == cuenta.getNumero();
    }
}
