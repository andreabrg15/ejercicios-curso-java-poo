package com.practicas.ejercicio4;

public class FacturaPersonaFisica extends AbstractDocumentoFiscal {

    private String curp;

    FacturaPersonaFisica() {
    }

    FacturaPersonaFisica(String folioFiscal, double subtotal, String curp) {
        this.folioFiscal = folioFiscal;
        this.subtotal = subtotal;
        this.curp = curp;
    }

    @Override
    public String generarEstructuraXML() {
        return String.format(
            "<FacturaPersonaFisica>\n" +
            "    <CURP>%s</CURP>\n" +
            "    <FolioFiscal>%s</FolioFiscal>\n" +
            "    <Subtotal>%.2f</Subtotal>\n" +
            "    <TotalConIVA>%.2f</TotalConIVA>\n" +
            "</FacturaPersonaFisica>",
            curp, folioFiscal, subtotal, this.calcularTotalConIVA()
        );
    }

}
