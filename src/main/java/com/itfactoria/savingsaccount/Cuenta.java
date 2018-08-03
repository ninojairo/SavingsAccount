/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.savingsaccount;

/**
 *
 * @author jnino
 */
public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this(titular, 0);
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
        if (this.cantidad < 0) {
            this.cantidad = 0;
        }

    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @param cantidad
     */
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    /**
     * @param cantidad
     */
    public void retirar(double cantidad) {

        this.cantidad -= cantidad;

    }

}
