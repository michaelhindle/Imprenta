package LN;

import java.util.ArrayList;

import COMUN.clsConstantes;
import LD.clsAlmacen;

public class clsGestorLN {
	
private static clsGestorLN miGestor = new clsGestorLN();
	
	public static clsGestorLN obtGestor()
	{
		return miGestor;
	}

    private ArrayList<clsPapel> ContabilidadPapel;
    private ArrayList<clsCartucho> ContabilidadCartucho;
    private ArrayList<clsImpresora> ContabilidadImpresora;
    
    private clsGestorLN()
    {
        ContabilidadPapel = new ArrayList<clsPapel>();
        ContabilidadCartucho = new ArrayList<clsCartucho>();
    
    }
        public boolean addPapel( int id , int cantidad, double precio, String fecha, String tipo, String formato, String material)
    	{
    		
        	clsPapel p = new clsPapel( id , cantidad , precio, fecha, tipo, formato, material );
    		
    		if( ContabilidadPapel.contains( p ) )
    		{
    			return false;
    		}
    		else
    		{
    			ContabilidadPapel.add( p );
    			return true;
    		}
    		
    		
    }
       
       public boolean addCartucho( int id , int cantidad, double precio, String fecha, String marca, String color  )
   	{
   		
       	clsCartucho c = new clsCartucho( id , cantidad , precio, fecha, marca, color);
   		
   		if( ContabilidadCartucho.contains( c ) )
   		{
   			return false;
   		}
   		else
   		{
   			ContabilidadCartucho.add( c );
   			return true;
   		}
    }
       public void guardarDatos() {
   		
   		for( clsCartucho c : ContabilidadCartucho )
   		{
   			int id = (int) c.getObjectProperty(clsConstantes.ID );
   			int cantidad = (int) c.getObjectProperty(clsConstantes.CANTIDAD );
   			double precio = (double) c.getObjectProperty(clsConstantes.PRECIO );
   			String fecha = (String) c.getObjectProperty(clsConstantes.FECHA );
   			String marca = (String) c.getObjectProperty(clsConstantes.MARCACARTUCHO );
   			String color = (String) c.getObjectProperty(clsConstantes.COLORCARTUCHO);
   			
   			clsAlmacen.insertarCartucho(id, cantidad, precio, fecha, marca, color);
   		}
   		
   	}
       
        public boolean addImpresora( int id , int cantidad, double precio, String fecha, String marca, String modelo  )
    	{
    		
        clsImpresora i = new clsImpresora( id , cantidad , precio, fecha, marca, modelo);
    		
    	if( ContabilidadImpresora.contains( i ) )
    	{
   			return false;
   		}
   		else
   		{
    		ContabilidadImpresora.add( i );
   			return true;
    	}
    }
}


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  /**      
    public void BajaPapel(int _id, int _cantidad, double _precio, String _fecha)
    {
        clsPapel objPapel;
        objPapel = new clsPapel();//NO CUADRA, TIENE QUE BORRAR Y NO HACER UN NUEVO OBJETO
        objPapel.setId(_id);
        objPapel.setCantidad(_cantidad);
        objPapel.setPrecio(_precio);
        objPapel.setFecha(_fecha);
        ContabilidadConsumible.add(objPapel);
    }
    public void BajaCartucho(int _id, int _cantidad, double _precio, String _fecha){
        clsCartucho objCartucho;
        objCartucho = new clsCartucho();//NO CUADRA, TIENE QUE BORRAR Y NO HACER UN NUEVO OBJETO
        objCartucho.setId(_id);
        objCartucho.setCantidad(_cantidad);
        objCartucho.setPrecio(_precio);
        objCartucho.setFecha(_fecha);
        ContabilidadConsumible.add(objCartucho);
    }
    public void BajaImpresora(int _id, int _cantidad, double _precio, String _fecha) {
        clsImpresora objImpresora;
        objImpresora = new clsImpresora();//NO CUADRA, TIENE QUE BORRAR Y NO HACER UN NUEVO OBJETO
        objImpresora.setId(_id);
        objImpresora.setCantidad(_cantidad);
        objImpresora.setPrecio(_precio);
        objImpresora.setFecha(_fecha);
        ContabilidadConsumible.add(objImpresora);
    }



    public ArrayList<clsConsumible> LeerConsumibles(){
        return ContabilidadConsumible;
    }
}
**/