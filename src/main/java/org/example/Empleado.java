package org.example;
public class Empleado {
    private String nombre;
    private int idNumber;
    private String posicionDeCargo;

    public Empleado(String nombre, int idNumber, String posicionDeCargo) {
        this.nombre = nombre;
        this.idNumber = idNumber;
        this.posicionDeCargo = posicionDeCargo;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdNumber() {
        return idNumber;
    }

    private void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getPosicionDeCargo() {
        return posicionDeCargo;
    }

    private void setPosicionDeCargo(String posicionDeCargo) {
        this.posicionDeCargo = posicionDeCargo;
    }
}
