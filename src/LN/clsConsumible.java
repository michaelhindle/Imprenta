package LN;

import COMUN.ItfProperty;

public class clsConsumible{
    protected int id;
    protected int cantidad;
    protected double precio;
    protected String fecha;

    public clsConsumible(int id, int cantidad, double precio, String fecha) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

    public clsConsumible() {
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) { this.precio = precio; }

    public String getFecha() { return fecha; }

    public void setFecha(String fecha) { this.fecha = fecha; }
    
	
}

