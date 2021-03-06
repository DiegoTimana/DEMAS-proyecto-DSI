package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Conexion;
import modelo.Usuario;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class VentanaPerfil extends JFrame{

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldCedula;
	private JTextField textFieldCargo;
	private JTextField textFieldSede;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public VentanaPerfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DEMAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setBounds(10, 11, 504, 26);
		contentPane.add(lblTitulo);
		
		JLabel lblSede = new JLabel("Sede:");
		lblSede.setBounds(10, 166, 60, 14);
		contentPane.add(lblSede);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 141, 60, 14);
		contentPane.add(lblCargo);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(10, 116, 60, 14);
		contentPane.add(lblCedula);
		
		JLabel lblTituloVentana = new JLabel("Perfil");
		lblTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVentana.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTituloVentana.setBounds(10, 48, 504, 14);
		contentPane.add(lblTituloVentana);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 91, 60, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 191, 60, 14);
		contentPane.add(lblPassword);
		
		/////TEXT FIELDS (los text fields de esta ventana no son editables, solo se muestra la informacion que ya se encuentra en la bd)
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(130, 91, 194, 20);
		textFieldNombre.setEditable(false);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldCedula = new JTextField();
		textFieldCedula.setBounds(130, 116, 194, 20);
		textFieldCedula.setEditable(false);
		contentPane.add(textFieldCedula);
		textFieldCedula.setColumns(10);
		
		textFieldCargo = new JTextField();
		textFieldCargo.setBounds(130, 141, 194, 20);
		textFieldCargo.setEditable(false);
		contentPane.add(textFieldCargo);
		textFieldCargo.setColumns(10);
		
		textFieldSede = new JTextField();
		textFieldSede.setBounds(130, 166, 194, 20);
		textFieldSede.setEditable(false);
		contentPane.add(textFieldSede);
		textFieldSede.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 191, 194, 20);
		passwordField.setEditable(false);
		contentPane.add(passwordField);
		
		
		//Boton de actualizar->cambio de coontrase?a
		JButton btnNewButton = new JButton("Actualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCambioPass ventanacambio = new VentanaCambioPass();
				ventanacambio.setVisible(true);
				ventanacambio.setLocationRelativeTo(null);
				setVisible(false);			
			}
		});
		btnNewButton.setBounds(368, 191, 113, 23);
		contentPane.add(btnNewButton);
		
		JButton btnVolverAtrs = new JButton("Volver Atr\u00E1s");
		btnVolverAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGerente ventana = new VentanaGerente();
				setVisible(false);
				ventana.setVisible(true);
				ventana.setLocationRelativeTo(null);
			}
		});
		btnVolverAtrs.setBounds(368, 234, 113, 23);
		contentPane.add(btnVolverAtrs);
		
		
		mostrarDatosUsuario();
//		System.out.println(user.getNombre());
	}
	
	//m?todo que sirve para mostrar los datos del usuario loggeado en la ventana de perfil :D
	private void mostrarDatosUsuario() {
		try {
			Conexion conexion = new Conexion();
			Connection con = conexion.getConnection();
			String sql = "select * from usuarios limit 1";
//			passwordField.setText(user.getPassword()); como conseguimos esa info D:
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			String datos[] = new String[5];
			
			while(rs.next()) {
				datos[0] = rs.getString("nombre_usuario");
				datos[1] = rs.getString("id_usuario");
				datos[2] = rs.getString("cargo_usuario");
				datos[3] = rs.getString("sede");
				datos[4] = rs.getString("contrase?a");
			}
			textFieldNombre.setText(datos[0]);
			textFieldCedula.setText(datos[1]);
			textFieldCargo.setText(datos[2]);
			textFieldSede.setText(datos[3]);
			passwordField.setText(datos[4]);
			
			conexion.cierraConexion();
		
		} catch(Exception e) {}
	}
}
