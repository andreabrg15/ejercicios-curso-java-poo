package com.practicas.ejercicio5;

public class TarjetaCredito implements MedioPago {

    private String numeroTarjeta;

    TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {
        if(!validarMonto(monto)) {
            return false;
        }

        String terminacion = numeroTarjeta.substring(numeroTarjeta.length() - 4);
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito (Terminación: " + terminacion + ")");
        return true;
    }

}
