package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaGestionSedes extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldNombreSede;
	public JTextField textFieldDireccionSede;
	public JTextField textFieldTelefonoSede;
	public JTextField textFieldEstadoSede;
	public JTextField textFieldIdSede;
	public JButton btnGuardarSede;
	public JButton btnModificarSede; 
	public JButton btnEliminarSede;
	public JButton btnLimpiarSede; 
	public JButton btnBuscarSede; 
	

	/**
	 * Create the frame.
	 */
	public VentanaGestionSedes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEMAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 444, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion de Sedes");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 50, 434, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel labelIdSede = new JLabel("ID Sedes:");
		labelIdSede.setBounds(41, 100, 59, 14);
		contentPane.add(labelIdSede);
		
		JLabel labelNombreSede = new JLabel("Nombre:");
		labelNombreSede.setBounds(41, 134, 46, 14);
		contentPane.add(labelNombreSede);
		
		JLabel labelDireccionSede = new JLabel("Direcci\u00F3n:");
		labelDireccionSede.setBounds(41, 168, 59, 14);
		contentPane.add(labelDireccionSede);
		
		JLabel labelTelefonoSede = new JLabel("Telefono:");
		labelTelefonoSede.setBounds(41, 202, 46, 14);
		contentPane.add(labelTelefonoSede);
		
		JLabel labelEstadoSede = new JLabel("Estado:");
		labelEstadoSede.setBounds(41, 236, 46, 14);
		contentPane.add(labelEstadoSede);
		
		textFieldIdSede = new JTextField();
		textFieldIdSede.setBounds(96, 97, 220, 20);
		contentPane.add(textFieldIdSede);
		textFieldIdSede.setColumns(10);
		
		textFieldNombreSede = new JTextField();
		textFieldNombreSede.setBounds(97, 131, 219, 20);
		contentPane.add(textFieldNombreSede);
		textFieldNombreSede.setColumns(10);
		
		textFieldDireccionSede = new JTextField();
		textFieldDireccionSede.setBounds(97, 165, 219, 20);
		contentPane.add(textFieldDireccionSede);
		textFieldDireccionSede.setColumns(10);
		
		textFieldTelefonoSede = new JTextField();
		textFieldTelefonoSede.setBounds(97, 199, 219, 20);
		contentPane.add(textFieldTelefonoSede);
		textFieldTelefonoSede.setColumns(10);
		
		textFieldEstadoSede = new JTextField();
		textFieldEstadoSede.setBounds(97, 233, 219, 20);
		contentPane.add(textFieldEstadoSede);
		textFieldEstadoSede.setColumns(10);
		
		btnGuardarSede = new JButton("Guardar");
		btnGuardarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarSede.setBounds(41, 304, 75, 23);
		contentPane.add(btnGuardarSede);
		
		btnModificarSede = new JButton("Modificar");
		btnModificarSede.setBounds(140, 304, 75, 23);
		contentPane.add(btnModificarSede);
		
		btnEliminarSede = new JButton("Eliminar");
		btnEliminarSede.setBounds(235, 304, 75, 23);
		contentPane.add(btnEliminarSede);
		
		btnLimpiarSede = new JButton("Limpiar");
		btnLimpiarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiarSede.setBounds(334, 304, 75, 23);
		contentPane.add(btnLimpiarSede);
		
		btnBuscarSede = new JButton("Buscar");
		btnBuscarSede.setBounds(334, 96, 89, 23);
		contentPane.add(btnBuscarSede);
	}

}
