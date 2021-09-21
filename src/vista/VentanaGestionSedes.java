package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ValidacionTextFields;
import controlador.VerificarBtnGuardar;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	VerificarBtnGuardar verificar = new VerificarBtnGuardar();
	

	/**
	 * Create the frame.
	 */
	public VentanaGestionSedes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltituloventana = new JLabel("Gestion de Sedes");
		lbltituloventana.setHorizontalAlignment(SwingConstants.CENTER);
		lbltituloventana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbltituloventana.setBounds(0, 50, 581, 25);
		contentPane.add(lbltituloventana);
		
		JLabel lbltitulo = new JLabel("DEMAS");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setBounds(0, 11, 581, 31);
		contentPane.add(lbltitulo);
		
		JLabel labelIdSede = new JLabel("ID Sede:");
		labelIdSede.setBounds(41, 100, 120, 14);
		contentPane.add(labelIdSede);
		
		JLabel labelNombreSede = new JLabel("Nombre:");
		labelNombreSede.setBounds(41, 134, 120, 14);
		contentPane.add(labelNombreSede);
		
		JLabel labelDireccionSede = new JLabel("Direcci\u00F3n:");
		labelDireccionSede.setBounds(41, 168, 120, 14);
		contentPane.add(labelDireccionSede);
		
		JLabel labelTelefonoSede = new JLabel("Telefono:");
		labelTelefonoSede.setBounds(41, 202, 120, 14);
		contentPane.add(labelTelefonoSede);
		
		JLabel labelEstadoSede = new JLabel("Estado:");
		labelEstadoSede.setBounds(41, 236, 120, 14);
		contentPane.add(labelEstadoSede);
		
		
		JComboBox comboBoxEstadoUsuario = new JComboBox(new Object[]{});
		comboBoxEstadoUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelEstadoSede.setText("Estado:");
				labelEstadoSede.setForeground(Color.BLACK);
			}
		});
		comboBoxEstadoUsuario.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n", "Activo ", "Inactivo"}));
		comboBoxEstadoUsuario.setBounds(195, 239, 221, 22);
		contentPane.add(comboBoxEstadoUsuario);
		
		
		//TEXT FIELDS los listener son para validar que se puede escribir y que no
		textFieldIdSede = new JTextField();
		textFieldIdSede.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
				labelIdSede.setText("ID Sede:");
				labelIdSede.setForeground(Color.BLACK);
			}
		});
		textFieldIdSede.setBounds(196, 100, 220, 20);
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
				labelNombreSede.setText("Nombre:");
				labelNombreSede.setForeground(Color.BLACK);
			}
		});
		textFieldNombreSede.setBounds(197, 134, 219, 20);
		contentPane.add(textFieldNombreSede);
		textFieldNombreSede.setColumns(10);
		
		textFieldDireccionSede = new JTextField();
		textFieldDireccionSede.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				labelDireccionSede.setText("Dirección:");
				labelDireccionSede.setForeground(Color.BLACK);
			}
		});
		textFieldDireccionSede.setBounds(197, 168, 219, 20);
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
				labelTelefonoSede.setText("Telefono:");
				labelTelefonoSede.setForeground(Color.BLACK);
			}
		});
		textFieldTelefonoSede.setBounds(197, 202, 219, 20);
		contentPane.add(textFieldTelefonoSede);
		textFieldTelefonoSede.setColumns(10);
		
		
		//BOTON DE GUARDADO
		btnGuardarSede = new JButton("Guardar");
		btnGuardarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldIdSede.getText().equals("")) {
					verificar.guardar(textFieldIdSede,labelIdSede);
				}else {
					if(textFieldNombreSede.getText().equals("")) {
						verificar.guardar(textFieldNombreSede,labelNombreSede);
					}else {
						if(textFieldDireccionSede.getText().equals("")) {
							verificar.guardar(textFieldDireccionSede,labelDireccionSede);
						}else {
							if(textFieldTelefonoSede.getText().equals("")) {
								verificar.guardar(textFieldTelefonoSede,labelTelefonoSede);
							}else {
								if(comboBoxEstadoUsuario.getSelectedIndex()==0) {
									labelEstadoSede.setText("Seleccione un Estado");
									labelEstadoSede.setForeground(Color.RED);
									comboBoxEstadoUsuario.requestFocus();
								}
							}
						}
					}
				}
			}
		});
		btnGuardarSede.setBounds(79, 302, 90, 23);
		contentPane.add(btnGuardarSede);

		
		btnModificarSede = new JButton("Modificar");
		btnModificarSede.setBounds(195, 302, 90, 23);
		contentPane.add(btnModificarSede);
		
		btnEliminarSede = new JButton("Eliminar");
		btnEliminarSede.setBounds(309, 302, 90, 23);
		contentPane.add(btnEliminarSede);
		
		//Bonton limpiar, sirve para borrar todo lo que hayamos escrito en un text field
		btnLimpiarSede = new JButton("Limpiar");
		btnLimpiarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar.limpiar(textFieldIdSede);
				verificar.limpiar(textFieldNombreSede);
				verificar.limpiar(textFieldDireccionSede);
				verificar.limpiar(textFieldTelefonoSede);
				comboBoxEstadoUsuario.setSelectedIndex(0);
			}
		});
		btnLimpiarSede.setBounds(423, 302, 90, 23);
		contentPane.add(btnLimpiarSede);
		
		btnBuscarSede = new JButton("Buscar");
		btnBuscarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscarSede.setBounds(477, 96, 89, 23);
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
		btnVolverAtras.setBounds(243, 360, 115, 23);
		contentPane.add(btnVolverAtras);
	}
}
