package com.practicas.ejercicio4;

public abstract class AbstractDocumentoFiscal {

    protected String folioFiscal;
    protected double subtotal;

    public double calcularTotalConIVA() {
        return subtotal + (subtotal * 0.16);
    }

    public abstract String generarEstructuraXML();
}
