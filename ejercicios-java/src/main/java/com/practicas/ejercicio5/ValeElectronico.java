package com.practicas.ejercicio5;

public class ValeElectronico implements MedioPago{

    private String codigoVale;

    ValeElectronico(String codigoVale) {
        this.codigoVale = codigoVale;
    }

    @Override
    public boolean procesarPago(double monto) {
        if(!validarMonto(monto)) {
            return false;
        }

        System.out.println("Procesando pago de $" + monto + " con Vale Electronico (Codigo: " + this.codigoVale + ")");
        return true;
    }

}
