package com.practicas.ejercicio6;

public class MainEjercicio6 {
    public static void main(String[] args) {

        OrdenCompra orden = new OrdenCompra(
            1,
            EstadoPedido.PENDIENTE
        );

        OrdenCompra.DetalleLinea detalle1 =
            orden.new DetalleLinea("001", 3);
        OrdenCompra.DetalleLinea detalle2 =
            orden.new DetalleLinea("002", 10);
        OrdenCompra.DetalleLinea detalle3 =
            orden.new DetalleLinea("003", 5);
        OrdenCompra.DetalleLinea detalle4 =
            orden.new DetalleLinea("004", 7);

        System.out.println("\n-----Obtiene Enum(Descripcion)-----");
        System.out.println("Orden: " + orden.getOrderId());
        System.out.println("Estado: "
            + orden.getEstado().getDescripcion());

        System.out.println("\n-------Detalles de la orden-------");
        System.out.println(detalle1.toString());
        System.out.println(detalle2.toString());
        System.out.println(detalle3.toString());
        System.out.println(detalle4.toString());

    }
}
