package LN;

import COMUN.ItfProperty;
import COMUN.clsConstantes;

public class clsPapel extends clsConsumible implements ItfProperty{

    private String tipo;
    private String formato;
    private String material;

    public clsPapel(int id, int cantidad, double precio, String fecha,String tipoCartel, String formato, String materialPapel) {
        super(id, cantidad, precio, fecha);
        this.tipo = tipoCartel;
        this.formato = formato;
        this.material = materialPapel;
    }
    public clsPapel() {
    	
    }

    public clsPapel(int id, int cantidad, double precio, String fecha) {
        super(id, cantidad, precio, fecha);
    }

	@Override
	public Object getObjectProperty(String propiedad) {
		// TODO Auto-generated method stub
	switch( propiedad )
	{
		case clsConstantes.TIPOCARTEL: return tipo;
		case clsConstantes.FORMATO: return formato;
		case clsConstantes.MATERIALPAPEL: return material;
		case clsConstantes.ID: return id;
		case clsConstantes.CANTIDAD: return cantidad;
		case clsConstantes.PRECIO: return precio;
		case clsConstantes.FECHA: return fecha;
		default: return null;
	}
	
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {
		// TODO Auto-generated method stub
		switch (propiedad){
		case clsConstantes.TIPOCARTEL: tipo = (String) valor; break;
		case clsConstantes.FORMATO: formato = (String) valor; break;
		case clsConstantes.MATERIALPAPEL: material = (String) valor; break;
		case clsConstantes.ID: id = (int) valor; break;
		case clsConstantes.CANTIDAD: cantidad = (int) valor; break;
		case clsConstantes.PRECIO: precio = (double) valor; break;
		case clsConstantes.FECHA: fecha= (String) valor; break;
		}
	}
 
}

