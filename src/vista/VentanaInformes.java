package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInformes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInformes frame = new VentanaInformes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaInformes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DEMAS");
		lblTitulo.setBounds(5, 5, 485, 32);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		contentPane.add(lblTitulo);
		
		JLabel lblDescripcion = new JLabel("Por favor seleccione el tipo de informe que desea:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcion.setBounds(15, 47, 370, 32);
		contentPane.add(lblDescripcion);
		
		JLabel lblGrCircular = new JLabel("Gr\u00E1fico circular");
		lblGrCircular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrCircular.setBounds(15, 102, 101, 32);
		contentPane.add(lblGrCircular);
		
		JLabel lblGrBarras = new JLabel("Gr\u00E1fico de barras");
		lblGrBarras.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrBarras.setBounds(15, 190, 116, 32);
		contentPane.add(lblGrBarras);
		
		JButton btnGrCircular = new JButton("");
		btnGrCircular.setIcon(new ImageIcon(VentanaInformes.class.getResource("/imagenes/torta.png")));
		btnGrCircular.setBounds(230, 102, 109, 46);
		contentPane.add(btnGrCircular);
		
		JButton btnGrBarras = new JButton("");
		btnGrBarras.setIcon(new ImageIcon(VentanaInformes.class.getResource("/imagenes/report.png")));
		btnGrBarras.setBounds(230, 190, 109, 46);
		contentPane.add(btnGrBarras);
		
		JLabel lblExcel = new JLabel("Reporte en excel");
		lblExcel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExcel.setBounds(15, 278, 116, 32);
		contentPane.add(lblExcel);
		
		JButton btnGrExcel = new JButton("");
		btnGrExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGrExcel.setIcon(new ImageIcon(VentanaInformes.class.getResource("/imagenes/excel.png")));
		btnGrExcel.setBounds(230, 278, 109, 46);
		contentPane.add(btnGrExcel);
	}
}
