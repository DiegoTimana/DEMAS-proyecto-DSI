package controlador;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class ValidacionTextFields {
		
	public void textKeyPress(KeyEvent evt) {
		//le asignamos un evento a una variable
		char car = evt.getKeyChar();
		//condicion que valida que tipo de datos de texto estamos ingresando 
		if((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
				&& (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
			evt.consume();
		}
	}
	
	public void numKeyPress(KeyEvent evt) {
		//le asignamos un evento a una variable
		char car = evt.getKeyChar();
		//condicion que nos permite ingresar datos numericos 
		if((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
			evt.consume();
		}	
	}
	
	// evento que nos recibe datos numericos que vayan con punto decimal (solo uno), como los precios
	public void numDecKeyPress(KeyEvent evt, JTextField jtext) {
		//le asignamos un evento a una variable
		char car = evt.getKeyChar();
		if((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)
				&& jtext.getText().contains(".")) {
			evt.consume();
		} else if((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)
				&& (car != '.')) {
			evt.consume();
		}
		
	}
}
