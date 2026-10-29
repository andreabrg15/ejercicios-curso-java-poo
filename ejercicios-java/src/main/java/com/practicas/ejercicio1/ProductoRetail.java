package com.practicas.ejercicio1;

public class ProductoRetail {

    private String sku;
    private String descripcion;
    private double precioUnitario;
    private int existencias;

    // Constructor
    public ProductoRetail() {
    }

    public ProductoRetail(String sku, String descripcion, double precioUnitario, int existencias) {
        this.sku = sku;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.existencias = existencias;
    }

    public void aplicarDescuento(double porcentaje) {
        this.precioUnitario = this.precioUnitario - (this.precioUnitario * porcentaje);
    }

    public void reabastecer(int cantidad) {
        this.existencias += cantidad;
    }

    // Getters and Setters
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
}
