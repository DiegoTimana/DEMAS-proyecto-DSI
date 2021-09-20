package modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Con_postgresql {
	
	static final String URL = "jdbc:postgresql://chunee.db.elephantsql.com:5432/BD_DS_DEMAS";
	static final String USER = "ftsbfhiz";
	static final String PASS = "R6lFazg8IelaU3BJvDzWq-y0G8f_47Ud";
	private static Connection con = null;
	/* 
	public static Connection crearConexion() throws ClassNotFoundException, SQLException{
	Class.forName("org.postgresql.Driver");
	Connection conexion = DriverManager.getConnection(URL, USER, PASS);
	if (conexion != null){
	System.out.print("Conexion establecida...");
	return conexion;
	}
	return null;
	}*/
	
	
    public static Connection getConnection(){
        
        try{
            //controlador para realizar la conexion
            Class.forName("org.postgresql.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conección a base de datos OK");
            
        } catch(SQLException e){
            System.err.println(e);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;   
    }
}
	
	
	/*
	public static Connection crearConexion() throws ClassNotFoundException, SQLException{
	try {
        Class.forName("org.postgresql.Driver");
    }
    catch (java.lang.ClassNotFoundException e) {
        System.out.println(e.getMessage());
    }

    String url = "jdbc:postgres://chunee.db.elephantsql.com:5432/BD_DS_DEMAS";
    String username = "ftsbfhiz";
    String password = "R6lFazg8IelaU3BJvDzWq-y0G8f_47Ud";

    try {
        Connection db = DriverManager.getConnection(url, username, password);
        if (db != null){
        	System.out.print("Conexion establecida...");
        	return db;
        }
        Statement st = db.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM cliente");
        while (rs.next()) {
            System.out.print("Column 1 returned ");
            System.out.println(rs.getString(2));
            System.out.print("Column 2 returned ");
            System.out.println(rs.getString(3));
        }
        rs.close();
        st.close();
        }
    catch (java.sql.SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return null;
	}*/

