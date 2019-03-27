package COMUN;

public class clsConstantes {
	
	public enum enFicDatos {

		FICH_COCHES("coches.dat");
		
		//atributo
		private String nombre;
		
		private enFicDatos( String nombre )
		{
			this.nombre = nombre;
		}
		
		public String getNombre()
		{
			return nombre;
		}		
	}
	
		public static final String ID = "id";
		public static final String CANTIDAD = "cantidad";
		public static final String PRECIO = "precio";
		public static final String FECHA = "fecha";	
			
		public static final String MARCACARTUCHO = "marca";
		public static final String COLORCARTUCHO = "color";
			
		public static final String TIPOCARTEL = "tipo";
		public static final String FORMATO = "forma";
		public static final String MATERIALPAPEL = "material";
		
		public static final String MARCAIMPRESORA = "marca";
		public static final String MODELOIMPRESORA = "modelo";
		}
