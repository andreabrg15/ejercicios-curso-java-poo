package com.practicas.ejercicio6;

public class OrdenCompra {

    private int orderId;
    private EstadoPedido estado;

    public OrdenCompra() {
    }
    public OrdenCompra(int orderId, EstadoPedido estado) {
        this.orderId = orderId;
        this.estado = estado;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public EstadoPedido getEstado() {
        return estado;
    }
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    // Inner class DetalleLinea
    public class DetalleLinea {
        private String sku;
        private int cantidad;

        public DetalleLinea() {
        }
        public DetalleLinea(String sku, int cantidad) {
            this.sku = sku;
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return "Orden: " + orderId
                    + ", SKU: " + sku
                    + ", Cantidad: " + cantidad;
        }

        // Getters and Setters
        public String getSku() {
            return sku;
        }
        public void setSku(String sku) {
            this.sku = sku;
        }
        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
        public int getCantidad() {
            return cantidad;
        }
    }
}
