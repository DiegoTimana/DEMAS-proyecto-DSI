package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultasSede;
import modelo.Sede;
import vista.VentanaGestionSedes;

public class ControladorSedes implements ActionListener {
	
	 private Sede sede;
	    private ConsultasSede consultaSede;
	    private VentanaGestionSedes ventana;
	    
	    //contructor: va a recibir el modelo y la vista
	    public ControladorSedes (Sede sede, ConsultasSede consultaSede, VentanaGestionSedes ventana){
	        
	        this.sede = sede;
	        this.consultaSede = consultaSede;  
	        this.ventana = ventana;     
	        this.ventana.btnGuardarSede.addActionListener(this);
	        this.ventana.btnModificarSede.addActionListener(this);
	        this.ventana.btnEliminarSede.addActionListener(this);
	        this.ventana.btnLimpiarSede.addActionListener(this);
	        this.ventana.btnBuscarSede.addActionListener(this);
	        
	    }
	    
	    //metodo para iniciar la vista
	    
	    public void iniciar(){
	        ventana.setTitle("Sedes");
	        ventana.setLocationRelativeTo(null);
	        ventana.setVisible(false);
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() == ventana.btnGuardarSede){
	            //vamos a tomar los valores de las cajas de texto y meterlos al modelo
	        	sede.setIdSede(ventana.textFieldIdSede.getText());
	        	sede.setNombreSede(ventana.textFieldNombreSede.getText());
	        	sede.setDireccionSede(ventana.textFieldDireccionSede.getText());
	        	sede.setTelefonoSede(ventana.textFieldTelefonoSede.getText());
	        	sede.setEstadoSede(ventana.textFieldEstadoSede.getText());
	            
	            //el metodo registrar retorna un booleano
	            if(consultaSede.registrar(sede)){
	                JOptionPane.showMessageDialog(null, "Registro Guardado");
	                limpiar();
	            } else{
	                JOptionPane.showMessageDialog(null, "Error al Guardar");
	                limpiar();
	            }
	            
	        }
	        
	        
	        if(e.getSource() == ventana.btnModificarSede){
	            //vamos a tomar los valores de las cajas de texto y meterlos al modelo
	        	sede.setIdSede(ventana.textFieldIdSede.getText()); //mirar si es necesario ponerse
	        	sede.setNombreSede(ventana.textFieldNombreSede.getText());
	        	sede.setDireccionSede(ventana.textFieldDireccionSede.getText());
	        	sede.setTelefonoSede(ventana.textFieldTelefonoSede.getText());
	        	sede.setEstadoSede(ventana.textFieldEstadoSede.getText());
	            
	            //el metodo registrar retorna un booleano
	            if(consultaSede.modificar(sede)){
	                JOptionPane.showMessageDialog(null, "Registro Modificado");
	                limpiar();
	            } else{
	                JOptionPane.showMessageDialog(null, "Error al Modificar");
	                limpiar();
	            }
	            
	        }
	        
	        
	        if(e.getSource() == ventana.btnEliminarSede){
	            //vamos a tomar los valores de las cajas de texto y meterlos al modelo
	        	sede.setIdSede(ventana.textFieldIdSede.getText());
	            
	            //el metodo registrar retorna un booleano
	            if(consultaSede.eliminar(sede)){
	                JOptionPane.showMessageDialog(null, "Registro Eliminado");
	                limpiar();
	            } else{
	                JOptionPane.showMessageDialog(null, "Error al Eliminar");
	                limpiar();
	            }
	            
	        }
	        
	        if(e.getSource() == ventana.btnBuscarSede){
	            //vamos a tomar los valores de las cajas de texto y meterlos al modelo
	        	sede.setIdSede(ventana.textFieldIdSede.getText());
	            
	            //el metodo registrar retorna un booleano
	            if(consultaSede.buscar(sede)){
	                
	                ventana.textFieldNombreSede.setText(sede.getNombreSede());
	                ventana.textFieldDireccionSede.setText(sede.getDireccionSede());
	                ventana.textFieldTelefonoSede.setText(sede.getTelefonoSede());
	                ventana.textFieldEstadoSede.setText(sede.getEstadoSede());
	               
	            } else{
	                JOptionPane.showMessageDialog(null, "No se encontro registro");
	                limpiar();
	            }
	            
	        }
	        
	        
	        if(e.getSource() == ventana.btnLimpiarSede){
	            limpiar();
	        }
			
		}
		
		
		public void limpiar(){
	        ventana.textFieldIdSede.setText(null);
	        ventana.textFieldNombreSede.setText(null);
	        ventana.textFieldDireccionSede.setText(null);
	        ventana.textFieldTelefonoSede.setText(null);    
	        ventana.textFieldEstadoSede.setText(null);
	    }
	

}
