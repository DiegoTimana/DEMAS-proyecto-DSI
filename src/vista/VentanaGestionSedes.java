package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ValidacionTextFields;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaGestionSedes extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldNombreSede;
	public JTextField textFieldDireccionSede;
	public JTextField textFieldTelefonoSede;
	public JTextField textFieldIdSede;
	public JButton btnGuardarSede;
	public JButton btnModificarSede; 
	public JButton btnEliminarSede;
	public JButton btnLimpiarSede; 
	public JButton btnBuscarSede; 
	private JButton btnVolverAtras;
	ValidacionTextFields textf = new ValidacionTextFields();
	

	/**
	 * Create the frame.
	 */
	public VentanaGestionSedes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltituloventana = new JLabel("Gestion de Sedes");
		lbltituloventana.setHorizontalAlignment(SwingConstants.CENTER);
		lbltituloventana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbltituloventana.setBounds(0, 50, 434, 25);
		contentPane.add(lbltituloventana);
		
		JLabel lbltitulo = new JLabel("DEMAS");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setBounds(0, 11, 444, 31);
		contentPane.add(lbltitulo);
		
		JLabel labelIdSede = new JLabel("ID Sedes:");
		labelIdSede.setBounds(41, 100, 70, 14);
		contentPane.add(labelIdSede);
		
		JLabel labelNombreSede = new JLabel("Nombre:");
		labelNombreSede.setBounds(41, 134, 70, 14);
		contentPane.add(labelNombreSede);
		
		JLabel labelDireccionSede = new JLabel("Direcci\u00F3n:");
		labelDireccionSede.setBounds(41, 168, 70, 14);
		contentPane.add(labelDireccionSede);
		
		JLabel labelTelefonoSede = new JLabel("Telefono:");
		labelTelefonoSede.setBounds(41, 202, 70, 14);
		contentPane.add(labelTelefonoSede);
		
		JLabel labelEstadoSede = new JLabel("Estado:");
		labelEstadoSede.setBounds(41, 236, 70, 14);
		contentPane.add(labelEstadoSede);
		
		
		//TEXT FIELDS los listener son para validar que se puede escribir y que no
		textFieldIdSede = new JTextField();
		textFieldIdSede.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
			}
		});
		textFieldIdSede.setBounds(141, 94, 220, 20);
		contentPane.add(textFieldIdSede);
		textFieldIdSede.setColumns(10);
		
		textFieldNombreSede = new JTextField();
		textFieldNombreSede.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
			}
		});
		textFieldNombreSede.setBounds(142, 128, 219, 20);
		contentPane.add(textFieldNombreSede);
		textFieldNombreSede.setColumns(10);
		
		textFieldDireccionSede = new JTextField();
		textFieldDireccionSede.setBounds(142, 162, 219, 20);
		contentPane.add(textFieldDireccionSede);
		textFieldDireccionSede.setColumns(10);
		
		textFieldTelefonoSede = new JTextField();
		textFieldTelefonoSede.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
			}
		});
		textFieldTelefonoSede.setBounds(142, 196, 219, 20);
		contentPane.add(textFieldTelefonoSede);
		textFieldTelefonoSede.setColumns(10);
		
		btnGuardarSede = new JButton("Guardar");
		btnGuardarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarSede.setBounds(41, 304, 90, 23);
		contentPane.add(btnGuardarSede);
		
		btnModificarSede = new JButton("Modificar");
		btnModificarSede.setBounds(157, 304, 90, 23);
		contentPane.add(btnModificarSede);
		
		btnEliminarSede = new JButton("Eliminar");
		btnEliminarSede.setBounds(271, 304, 90, 23);
		contentPane.add(btnEliminarSede);
		
		btnLimpiarSede = new JButton("Limpiar");
		btnLimpiarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiarSede.setBounds(385, 304, 90, 23);
		contentPane.add(btnLimpiarSede);
		
		btnBuscarSede = new JButton("Buscar");
		btnBuscarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscarSede.setBounds(386, 96, 89, 23);
		contentPane.add(btnBuscarSede);
		
		btnVolverAtras = new JButton("Volver Atr\u00E1s");
		btnVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGerente ventana = new VentanaGerente();
				setVisible(false);
				ventana.setVisible(true);
				ventana.setLocationRelativeTo(null);
			}
		});
		btnVolverAtras.setBounds(205, 362, 115, 23);
		contentPane.add(btnVolverAtras);
		
		JComboBox comboBoxEstadoUsuario = new JComboBox(new Object[]{});
		comboBoxEstadoUsuario.setModel(new DefaultComboBoxModel(new String[] {"", "Activo ", "Inactivo"}));
		comboBoxEstadoUsuario.setBounds(140, 233, 221, 22);
		contentPane.add(comboBoxEstadoUsuario);
	}
}
