package com.practicas.ejercicio5;

public class ProcesadorPagosService {

    public void ejecutarCobro(MedioPago medioPago, double monto) {

        System.out.println("\n--- Iniciando transacción de cobro ---");

        // Polimorfismo aplicado: el metodo ProcesarPago al que se llame
        // realmente sera uno u otro dependiendo el MedioPago que lo
        boolean resultado = medioPago.procesarPago(monto);
        if (resultado)
            System.out.println("¡Transacción completada con éxito!");
        else
           System.out.println("Transacción rechazada");
    }
}
