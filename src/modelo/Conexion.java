package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
	
 	private final String base = "demas";
    private final String user = "root";
    private final String password = "Lulas2312@";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    
    
    private Connection con = null;
    
    
    // obtiene la conexion la guarda y luego la retorna
    public Connection getConnection(){
        
        try{
            //controlador para realizar la conexion
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Conección a base de datos OK");
            
        } catch(SQLException e){
            System.err.println(e);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;   
    }

}
