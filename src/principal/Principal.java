package principal;


import java.sql.*;


import controlador.ControladorLogin;
import controlador.ControladorSedes;
import modelo.Con_postgresql;
import modelo.Conexion;
import modelo.ConsultasSede;
import modelo.Sede;
import vista.VentanaGestionSedes;
import vista.VentanaGestionUsuarios;
import vista.VentanaLogin;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conex = Con_postgresql.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		/*
		VentanaLogin ventanaInicio = new VentanaLogin();
		ControladorLogin ctrl = new ControladorLogin(ventanaInicio);
		
		ctrl.iniciar();
		ventanaInicio.setVisible(true);
		*/
		
		
		/*
		Sede sede = new Sede();
        ConsultasSede consultaSede = new ConsultasSede();
        VentanaGestionSedes ventanaSede = new VentanaGestionSedes();
        
        ControladorSedes ctrl = new ControladorSedes(sede, consultaSede, ventanaSede);
        
        ctrl.iniciar();
        ventanaSede.setVisible(true);
        */
		
		VentanaLogin ventanaLogin1 = new VentanaLogin();
		ventanaLogin1.setVisible(true);
		ventanaLogin1.setLocationRelativeTo(null);
		
		
		// este comentario lo hizo luis f
		// este comentario lo hizo diego
		
	}

}
