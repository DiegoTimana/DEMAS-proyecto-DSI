package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaGestionUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitulo = new JLabel("DEMAS");
		lbltitulo.setBackground(Color.LIGHT_GRAY);
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbltitulo.setBounds(0, 11, 544, 32);
		contentPane.add(lbltitulo);
		
		JLabel lbltituloventana = new JLabel("Gestion de Usuarios");
		lbltituloventana.setHorizontalAlignment(SwingConstants.CENTER);
		lbltituloventana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbltituloventana.setBounds(0, 54, 544, 25);
		contentPane.add(lbltituloventana);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(41, 100, 108, 14);
		contentPane.add(lblid);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(41, 129, 108, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(41, 158, 108, 14);
		contentPane.add(lblApellido);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaNacimiento.setBounds(41, 187, 123, 14);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(41, 216, 108, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(41, 245, 108, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(41, 274, 108, 14);
		contentPane.add(lblEmail);
		
		JLabel lblgenero = new JLabel("Genero:");
		lblgenero.setBounds(41, 303, 108, 14);
		contentPane.add(lblgenero);
		
		JLabel lblFechaVinculacion = new JLabel("Fecha de Vinculaci\u00F3n:");
		lblFechaVinculacion.setBounds(41, 332, 123, 14);
		contentPane.add(lblFechaVinculacion);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(41, 361, 108, 14);
		contentPane.add(lblCargo);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(41, 390, 108, 14);
		contentPane.add(lblEstado);
		
		JLabel lblSede = new JLabel("Sede:");
		lblSede.setBounds(41, 419, 108, 14);
		contentPane.add(lblSede);
		
		JLabel lblPasswor = new JLabel("Password:");
		lblPasswor.setBounds(41, 448, 108, 14);
		contentPane.add(lblPasswor);
		
		textFieldFechaNacimientoUsuario = new JTextField();
		textFieldFechaNacimientoUsuario.setBounds(174, 184, 221, 20);
		contentPane.add(textFieldFechaNacimientoUsuario);
		textFieldFechaNacimientoUsuario.setColumns(10);
		
		textFieldApellidosUsuario = new JTextField();
		textFieldApellidosUsuario.setBounds(174, 155, 221, 20);
		contentPane.add(textFieldApellidosUsuario);
		textFieldApellidosUsuario.setColumns(10);
		
		textFieldNombreUsuario = new JTextField();
		textFieldNombreUsuario.setBounds(174, 126, 221, 20);
		contentPane.add(textFieldNombreUsuario);
		textFieldNombreUsuario.setColumns(10);
		
		textFieldIdUsuario = new JTextField();
		textFieldIdUsuario.setBounds(174, 97, 221, 20);
		contentPane.add(textFieldIdUsuario);
		textFieldIdUsuario.setColumns(10);
		
		textFieldTelefonoUsuario = new JTextField();
		textFieldTelefonoUsuario.setBounds(174, 213, 221, 20);
		contentPane.add(textFieldTelefonoUsuario);
		textFieldTelefonoUsuario.setColumns(10);
		
		textFieldDireccionUsuario = new JTextField();
		textFieldDireccionUsuario.setBounds(174, 242, 221, 20);
		contentPane.add(textFieldDireccionUsuario);
		textFieldDireccionUsuario.setColumns(10);
		
		textFieldEmailUsuario = new JTextField();
		textFieldEmailUsuario.setBounds(174, 271, 221, 20);
		contentPane.add(textFieldEmailUsuario);
		textFieldEmailUsuario.setColumns(10);
		
		textFieldFechaVinculacionUsuario = new JTextField();
		textFieldFechaVinculacionUsuario.setBounds(174, 329, 221, 20);
		contentPane.add(textFieldFechaVinculacionUsuario);
		textFieldFechaVinculacionUsuario.setColumns(10);
		
		textFieldCargoUsuario = new JTextField();
		textFieldCargoUsuario.setBounds(174, 358, 221, 20);
		contentPane.add(textFieldCargoUsuario);
		textFieldCargoUsuario.setColumns(10);
		
		textFieldSedeUsuario = new JTextField();
		textFieldSedeUsuario.setBounds(174, 416, 221, 20);
		contentPane.add(textFieldSedeUsuario);
		textFieldSedeUsuario.setColumns(10);
		
		textFieldPasswordUsuario = new JTextField();
		textFieldPasswordUsuario.setBounds(174, 445, 221, 20);
		contentPane.add(textFieldPasswordUsuario);
		textFieldPasswordUsuario.setColumns(10);
		
		btnGuardarUsuario = new JButton("Guardar");
		btnGuardarUsuario.setBounds(41, 487, 88, 23);
		contentPane.add(btnGuardarUsuario);
		
		btnModificarUsuario = new JButton("Modificar");
		btnModificarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarUsuario.setBounds(174, 487, 88, 23);
		contentPane.add(btnModificarUsuario);
		
		btnEliminarUsuario = new JButton("Eliminar");
		btnEliminarUsuario.setBounds(307, 487, 88, 23);
		contentPane.add(btnEliminarUsuario);
		
		btnLimpiarUsuario = new JButton("Limpiar");
		btnLimpiarUsuario.setBounds(433, 487, 88, 23);
		contentPane.add(btnLimpiarUsuario);
		
		btnBuscarUsuario = new JButton("Buscar");
		btnBuscarUsuario.setBounds(433, 96, 88, 23);
		contentPane.add(btnBuscarUsuario);
		
		String[] generoStrings = {"","Masculino", "Femenino"};
		comboBoxGeneroUsuario = new JComboBox(generoStrings);
		comboBoxGeneroUsuario.setBounds(174, 299, 221, 22);
		contentPane.add(comboBoxGeneroUsuario);
		
		
		
		String[] estadoStrings = {"","Activo", "Inactivo"};
		comboBoxEstadoUsuario = new JComboBox(estadoStrings);
		comboBoxEstadoUsuario.setBounds(174, 386, 221, 22);
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
		btnVolverAtras.setBounds(232, 540, 115, 23);
		contentPane.add(btnVolverAtras);
	}
}
