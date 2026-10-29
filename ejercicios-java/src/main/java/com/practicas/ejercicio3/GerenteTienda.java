package com.practicas.ejercicio3;

public class GerenteTienda extends EmpleadoRetail {

    private double bonoMetasVenta;

    public GerenteTienda() {
    }

    public GerenteTienda(String numNomina, String nombre, double sueldoBase,
                  double bonoMetasVenta) {
        super(numNomina, nombre, sueldoBase);
        this.bonoMetasVenta = bonoMetasVenta;
    }

    // Sobreescritura del método (Sumando bonos)
    @Override
    public double calcularSueldoNeto() {
        return sueldoBase + bonoMetasVenta;
    }
}
