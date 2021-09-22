package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultasSede extends Conexion {
	
	public boolean registrar(Sede sede){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        //consulta
        String sql = "INSERT INTO sedes (id_sede, nombre_sede, direccion_sede, telefono_sede, estado_sede) values (?, ?, ?, ?, ?)";
        
        try{
           //para enviar los datos 
           ps = con.prepareStatement(sql);
           ps.setInt(1,sede.getIdSede());
           ps.setString(2, sede.getNombreSede());
           ps.setString(3, sede.getDireccionSede());
           ps.setString(4, sede.getTelefonoSede());
           ps.setString(5, sede.getEstadoSede());
           ps.execute();
           return true;
           
           
        }catch(SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch (SQLException e){
                System.err.println(e);
            }
        }
    }
    
    
    public boolean modificar(Sede sede){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        //consulta
        String sql = "UPDATE sedes SET nombre_sede=?, direccion_sede=?, telefono_sede=?, estado_sede=? WHERE id_sede=?";
        
        try{
           //para enviar los datos 
           ps = con.prepareStatement(sql);
           
           ps.setString(1, sede.getNombreSede());
           ps.setString(2, sede.getDireccionSede());
           ps.setString(3, sede.getTelefonoSede());
           ps.setString(4, sede.getEstadoSede());
           
           ps.setInt(5, sede.getIdSede());
           
           ps.execute();
           return true;
           
           
        }catch(SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch (SQLException e){
                System.err.println(e);
            }
        }
    }
    
    
    public boolean eliminar(Sede sede){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        //consulta
        String sql = "DELETE FROM sedes WHERE id_sede=?";
        
        try{
           //para enviar los datos 
           ps = con.prepareStatement(sql);
           ps.setInt(1,sede.getIdSede());
           ps.execute();
           return true;
           
           
        }catch(SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch (SQLException e){
                System.err.println(e);
            }
        }
    }
    
    
    public boolean buscar (Sede sede){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        
        //consulta
        String sql = "SELECT * FROM sedes WHERE id_sede=? ";
        
        try{
           //para enviar los datos 
           ps = con.prepareStatement(sql);
           ps.setInt(1,sede.getIdSede());
           rs = ps.executeQuery();
           
           
           if(rs.next()){
               sede.setNombreSede(rs.getString("nombre_sede"));
               sede.setDireccionSede(rs.getString("direccion_sede"));
               sede.setTelefonoSede(rs.getString("telefono_sede"));
               sede.setEstadoSede(rs.getString("estado_sede"));
               return true;
           }
           
           return false;
        }catch(SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch (SQLException e){
                System.err.println(e);
            }
        }
    }


}
