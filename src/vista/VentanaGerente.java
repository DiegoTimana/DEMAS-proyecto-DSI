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
		
		JLabel lblTitulo = new JLabel("DEMAS");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 11, 434, 32);
		contentPane.add(lblTitulo);
		
		JLabel lblimgperfil = new JLabel("");
		lblimgperfil.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenPerfil.png")));
		lblimgperfil.setBounds(41, 54, 64, 64);
		contentPane.add(lblimgperfil);
		
		JLabel lblimgestionsedes = new JLabel("");
		lblimgestionsedes.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenSedes.png")));
		lblimgestionsedes.setBounds(41, 148, 64, 64);
		contentPane.add(lblimgestionsedes);
		
		JLabel lblimggestionusu = new JLabel("");
		lblimggestionusu.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenGestionUsuarios.png")));
		lblimggestionusu.setBounds(41, 242, 64, 64);
		contentPane.add(lblimggestionusu);
		
		JLabel lblimgpos = new JLabel("");
		lblimgpos.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenVentas.png")));
		lblimgpos.setBounds(41, 336, 64, 64);
		contentPane.add(lblimgpos);
		
		JLabel lblimginformes = new JLabel("");
		lblimginformes.setIcon(new ImageIcon(VentanaGerente.class.getResource("/imagenes/imagenReportes.png")));
		lblimginformes.setBounds(41, 430, 64, 64);
		contentPane.add(lblimginformes);
		
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
