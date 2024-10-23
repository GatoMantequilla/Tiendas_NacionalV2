package org.example;

public class ProductoCompra {
    private int cantidad;
    private int precioUnitario;
    private Producto producto;

    public ProductoCompra(int cantidad, int precioUnitario, Producto producto) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    private void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    private void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    private void setProducto(Producto producto) {
        this.producto = producto;
    }
}
