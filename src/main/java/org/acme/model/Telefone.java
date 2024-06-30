package org.acme.model;

public class Telefone {
    private Integer ddd;
    private Integer numero;

    public Telefone(Integer ddd, Integer numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public Integer getDdd() {
        return ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String formatarNumero() {
        return "(" + ddd + ") " + numero;
    }
}