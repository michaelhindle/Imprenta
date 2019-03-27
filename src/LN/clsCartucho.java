package LN;

import COMUN.ItfProperty;
import COMUN.clsConstantes;

public class clsCartucho extends clsConsumible implements ItfProperty {
/**
 * Estos son los atributos propios de la clase
 */
	private String marca;
	private String color;
/**
 * Se cre el metodo con unos atributos determinados
 * @param id es el atributo del padre
 * @param cantidad es el atributo del padre
 * @param precio es ek atributo del padre 
 * @param fecha es el atributo del padre
 * @param marcaCartucho es el atributo de la clase
 * @param colorCartucho es el atributo de la clase
 */
	public clsCartucho(int id, int cantidad, double precio, String fecha, String marcaCartucho, String colorCartucho) {
		super(id, cantidad, precio, fecha);
		this.marca = marcaCartucho;
		this.color = colorCartucho;
	}
/**
 * Es un metodo vacio con los atributos del padre pero sin los atributos de los hijos
 */
	public clsCartucho(int id, int cantidad, double precio, String fecha) {
		super(id, cantidad, precio, fecha);
	}

	public clsCartucho() {
	}
/**
 * Se genera todos los gets de la clase
 */
	@Override
	public Object getObjectProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case clsConstantes.MARCACARTUCHO:return marca;
		case clsConstantes.COLORCARTUCHO:return color;
		case clsConstantes.ID:return id;
		case clsConstantes.CANTIDAD:return cantidad;
		case clsConstantes.PRECIO:return precio;
		case clsConstantes.FECHA:return fecha;
		default:return null;
		}
	}
/**
 * Se genera todos los sets de la clase
 */
	@Override
	public void setObjectProperty(String propiedad, Object valor) {
		// TODO Auto-generated method stub
		switch( propiedad )
		{	
			case clsConstantes.MARCACARTUCHO: marca = (String) valor ; break;
			case clsConstantes.COLORCARTUCHO: color = (String) valor; break;
			case clsConstantes.ID: id = (int) valor; break;
			case clsConstantes.CANTIDAD: cantidad = (int) valor; break;
			case clsConstantes.PRECIO: precio = (double) valor; break;
			case clsConstantes.FECHA: fecha = (String) valor; break;
		}
	}

}
