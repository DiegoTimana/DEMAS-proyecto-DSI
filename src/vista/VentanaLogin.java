package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaLogin extends JFrame {

	public JPanel contentPane;
	public JPasswordField passwordField;
	public JTextField textFieldUsuario;
	public JButton btnIngresar;
	final VentanaGerente windowgerente = new VentanaGerente();
	
	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo1 = new JLabel("DEMAS");
		titulo1.setFont(new Font("Tahoma", Font.BOLD, 26));
		titulo1.setHorizontalAlignment(SwingConstants.CENTER);
		titulo1.setBounds(0, 11, 434, 28);
		contentPane.add(titulo1);
		
		JLabel titulo2 = new JLabel("LOGIN");
		titulo2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titulo2.setHorizontalAlignment(SwingConstants.CENTER);
		titulo2.setBounds(0, 50, 434, 28);
		contentPane.add(titulo2);
		
		JLabel imagen1 = new JLabel("");
		imagen1.setHorizontalAlignment(SwingConstants.CENTER);
		imagen1.setIcon(new ImageIcon(VentanaLogin.class.getResource("/imagenes/loginImage.png")));
		imagen1.setBounds(0, 89, 434, 128);
		contentPane.add(imagen1);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(41, 249, 72, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(41, 289, 72, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 288, 203, 20);
		contentPane.add(passwordField);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(123, 248, 203, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		//variables de prueba para el password y el usuario
		String password = "admin";
		String user= "admin";
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(password==user) {
					JOptionPane.showMessageDialog(null,"Bienvenido al Sistema DEMAS");
					windowgerente.setVisible(true);
					windowgerente.setLocationRelativeTo(null);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null,"Usuario o contrase�a incorrectos");
				}
			}
		});
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIngresar.setBounds(181, 345, 89, 23);
		contentPane.add(btnIngresar);
	}
}
