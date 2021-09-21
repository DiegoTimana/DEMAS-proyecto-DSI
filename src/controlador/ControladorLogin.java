package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import modelo.Conexion;
import vista.VentanaGerente;
import vista.VentanaLogin;

public class ControladorLogin implements ActionListener{
	
	VentanaLogin ventanaLogin;
	Conexion conexion;
	Connection con;
	
	
	 public ControladorLogin (VentanaLogin ventanaLogin){
	        
	        this.ventanaLogin = ventanaLogin;     
	        this.ventanaLogin.btnIngresar.addActionListener(this);    
	    }
	 
	 //metodo para iniciar la vista
	 public void iniciar(){
		 
		 ventanaLogin.setTitle("Login");
		 ventanaLogin.setLocationRelativeTo(null);
		 ventanaLogin.setVisible(false);
	    }

	 
	//metodos para escuchar los click de los botones
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == ventanaLogin.btnIngresar) {
			
			validarUsuario();
			
		}
		
	}
	
	//para validar si el usuario esta en la base de datos
	public void validarUsuario() {
		
		conexion = new Conexion();
		con = conexion.getConnection();
		
		int resultado=0;
		String password = String.valueOf(ventanaLogin.passwordField.getPassword()); 
		String usuario = ventanaLogin.textFieldUsuario.getText();
		String sql = "select * from usuarios where cedula='"+usuario+"'and contraseña='"+password+"' ";
		
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			//.recorre todo los registros de la base de datos
			if(rs.next()) {
				resultado = 1;
				
				if(resultado == 1) {
					
					JOptionPane.showMessageDialog(null, "Login exitoso");
					ventanaLogin.dispose();
					
					VentanaGerente ventanaGerente = new VentanaGerente();
					ventanaGerente.setVisible(true);
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Error de Acceso");
			}
			
			
				
			
		} catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
		}
		
	}
	

}
