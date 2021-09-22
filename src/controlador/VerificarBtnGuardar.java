package controlador;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class VerificarBtnGuardar {
	
	
	//VERIFICAR SI LOS CAMPOS ESTAN LLENOS ANTES DE GUARDAR LOS DATOS
	public void guardar(JTextField field, JLabel label) {
		String texto = label.getText();
		if(texto.contains("Ingrese")) {}
		else {
			label.setText("Ingrese " + texto);
			label.setForeground(Color.RED);
			field.requestFocus();
		}
	}
	
	//PARA LOS BOTONES "LIMPIAR" funcion que limpia los jtextfields
	public void limpiar(JTextField field) {
		field.setText("");
	}
}
