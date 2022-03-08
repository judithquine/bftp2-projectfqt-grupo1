package org.factoriaf5.bftp2projectfqtgrupo1;



public class Stock {
    private final String codigo;
    private final String descripcion;
    private final int cantidad;

    public Stock(String codigo, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }
}