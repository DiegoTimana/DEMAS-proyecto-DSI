package principal;


import controlador.ControladorLogin;
import controlador.ControladorSedes;
import modelo.Conexion;
import modelo.ConsultasSede;
import modelo.Sede;
import vista.VentanaGestionSedes;
import vista.VentanaGestionUsuarios;
import vista.VentanaLogin;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		VentanaGestionUsuarios ventanaUsuario = new VentanaGestionUsuarios();
		ventanaUsuario.setVisible(true);
		
		// este comentario lo hizo luis f
		// este comentario lo hizo diego
		
	}

}
