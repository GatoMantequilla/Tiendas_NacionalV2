package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "Gato", 300000, "Mascota");
        Producto producto2 = new Producto(2, "Perro", 1, "Patio");

        Tienda tienda1 = new Tienda("Bonitos bellos tienda de juegos", "Huh", "09:00-18:00", new ArrayList<>(), new ArrayList<>());
        Tienda tienda2 = new Tienda("Erm tienda", "Avenida los avellanos avellanadores", "10:00-10:01", new ArrayList<>(), new ArrayList<>());

        tienda1.agregarProducto(producto1);
        tienda2.agregarProducto(producto2);

        Ciudad ciudad = new Ciudad("Santiago", 12345, new ArrayList<>());
        ciudad.agregarTienda(tienda1);
        ciudad.agregarTienda(tienda2);

        System.out.println("Tiendas en " + ciudad.getNombre());
        ciudad.consultarTiendas();

        Cliente cliente = new Cliente("JOse Perez", 123, new ArrayList<>());

        ArrayList<ProductoCompra> productosComprados = new ArrayList<>();
        productosComprados.add(new ProductoCompra(1, producto1.getPrice(), producto1));
        productosComprados.add(new ProductoCompra(1, producto2.getPrice(), producto2));
        Compra compra = new Compra(cliente, 1, "2024-10-22", tienda1, productosComprados);

        cliente.agregarCompra(compra);

        System.out.println("Compras de " + cliente.getNombre());
        cliente.consultarCompras();

        System.out.println("Productos en la compra");
        compra.consultarProductos();

        ciudad.eliminarTienda(tienda1);
        System.out.println("tiendas en " + ciudad.getNombre() + " despues de eliminar Bonitos bellos tienda de juegos");
        ciudad.consultarTiendas();
    }
}
