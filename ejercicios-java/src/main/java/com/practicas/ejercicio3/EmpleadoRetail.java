package com.practicas.ejercicio3;

public class EmpleadoRetail {

    protected String numNomina;
    protected String nombre;
    protected double sueldoBase;

    public EmpleadoRetail() {
    }

    public EmpleadoRetail(String numNomina, String nombre, double sueldoBase) {
        this.numNomina = numNomina;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldoNeto() {
        return sueldoBase;
    }
}
