package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Create the frame.
	 */
	public VentanaPos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEMAS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(0, 11, 624, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Terminal de Venta");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 53, 624, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(66, 145, 321, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 176, 321, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 116, 321, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 207, 321, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(10, 148, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido:");
		lblNewLabel_3.setBounds(10, 179, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_4.setBounds(9, 210, 47, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono:");
		lblNewLabel_5.setBounds(10, 243, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 382, 269, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(66, 238, 321, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(118, 413, 269, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(118, 444, 269, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(118, 351, 269, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(118, 475, 269, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Direcci\u00F3n Entrega:");
		lblNewLabel_6.setBounds(10, 354, 98, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Direcci\u00F3n Origen:");
		lblNewLabel_7.setBounds(10, 321, 98, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Contenido:");
		lblNewLabel_8.setBounds(10, 385, 98, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Informaci\u00F3n Venta");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_9.setBounds(10, 287, 614, 23);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Peso:");
		lblNewLabel_10.setBounds(10, 416, 98, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("ID:");
		lblNewLabel_11.setBounds(10, 119, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(118, 320, 269, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Informaci\u00F3n Cliente");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_12.setBounds(10, 87, 614, 18);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Seguro:");
		lblNewLabel_13.setBounds(10, 447, 98, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Impuestos de Envio:");
		lblNewLabel_14.setBounds(10, 478, 98, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Total Venta:");
		lblNewLabel_15.setBounds(10, 509, 98, 14);
		contentPane.add(lblNewLabel_15);
		
		textField_11 = new JTextField();
		textField_11.setBounds(118, 506, 269, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Forma de Pago");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_16.setBounds(421, 321, 133, 23);
		contentPane.add(lblNewLabel_16);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Efectivo");
		rdbtnNewRadioButton.setBounds(420, 350, 70, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tarjeta");
		rdbtnNewRadioButton_1.setBounds(421, 381, 70, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Validar Pago");
		btnNewButton.setBounds(497, 381, 98, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar Venta");
		btnNewButton_1.setBounds(421, 474, 174, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.setBounds(421, 115, 119, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Adicionar Cliente");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(421, 144, 119, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Actualizar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(421, 175, 119, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Generar Recibo");
		btnNewButton_5.setBounds(421, 505, 174, 23);
		contentPane.add(btnNewButton_5);
	}
}
