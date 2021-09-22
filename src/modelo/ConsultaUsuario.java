package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaUsuario extends Conexion{
	
	public boolean registrar(Usuario usuario){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        //consulta
        String sql = "INSERT INTO usuarios (id, nombre, apellidos, fecha_nacimiento, telefono, direccion, email , genero, fecha_vinculacion, cargo, estado, id_sede, password ) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
           //para enviar los datos 
           ps = con.prepareStatement(sql);           
           ps.setInt(1, usuario.getId());
           ps.setString(2, usuario.getNombre());
           ps.setString(3, usuario.getApellidos());
           ps.setString(4, usuario.getFechaNacimiento());
           ps.setString(5, usuario.getTelefono());
           ps.setString(6, usuario.getDireccion());
           ps.setString(7, usuario.getEmail());
           ps.setString(8, usuario.getGenero());
           ps.setString(9, usuario.getFechaVinculacion());
           ps.setString(10, usuario.getCargo());
           ps.setString(11, usuario.getEstado());
           ps.setInt(12, usuario.getId_sede());
           ps.setString(13, usuario.getPassword());
           
           
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

}
