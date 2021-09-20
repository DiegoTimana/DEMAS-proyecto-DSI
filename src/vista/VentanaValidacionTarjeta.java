package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ValidacionTextFields;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaValidacionTarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldNumTrajeta;
	private JTextField textFieldCvv;
	ValidacionTextFields textf = new ValidacionTextFields();

	/**
	 * Create the frame.
	 */
	public VentanaValidacionTarjeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValidacionTarjeta = new JLabel("Validaci\u00F3n de Tarjeta");
		lblValidacionTarjeta.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidacionTarjeta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblValidacionTarjeta.setBounds(0, 11, 434, 25);
		contentPane.add(lblValidacionTarjeta);
		
		JLabel lblTipotarjeta = new JLabel("Tipo de Tarjeta:");
		lblTipotarjeta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipotarjeta.setBounds(10, 47, 125, 25);
		contentPane.add(lblTipotarjeta);
		
		JRadioButton rdbtnDebito = new JRadioButton("Debito");
		rdbtnDebito.setBounds(86, 122, 64, 23);
		contentPane.add(rdbtnDebito);
		
		JRadioButton rdbtnCredito = new JRadioButton("Credito");
		rdbtnCredito.setBounds(10, 122, 70, 23);
		contentPane.add(rdbtnCredito);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 192, 113, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Numero de Tarjeta");
		lblNewLabel_3.setBounds(10, 223, 113, 20);
		contentPane.add(lblNewLabel_3);
		
		//TEXT FIELDS
		textFieldNombre = new JTextField();
		textFieldNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
			}
		});
		textFieldNombre.setBounds(133, 192, 224, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldNumTrajeta = new JTextField();
		textFieldNumTrajeta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
			}
		});
		textFieldNumTrajeta.setBounds(133, 223, 224, 20);
		contentPane.add(textFieldNumTrajeta);
		textFieldNumTrajeta.setColumns(10);
		
		JLabel lblVencimientoTarjeta = new JLabel("Fecha de Vencimiento");
		lblVencimientoTarjeta.setBounds(10, 261, 113, 20);
		contentPane.add(lblVencimientoTarjeta);
		
		JLabel lblCvv = new JLabel("CVV");
		lblCvv.setHorizontalAlignment(SwingConstants.LEFT);
		lblCvv.setBounds(10, 297, 113, 20);
		contentPane.add(lblCvv);
		
		textFieldCvv = new JTextField();
		textFieldCvv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
			}
		});
		textFieldCvv.setBounds(133, 297, 224, 20);
		contentPane.add(textFieldCvv);
		textFieldCvv.setColumns(10);
		
		JLabel lblInfoTitular = new JLabel("Informaci\u00F3n del Titular");
		lblInfoTitular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInfoTitular.setBounds(10, 162, 414, 25);
		contentPane.add(lblInfoTitular);
		
		JComboBox comboBoxTipoTarjea = new JComboBox();
		comboBoxTipoTarjea.setModel(new DefaultComboBoxModel(new String[] {"", "Bancolombia", "Visa", "Mastercard", "BBVA", "Colpatria", "Davivienda", "AV Villas", "Colpatria"}));
		comboBoxTipoTarjea.setBounds(10, 83, 140, 22);
		contentPane.add(comboBoxTipoTarjea);
		
		JComboBox comboBoxAnio = new JComboBox();
		comboBoxAnio.setBounds(133, 261, 101, 20);
		contentPane.add(comboBoxAnio);
		
		JComboBox comboBoxMes = new JComboBox();
		comboBoxMes.setBounds(255, 261, 70, 20);
		contentPane.add(comboBoxMes);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(133, 353, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(268, 353, 89, 23);
		contentPane.add(btnCancelar);
	}
}
