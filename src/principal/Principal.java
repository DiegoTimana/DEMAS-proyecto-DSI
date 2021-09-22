package principal;

import controlador.ControladorLogin;
import vista.VentanaLogin;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		VentanaLogin ventanaInicio = new VentanaLogin();
		ControladorLogin ctrl = new ControladorLogin(ventanaInicio);
		
		ctrl.iniciar();
		ventanaInicio.setVisible(true);
		
		//asignamos el password y usuario que ingreso
		ctrl.user.setNombre(ctrl.usuario);
		ctrl.user.setPassword(ctrl.password);	
		
		
	}

}
