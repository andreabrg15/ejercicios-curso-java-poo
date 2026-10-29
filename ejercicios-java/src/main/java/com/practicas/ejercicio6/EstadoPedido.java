package com.practicas.ejercicio6;

public enum EstadoPedido {
    PENDIENTE(1, "Pendiente"),
    EN_TRANSITO(2, "En tránsito"),
    ENTREGADO(3, "Entregado");

    private int id;
    private String descripcion;

    EstadoPedido(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
