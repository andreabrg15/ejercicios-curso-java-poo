package com.practicas.ejercicio5;

public class MainEjercicio5 {

    public static void main(String[] args) {
        ProcesadorPagosService procesador = new ProcesadorPagosService();

        // Creamos diferentes medios de pago usando la interfaz (Polimorfismo)
        MedioPago pagoTarjeta = new TarjetaCredito("4532-8888-9999-1234");
        MedioPago pagoVale = new ValeElectronico("VALE-ALIMENTOS-2026");

        // Aqui se ejecutara todo correcto, ya que el monto es valido
        procesador.ejecutarCobro(pagoTarjeta, 450.75);
        procesador.ejecutarCobro(pagoVale, 120.00);

        // Dara error, al ser un monto negativo
        procesador.ejecutarCobro(pagoTarjeta, -50.0);
    }
}
