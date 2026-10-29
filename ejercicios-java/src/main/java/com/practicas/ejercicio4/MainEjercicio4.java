package com.practicas.ejercicio4;

public class MainEjercicio4 {

    public static void main(String[] args) {
        
        // DEMOSTRACION DE COMO SE VERIA EL RESULTADO
        // USANDO LA CLASE QUE HEREDO DE LA CLASE ABSTRACTA
        String curp = "LARR230496MNLSICT6";
        String folioFiscal = "F000118080";
        double subtotal = 20000.0;

        FacturaPersonaFisica factura = new FacturaPersonaFisica(folioFiscal, subtotal, curp);
        String formato = factura.generarEstructuraXML();

        System.out.println("\n-----Demostracion -> Resultado Formato-----");
        System.out.println(formato);
    }
}
