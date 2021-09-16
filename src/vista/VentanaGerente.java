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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaGerente extends JFrame {

	private JPanel contentPane;
	final VentanaPerfil windowperfil = new VentanaPerfil();
	final VentanaGestionSedes windowgestionsedes = new VentanaGestionSedes();
	final VentanaGestionUsuarios windowgestionusuarios = new VentanaGestionUsuarios();
	final VentanaPos windowpos = new VentanaPos();
	final VentanaInformes windowinformes = new VentanaInformes();


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
		
		////BOTON PERFIL
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowperfil.setVisible(true);
				windowperfil.setLocationRelativeTo(null);
				dispose();		
			}
		});
		btnPerfil.setBounds(136, 54, 128, 64);
		contentPane.add(btnPerfil);
		
		
		/// BOTON GESTION DE SEDES
		JButton btnGestionSedes = new JButton("Gestion Sedes");
		btnGestionSedes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowgestionsedes.setVisible(true);
				windowgestionsedes.setLocationRelativeTo(null);
				dispose();		
			}
		});
		btnGestionSedes.setBounds(136, 148, 128, 64);
		contentPane.add(btnGestionSedes);
		
		
		/// BOTON GESTION DE USUARIOS
		JButton btnGestionUsuarios = new JButton("Gestion Usuarios");
		btnGestionUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowgestionusuarios.setVisible(true);
				windowgestionusuarios.setLocationRelativeTo(null);
				dispose();		
			}
		});
		btnGestionUsuarios.setBounds(136, 242, 128, 64);
		contentPane.add(btnGestionUsuarios);
		
		
		/// BOTON POS
		JButton btnPos = new JButton("POS");
		btnPos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowpos.setVisible(true);
				windowpos.setLocationRelativeTo(null);
				dispose();		
			}
		});
		btnPos.setBounds(136, 336, 128, 64);
		contentPane.add(btnPos);
		
		
		/// BOTON INFORMES
		JButton btnInformes = new JButton("Informes");
		btnInformes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowinformes.setVisible(true);
				windowinformes.setLocationRelativeTo(null);
				dispose();		
			}
		});
		btnInformes.setBounds(136, 430, 128, 64);
		contentPane.add(btnInformes);
	}
}
