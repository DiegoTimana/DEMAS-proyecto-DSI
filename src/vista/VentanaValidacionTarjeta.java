package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ValidacionTextFields;
import controlador.VerificarBtnGuardar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaValidacionTarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldNumTarjeta;
	private JTextField textFieldCvv;
	ValidacionTextFields textf = new ValidacionTextFields();
	VerificarBtnGuardar verificar = new VerificarBtnGuardar();

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
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 192, 113, 20);
		contentPane.add(lblNombre);
		
		JLabel lblNumTarjeta = new JLabel("Numero de Tarjeta");
		lblNumTarjeta.setBounds(10, 223, 113, 20);
		contentPane.add(lblNumTarjeta);
		
		//TEXT FIELDS
		textFieldNombre = new JTextField();
		textFieldNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
				lblNombre.setText("Nombre:");
				lblNombre.setForeground(Color.BLACK);
			}
		});
		textFieldNombre.setBounds(133, 192, 224, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldNumTarjeta = new JTextField();
		textFieldNumTarjeta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
				lblNumTarjeta.setText("Numero de Trajeta:");
				lblNumTarjeta.setForeground(Color.BLACK);
			}
		});
		textFieldNumTarjeta.setBounds(133, 223, 224, 20);
		contentPane.add(textFieldNumTarjeta);
		textFieldNumTarjeta.setColumns(10);
		
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
				lblCvv.setText("CVV:");
				lblCvv.setForeground(Color.BLACK);
			}
		});
		textFieldCvv.setBounds(133, 297, 224, 20);
		contentPane.add(textFieldCvv);
		textFieldCvv.setColumns(10);
		
		JLabel lblInfoTitular = new JLabel("Informaci\u00F3n del Titular");
		lblInfoTitular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInfoTitular.setBounds(10, 162, 414, 25);
		contentPane.add(lblInfoTitular);
		
		JComboBox comboBoxTipoTarjeta = new JComboBox();
		comboBoxTipoTarjeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBoxTipoTarjeta.setForeground(Color.BLACK);
			}
		});
		comboBoxTipoTarjeta.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una Opci\u00F3n", "Bancolombia", "Visa", "Mastercard", "BBVA", "Colpatria", "Davivienda", "AV Villas", "Colpatria"}));
		comboBoxTipoTarjeta.setBounds(10, 83, 140, 22);
		contentPane.add(comboBoxTipoTarjeta);
		
		JComboBox comboBoxAnio = new JComboBox();
		comboBoxAnio.setBounds(133, 261, 101, 20);
		contentPane.add(comboBoxAnio);
		
		JComboBox comboBoxMes = new JComboBox();
		comboBoxMes.setBounds(255, 261, 70, 20);
		contentPane.add(comboBoxMes);
		
		//RADIOBUTTONS
		JRadioButton rdbtnDebito = new JRadioButton("Debito");
		rdbtnDebito.setBounds(86, 122, 64, 23);
		contentPane.add(rdbtnDebito);
		
		JRadioButton rdbtnCredito = new JRadioButton("Credito");
		rdbtnCredito.setBounds(10, 122, 70, 23);
		contentPane.add(rdbtnCredito);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnDebito);
		grupo1.add(rdbtnCredito);
		
		//BOTON DE GUARDAR falta verificar los radio buttons y los combobox
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxTipoTarjeta.getSelectedIndex()==0) {
					comboBoxTipoTarjeta.requestFocus();
					comboBoxTipoTarjeta.setForeground(Color.RED);
				}else {
					if(textFieldNombre.getText().equals("")) {
						verificar.guardar(textFieldNombre,lblNombre);
					}else {
						if(textFieldNumTarjeta.getText().equals("")) {
							verificar.guardar(textFieldNumTarjeta,lblNumTarjeta);
						}else {
							if(textFieldCvv.getText().equals("")) {
								verificar.guardar(textFieldCvv,lblCvv);
							}
						}
					}
				}
			}
		});
		btnAceptar.setBounds(133, 353, 89, 23);
		contentPane.add(btnAceptar);
		
		//BOTON CANCELAR (Vuelve a la ventana anterior)
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPos windowPos = new VentanaPos();
				windowPos.setVisible(true);
				windowPos.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnCancelar.setBounds(268, 353, 89, 23);
		contentPane.add(btnCancelar);
	}
}
