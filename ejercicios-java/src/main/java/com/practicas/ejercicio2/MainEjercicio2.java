package com.practicas.ejercicio2;

public class MainEjercicio2 {

    public static void main(String[] args) {

        ClienteBean cliente1 = new ClienteBean();
        cliente1.setIdCliente(101);
        cliente1.setNombre("Ana");
        cliente1.setTarjetaFidelidad("FID-001");
        cliente1.setSaldoPuntos(500);

        ClienteBean cliente2 = new ClienteBean();
        cliente2.setIdCliente(101);
        cliente2.setNombre("Ana María");
        cliente2.setTarjetaFidelidad("FID-002");
        cliente2.setSaldoPuntos(900);

        // Mostrar el estado del cliente
        System.out.println("\n" + cliente1.toString());
        System.out.println(cliente2.toString());

        System.out.println("---Comprueba que ambos objetos se consideran iguales por su idCliente---");
        System.out.println("¿Son iguales? " +
                cliente1.equals(cliente2));

        // Comprobar los hashCode
        System.out.println("Hash cliente 1: " +
                cliente1.hashCode());
        System.out.println("Hash cliente 2: " +
                cliente2.hashCode());
    }
}
