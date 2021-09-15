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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaGerente extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public VentanaGerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEMAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 434, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenPerfil.png")));
		lblNewLabel_1.setBounds(41, 54, 64, 64);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenSedes.png")));
		lblNewLabel_1_1.setBounds(41, 148, 64, 64);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenGestionUsuarios.png")));
		lblNewLabel_1_1_1.setBounds(41, 242, 64, 64);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenVentas.png")));
		lblNewLabel_1_2.setBounds(41, 336, 64, 64);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenReportes.png")));
		lblNewLabel_1_3.setBounds(41, 430, 64, 64);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(136, 54, 128, 64);
		contentPane.add(btnPerfil);
		
		JButton btnGestionSedes = new JButton("Gestion Sedes");
		btnGestionSedes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionSedes.setBounds(136, 148, 128, 64);
		contentPane.add(btnGestionSedes);
		
		JButton btnGestionUsuarios = new JButton("Gestion Usuarios");
		btnGestionUsuarios.setBounds(136, 242, 128, 64);
		contentPane.add(btnGestionUsuarios);
		
		JButton btnPos = new JButton("POS");
		btnPos.setBounds(136, 336, 128, 64);
		contentPane.add(btnPos);
		
		JButton btnInformes = new JButton("Informes");
		btnInformes.setBounds(136, 430, 128, 64);
		contentPane.add(btnInformes);
	}
}
