package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ValidacionTextFields;
import controlador.VerificarBtnGuardar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaGestionUsuarios extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldFechaNacimientoUsuario;
	public JTextField textFieldApellidosUsuario;
	public JTextField textFieldNombreUsuario;
	public JTextField textFieldIdUsuario;
	public JTextField textFieldTelefonoUsuario;
	public JTextField textFieldDireccionUsuario;
	public JTextField textFieldEmailUsuario;
	public JTextField textFieldFechaVinculacionUsuario;
	public JTextField textFieldCargoUsuario;
	public JTextField textFieldSedeUsuario;
	public JTextField textFieldPasswordUsuario;
	public JComboBox comboBoxGeneroUsuario;
	public JComboBox comboBoxEstadoUsuario;
	
	public JButton btnGuardarUsuario;
	public JButton btnModificarUsuario;
	public JButton btnEliminarUsuario;
	public JButton btnLimpiarUsuario;
	public JButton btnBuscarUsuario;
	private JButton btnVolverAtras;
	ValidacionTextFields textf = new ValidacionTextFields();
	VerificarBtnGuardar verificar = new VerificarBtnGuardar();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaGestionUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitulo = new JLabel("DEMAS");
		lbltitulo.setBackground(Color.LIGHT_GRAY);
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbltitulo.setBounds(0, 11, 652, 32);
		contentPane.add(lbltitulo);
		
		JLabel lbltituloventana = new JLabel("Gestion de Usuarios");
		lbltituloventana.setHorizontalAlignment(SwingConstants.CENTER);
		lbltituloventana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbltituloventana.setBounds(0, 54, 662, 25);
		contentPane.add(lbltituloventana);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(41, 100, 150, 14);
		contentPane.add(lblid);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(41, 129, 150, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(41, 158, 150, 14);
		contentPane.add(lblApellido);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaNacimiento.setBounds(41, 187, 150, 14);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(41, 216, 150, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(41, 245, 150, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(41, 274, 150, 14);
		contentPane.add(lblEmail);
		
		JLabel lblgenero = new JLabel("Genero:");
		lblgenero.setBounds(41, 303, 150, 14);
		contentPane.add(lblgenero);
		
		JLabel lblFechaVinculacion = new JLabel("Fecha de Vinculaci\u00F3n:");
		lblFechaVinculacion.setBounds(41, 332, 150, 14);
		contentPane.add(lblFechaVinculacion);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(41, 361, 150, 14);
		contentPane.add(lblCargo);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(41, 390, 150, 14);
		contentPane.add(lblEstado);
		
		JLabel lblSede = new JLabel("Id Sede:");
		lblSede.setBounds(41, 419, 150, 14);
		contentPane.add(lblSede);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(41, 448, 150, 14);
		contentPane.add(lblPassword);
		
		
		//TEXT FIELDS 
		textFieldFechaNacimientoUsuario = new JTextField();
		textFieldFechaNacimientoUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblFechaNacimiento.setText("Fecha de Nacimiento:");
				lblFechaNacimiento.setForeground(Color.BLACK);
			}
		});
		textFieldFechaNacimientoUsuario.setBounds(222, 187, 221, 20);
		contentPane.add(textFieldFechaNacimientoUsuario);
		textFieldFechaNacimientoUsuario.setColumns(10);
		
		textFieldApellidosUsuario = new JTextField();
		textFieldApellidosUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
				lblApellido.setText("Apellidos:");
				lblApellido.setForeground(Color.BLACK);
			}
		});
		textFieldApellidosUsuario.setBounds(222, 158, 221, 20);
		contentPane.add(textFieldApellidosUsuario);
		textFieldApellidosUsuario.setColumns(10);
		
		textFieldNombreUsuario = new JTextField();
		textFieldNombreUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
				lblNombre.setText("Nombre:");
				lblNombre.setForeground(Color.BLACK);
			}
		});
		textFieldNombreUsuario.setBounds(222, 129, 221, 20);
		contentPane.add(textFieldNombreUsuario);
		textFieldNombreUsuario.setColumns(10);
		
		textFieldIdUsuario = new JTextField();
		textFieldIdUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
				lblid.setText("ID:");
				lblid.setForeground(Color.BLACK);
			}
		});
		textFieldIdUsuario.setBounds(222, 100, 221, 20);
		contentPane.add(textFieldIdUsuario);
		textFieldIdUsuario.setColumns(10);
		
		textFieldTelefonoUsuario = new JTextField();
		textFieldTelefonoUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
				lblTelefono.setText("Telefono:");
				lblTelefono.setForeground(Color.BLACK);
			}
		});
		textFieldTelefonoUsuario.setBounds(222, 216, 221, 20);
		contentPane.add(textFieldTelefonoUsuario);
		textFieldTelefonoUsuario.setColumns(10);
		
		textFieldDireccionUsuario = new JTextField();
		textFieldDireccionUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblDireccion.setText("Dirección:");
				lblDireccion.setForeground(Color.BLACK);
			}
		});
		textFieldDireccionUsuario.setBounds(222, 245, 221, 20);
		contentPane.add(textFieldDireccionUsuario);
		textFieldDireccionUsuario.setColumns(10);
		
		textFieldEmailUsuario = new JTextField();
		textFieldEmailUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblEmail.setText("Email:");
				lblEmail.setForeground(Color.BLACK);
			}
		});
		textFieldEmailUsuario.setBounds(222, 274, 221, 20);
		contentPane.add(textFieldEmailUsuario);
		textFieldEmailUsuario.setColumns(10);
		
		textFieldFechaVinculacionUsuario = new JTextField();
		textFieldFechaVinculacionUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblFechaVinculacion.setText("Fecha de Vinculacion:");
				lblFechaVinculacion.setForeground(Color.BLACK);
			}
		});
		textFieldFechaVinculacionUsuario.setBounds(222, 332, 221, 20);
		contentPane.add(textFieldFechaVinculacionUsuario);
		textFieldFechaVinculacionUsuario.setColumns(10);
		
		textFieldCargoUsuario = new JTextField();
		textFieldCargoUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
				lblCargo.setText("Cargo:");
				lblCargo.setForeground(Color.BLACK);
			}
		});
		textFieldCargoUsuario.setBounds(222, 361, 221, 20);
		contentPane.add(textFieldCargoUsuario);
		textFieldCargoUsuario.setColumns(10);
		
		textFieldSedeUsuario = new JTextField();
		textFieldSedeUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
				lblSede.setText("id Sede:");
				lblSede.setForeground(Color.BLACK);
			}
		});
		textFieldSedeUsuario.setBounds(222, 419, 221, 20);
		contentPane.add(textFieldSedeUsuario);
		textFieldSedeUsuario.setColumns(10);
		
		textFieldPasswordUsuario = new JTextField();
		textFieldPasswordUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblPassword.setText("Password:");
				lblPassword.setForeground(Color.BLACK);
			}
		});
		textFieldPasswordUsuario.setBounds(222, 448, 221, 20);
		contentPane.add(textFieldPasswordUsuario);
		textFieldPasswordUsuario.setColumns(10);
		
		//BOTON GUARDAR
		btnGuardarUsuario = new JButton("Guardar");
		btnGuardarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldIdUsuario.getText().equals("")) {
					verificar.guardar(textFieldIdUsuario,lblid);
				}else {
					if(textFieldNombreUsuario.getText().equals("")) {
						verificar.guardar(textFieldNombreUsuario,lblNombre);
					}else {
						if(textFieldApellidosUsuario.getText().equals("")) {
							verificar.guardar(textFieldApellidosUsuario,lblApellido);
						}else {
						if(textFieldFechaNacimientoUsuario.getText().equals("")) {
							verificar.guardar(textFieldFechaNacimientoUsuario,lblFechaNacimiento);
						}else {
							if(textFieldTelefonoUsuario.getText().equals("")) {
								verificar.guardar(textFieldTelefonoUsuario,lblTelefono);
							}else {
								if(textFieldDireccionUsuario.getText().equals("")) {
									verificar.guardar(textFieldDireccionUsuario,lblDireccion);
									}else {
										if(textFieldEmailUsuario.getText().equals("")) {
											verificar.guardar(textFieldEmailUsuario,lblEmail);
											}else {
												if(comboBoxGeneroUsuario.getSelectedIndex()==0) {
													lblgenero.setText("Seleccione un Genero");
													lblgenero.setForeground(Color.RED);
													comboBoxGeneroUsuario.requestFocus();
												}else {
													if(textFieldFechaVinculacionUsuario.getText().equals("")) {
														verificar.guardar(textFieldFechaVinculacionUsuario,lblFechaVinculacion);
												}else {
													if(textFieldCargoUsuario.getText().equals("")) {
														verificar.guardar(textFieldCargoUsuario,lblCargo);
													}else {
														if(comboBoxEstadoUsuario.getSelectedIndex()==0) {
															lblEstado.setText("Seleccione un Estado");
															lblEstado.setForeground(Color.RED);
															comboBoxEstadoUsuario.requestFocus();
														}else {
															if(textFieldSedeUsuario.getText().equals("")) {
																verificar.guardar(textFieldSedeUsuario,lblSede);
															}else {
																if(textFieldPasswordUsuario.getText().equals("")) {
																	verificar.guardar(textFieldPasswordUsuario,lblPassword);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
		btnGuardarUsuario.setBounds(102, 485, 88, 23);
		contentPane.add(btnGuardarUsuario);
		
		btnModificarUsuario = new JButton("Modificar");
		btnModificarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarUsuario.setBounds(235, 485, 88, 23);
		contentPane.add(btnModificarUsuario);
		
		btnEliminarUsuario = new JButton("Eliminar");
		btnEliminarUsuario.setBounds(368, 485, 88, 23);
		contentPane.add(btnEliminarUsuario);
		
		btnLimpiarUsuario = new JButton("Limpiar");
		btnLimpiarUsuario.setBounds(494, 485, 88, 23);
		contentPane.add(btnLimpiarUsuario);
		
		btnBuscarUsuario = new JButton("Buscar");
		btnBuscarUsuario.setBounds(543, 96, 88, 23);
		contentPane.add(btnBuscarUsuario);
		
		String[] generoStrings = {"","Masculino", "Femenino"};
		comboBoxGeneroUsuario = new JComboBox(generoStrings);
		comboBoxGeneroUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblgenero.setText("Genero:");
				lblgenero.setForeground(Color.BLACK);
			}
		});
		comboBoxGeneroUsuario.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una Opci\u00F3n", "Masculino", "Femenino"}));
		comboBoxGeneroUsuario.setBounds(222, 302, 221, 22);
		contentPane.add(comboBoxGeneroUsuario);
		
		
		
		String[] estadoStrings = {"","Activo", "Inactivo"};
		comboBoxEstadoUsuario = new JComboBox(estadoStrings);
		comboBoxEstadoUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEstado.setText("Genero:");
				lblEstado.setForeground(Color.BLACK);
			}
		});
		comboBoxEstadoUsuario.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una Opci\u00F3n", "Activo", "Inactivo"}));
		comboBoxEstadoUsuario.setBounds(222, 389, 221, 22);
		contentPane.add(comboBoxEstadoUsuario);
		
		btnVolverAtras = new JButton("Volver Atr\u00E1s");
		btnVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				VentanaGerente ventana = new VentanaGerente();
				setVisible(false);
				ventana.setVisible(true);
				ventana.setLocationRelativeTo(null);
			}
		});
		btnVolverAtras.setBounds(293, 538, 115, 23);
		contentPane.add(btnVolverAtras);
	}
}
