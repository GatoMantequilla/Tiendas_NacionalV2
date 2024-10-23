package org.example;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int numClient;
    private ArrayList<Compra> compras;

    public Cliente(String nombre, int numClient, ArrayList<Compra> compras) {
        this.nombre = nombre;
        this.numClient = numClient;
        this.compras = compras;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumClient() {
        return numClient;
    }

    private void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    private void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    //....................................................................................................

    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public void eliminarCompra(Compra compra) {
        compras.remove(compra);
    }

    public void consultarCompras() {
        for (Compra compra : compras) {
            System.out.println("Compra ID: " + compra.getId() + ", Total: " + compra.getTotalPrice() + ", Fecha: " + compra.getDate());
        }
    }
}

