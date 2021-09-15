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

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaGestionUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEMAS");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(0, 11, 544, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion de Usuarios");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 54, 544, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setBounds(41, 100, 108, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setBounds(41, 129, 108, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setBounds(41, 158, 108, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_5.setBounds(41, 187, 123, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono:");
		lblNewLabel_6.setBounds(41, 216, 108, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_7.setBounds(41, 245, 108, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Email:");
		lblNewLabel_8.setBounds(41, 274, 108, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Genero:");
		lblNewLabel_9.setBounds(41, 303, 108, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Fecha de Vinculaci\u00F3n:");
		lblNewLabel_10.setBounds(41, 332, 123, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Cargo");
		lblNewLabel_11.setBounds(41, 361, 108, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Estado:");
		lblNewLabel_12.setBounds(41, 390, 108, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Sede:");
		lblNewLabel_13.setBounds(41, 419, 108, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Password:");
		lblNewLabel_14.setBounds(41, 448, 108, 14);
		contentPane.add(lblNewLabel_14);
		
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
	}
}
