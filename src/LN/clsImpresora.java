package LN;

import COMUN.ItfProperty;
import COMUN.clsConstantes;

public class clsImpresora extends clsConsumible implements ItfProperty {
    private String marca;
    private String modelo;

    public clsImpresora(int id, int cantidad, double precio, String fecha, String marcaImpresora, String modeloImpresora) {
        super(id, cantidad, precio, fecha);
        this.marca = marcaImpresora;
        this.modelo = modeloImpresora;
    }
    public clsImpresora() {
    	
    }

    public clsImpresora(int id, int cantidad, double precio, String fecha) {
        super(id, cantidad, precio, fecha);
    }

	@Override
	public Object getObjectProperty(String propiedad) {
		switch (propiedad) {
		case clsConstantes.ID:return id;
		case clsConstantes.CANTIDAD:return cantidad;
		case clsConstantes.PRECIO:return precio;
		case clsConstantes.FECHA:return fecha;
		case clsConstantes.MARCAIMPRESORA:return marca;
		case clsConstantes.MODELOIMPRESORA:return modelo;
		}
		
		return null;
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {
		switch (propiedad)
		{
		case clsConstantes.ID: id = (int) valor; break;
		case clsConstantes.CANTIDAD: cantidad = (int) valor; break;
		case clsConstantes.PRECIO: precio = (double) valor; break;
		case clsConstantes.FECHA: fecha = (String) valor; break;
		case clsConstantes.MARCAIMPRESORA: marca = (String) valor; break;
		case clsConstantes.MODELOIMPRESORA: modelo = (String) valor; break;
		
		
		}
	}
}
