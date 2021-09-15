package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

	public JPanel contentPane;
	public JPasswordField passwordField;
	public JTextField textFieldUsuario;
	public JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		JLabel lblNewLabel_3 = new JLabel("Usuario:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(41, 249, 72, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(41, 289, 72, 14);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 288, 203, 20);
		contentPane.add(passwordField);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(123, 248, 203, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIngresar.setBounds(181, 345, 89, 23);
		contentPane.add(btnIngresar);
	}
}
