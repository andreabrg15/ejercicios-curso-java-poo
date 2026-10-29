package com.practicas.ejercicio1;

public class MainEjercicio1 {

    public static void main(String[] args) {

        ProductoRetail producto1 = new ProductoRetail("123", "Producto 1", 200.0, 10);
        ProductoRetail producto2 = new ProductoRetail("456", "Producto 2", 200.0, 20);

        producto1.aplicarDescuento(0.1); // Aplicar un descuento del 10%

        // El descuento solo se aplico al producto1
        System.out.println(producto1.getPrecioUnitario());
        System.out.println(producto2.getPrecioUnitario());

        System.out.println(producto1 == producto2); // false, son objetos diferentes
    }
}
