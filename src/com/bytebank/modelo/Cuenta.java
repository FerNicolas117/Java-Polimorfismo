package com.bytebank.modelo;

import com.bytebank.exceptions.SaldoInsuficienteException;
import com.bytebank.modelo.cliente.Cliente;

public abstract class Cuenta {

    // Atributos
    protected double saldo; // Es accesible desde sus clases hijas
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    // Este no es un atributo
    private static int total = 0;

    // Metodo constructor default
    public Cuenta() {}

    // Metodo constructor
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
        System.out.println("Se van creando: " + total + " cuentas!");
    }

    // void no retorna valor
    public abstract void depositar(double valor);
    //{this.saldo += valor;}

    // Metodo que retorna verdadero o falso
    // Saca -> retirar

    /**
     * La condicion para que una persona no pueda sacar dinero, a primera instancia
     * es que el usuario no tuviera saldo, sin embargo, se pueden agregar mas motivos haciendo
     * uso de las excepciones.
     * Por ejemplo, que la cuenta fue bloqueada, no hay saldo...
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
}