package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class VentanaCambioPass extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldVariable;
	private JTextField textFieldPssNueva;
	private JTextField textFieldConfirmarPss;

	/**
	 * Create the frame.
	 */
	public VentanaCambioPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cambio de Contrase\u00F1a");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(0, 10, 389, 25);
		contentPane.add(lblTitulo);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(10, 60, 113, 20);
		contentPane.add(lblUsuario);
		
		JLabel lblPssActual = new JLabel("Contrase\u00F1a Actual:");
		lblPssActual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPssActual.setBounds(10, 135, 142, 20);
		contentPane.add(lblPssActual);
		
		JLabel lblPssNueva = new JLabel("Nueva Contrase\u00F1a:");
		lblPssNueva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPssNueva.setBounds(10, 210, 130, 20);
		contentPane.add(lblPssNueva);
		
		JLabel lblConfirmarPss = new JLabel("Confirmar Contrase\u00F1a:");
		lblConfirmarPss.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmarPss.setBounds(10, 285, 152, 20);
		contentPane.add(lblConfirmarPss);
		
		
		//TEXT FIELDS el campo usuario no es editable, solo se muestra. las contraseñas hay que validarlas
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(179, 63, 200, 20);
		textFieldUsuario.setEditable(false);
		contentPane.add(textFieldUsuario);
		
		textFieldVariable = new JTextField();
		textFieldVariable.setColumns(10);
		textFieldVariable.setBounds(179, 135, 200, 20);
		contentPane.add(textFieldVariable);
		
		textFieldPssNueva = new JTextField();
		textFieldPssNueva.setColumns(10);
		textFieldPssNueva.setBounds(179, 210, 200, 20);
		contentPane.add(textFieldPssNueva);
		
		textFieldConfirmarPss = new JTextField();
		textFieldConfirmarPss.setColumns(10);
		textFieldConfirmarPss.setBounds(179, 285, 200, 20);
		contentPane.add(textFieldConfirmarPss);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirmar.setBounds(67, 375, 120, 30);
		contentPane.add(btnConfirmar);
		
		JButton btnVolverAtrs = new JButton("Volver Atr\u00E1s");
		btnVolverAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPerfil ventanaperfil = new VentanaPerfil();
				setVisible(false);
				ventanaperfil.setVisible(true);
				ventanaperfil.setLocationRelativeTo(null);			
			}
		});
		btnVolverAtrs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolverAtrs.setBounds(226, 375, 120, 30);
		contentPane.add(btnVolverAtrs);
	}
}
