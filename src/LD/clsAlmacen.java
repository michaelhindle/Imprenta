package LD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import LN.clsCartucho;

public class clsAlmacen {
	
	public static List<clsCartucho> cargarListaCoches()
	  {
	    ArrayList<clsCartucho> vectorBD = new ArrayList<>();
	  
	try
    {
      // Todos los accesos a bases de datos deben ir entre try/catch
      // Establecemos una conexi�n con nuestra base de datos
      GestorBD.getInstance().connect();
         
      // Creamos y ejecutamos una sentencia SQL
      Statement stmt = GestorBD.getInstance().createStatement();
       
      //hay una tabla coches en la BD
      ResultSet rs = stmt.executeQuery("SELECT * FROM clsCartuchos");
       
      // Tratamos los resultado obtenidos en la consulta SQL
      while(rs.next())
      {
    	  clsCartucho nuevoCartucho = new clsCartucho(  	rs.getInt("id"),
    			  										rs.getInt("cantidad"),
    			  										rs.getDouble("precio"),
    			  										rs.getString("fecha"),
    			  										rs.getString("marca"),
    			  										rs.getString("color")
    			  										);                                        
    	  	
			vectorBD.add(nuevoCartucho);
      }
    }

      catch(SQLException se) {
      
           
          se.printStackTrace();
      }
      
      return vectorBD;
    }
	
	
	 public static clsCartucho buscarCartucho(int id ) 
	  {
		try {
			GestorBD.getInstance().connect();

			Statement sentencia = GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = sentencia.executeQuery("SELECT * FROM clsCartuchos where matricula = '" + id + "'");

			int cantidad = rs.getInt("cantidad");
			double precio = rs.getDouble("precio");
			String fecha = rs.getString("fecha");
			String marcaCartucho = rs.getString("marcaCartucho");
			String colorCartucho = rs.getString("colorCartucho");

			clsCartucho c = new clsCartucho(id, cantidad, precio, fecha, marcaCartucho, colorCartucho);

			return c;
		} catch (SQLException se) {
			se.printStackTrace();

			return null;
		} 
	  }
	 
	 
	 
	public static boolean existeCartucho(int id )
	  {
	    try
	    {
	       GestorBD.getInstance().connect();
	         
	      // Creamos y ejecutamos una sentencia SQL
	      Statement sentencia = 
	      GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,             
	                                           ResultSet.CONCUR_UPDATABLE);
	            
	      ResultSet rs = sentencia.executeQuery("SELECT * FROM Coches where matricula = '" + id +"'" );
	       
	      System.out.println("SELECT * FROM Coches where matricula = '" + id +"'");
	      
	      if ( rs.first() == false )
	      {
	    	  return false;
	      }
	      else
	      {
	    	  return true;
	      }
	       
	    }
	    catch (SQLException se)
	    {
	        se.printStackTrace();
	        
	        return false;
	    }    
	  }

public static void insertarCartucho( int id , int cantidad, double precio, String fecha, String marca, String color )
{     
  try
  {
    GestorBD.getInstance().connect();
     
    Statement sentencia =  GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,             
                                         ResultSet.CONCUR_UPDATABLE);

    boolean r = existeCartucho( id );
     
    if(r == false)
    {         
  	 String query ="insert into Cartucho values("+ id +","+ cantidad+","+ precio +",'"+ fecha +"','" + marca + "', '" + color+"')";
           
       sentencia.executeUpdate(query);
    }
    else
    {
        System.out.println("Cartucho Existente!");
    }
     
    GestorBD.getInstance().disconnect();
   
  }
  catch(SQLException se)
  {
      se.printStackTrace();
  }
}
}
