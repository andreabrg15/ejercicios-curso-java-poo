package com.practicas.ejercicio3;

public class Cajero extends EmpleadoRetail {

    private double comisionCaja;

    public Cajero() {
    }

    public Cajero(String numNomina, String nombre, double sueldoBase,
                  double comisionCaja) {
        super(numNomina, nombre, sueldoBase);
        this.comisionCaja = comisionCaja;
    }

    // Sobreescritura del método (Sumando comisiones)
    @Override
    public double calcularSueldoNeto() {
        return sueldoBase + comisionCaja;
    }
}
