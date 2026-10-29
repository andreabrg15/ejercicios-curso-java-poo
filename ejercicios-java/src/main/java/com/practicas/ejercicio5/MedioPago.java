package com.practicas.ejercicio5;

public interface MedioPago {

    abstract boolean procesarPago(double monto);

    default boolean validarMonto(double monto) {
        if (monto <= 0.0) {
            System.out.println(" [Error] El monto a cobrar (" + monto + ") debe ser mayor a 0");
            return false;
        }
        return true;
    }
}
