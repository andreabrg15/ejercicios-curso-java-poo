package com.practicas.ejercicio2;

import java.io.Serializable;
import java.util.Objects;

public class ClienteBean implements Serializable {

    // Constante para la serialización
    private static final long serialVersionUID = 1L;

    // Atributos privados
    private Integer idCliente;
    private String nombre;
    private String tarjetaFidelidad;
    private int saldoPuntos;

    // Constructor sin argumentos
    public ClienteBean() {
    }

    // Getters y setters
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjetaFidelidad() {
        return tarjetaFidelidad;
    }

    public void setTarjetaFidelidad(String tarjetaFidelidad) {
        this.tarjetaFidelidad = tarjetaFidelidad;
    }

    public int getSaldoPuntos() {
        return saldoPuntos;
    }

    public void setSaldoPuntos(int saldoPuntos) {
        this.saldoPuntos = saldoPuntos;
    }

    // Comparación basada exclusivamente en idCliente
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ClienteBean that = (ClienteBean) o;
        return Objects.equals(idCliente, that.idCliente);
    }

    // HashCode basado exclusivamente en idCliente
    @Override
    public int hashCode() {
        return Objects.hash(idCliente);
    }

    // Representación legible del objeto
    @Override
    public String toString() {
        return "ClienteBean{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", tarjetaFidelidad='" + tarjetaFidelidad + '\'' +
                ", saldoPuntos=" + saldoPuntos +
                '}';
    }
}
