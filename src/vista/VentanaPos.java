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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldId;
	private JTextField textFieldDireccion;
	private JTextField textFieldContenido;
	private JTextField textFieldTelefono;
	private JTextField textFieldPeso;
	private JTextField textFieldSeguro;
	private JTextField textFieldDireccionVenta;
	private JTextField textFieldImpuesto;
	private JTextField textFieldDireccionOrigen;
	private JTextField textFieldTotalVenta;
	ValidacionTextFields textf = new ValidacionTextFields();
	final VentanaValidacionTarjeta windowtarjeta = new VentanaValidacionTarjeta();


	/**
	 * Create the frame.
	 */
	public VentanaPos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DEMAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(0, 11, 676, 23);
		contentPane.add(lblTitulo);
		
		JLabel lblTituloVentana = new JLabel("Terminal de Venta");
		lblTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVentana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTituloVentana.setBounds(10, 53, 666, 23);
		contentPane.add(lblTituloVentana);
		
		
		//TEXT FIELDS
		textFieldNombre = new JTextField();
		textFieldNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
			}
		});
		textFieldNombre.setBounds(142, 144, 321, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
			}
		});
		textFieldApellido.setBounds(142, 175, 321, 20);
		contentPane.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldId = new JTextField();
		textFieldId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
			}
		});
		textFieldId.setBounds(142, 115, 321, 20);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(142, 206, 321, 20);
		contentPane.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 148, 60, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 179, 60, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(9, 210, 60, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 243, 60, 14);
		contentPane.add(lblTelefono);
		
		textFieldContenido = new JTextField();
		textFieldContenido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
			}
		});
		textFieldContenido.setBounds(172, 383, 269, 20);
		contentPane.add(textFieldContenido);
		textFieldContenido.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
			}
		});
		textFieldTelefono.setBounds(142, 237, 321, 20);
		contentPane.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		textFieldPeso = new JTextField();
		textFieldPeso.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numDecKeyPress(e, textFieldPeso);
			}
		});
		textFieldPeso.setBounds(172, 414, 269, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		textFieldSeguro = new JTextField();
		textFieldSeguro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numDecKeyPress(e, textFieldSeguro);
			}
		});
		textFieldSeguro.setBounds(172, 445, 269, 20);
		contentPane.add(textFieldSeguro);
		textFieldSeguro.setColumns(10);
		
		textFieldDireccionVenta = new JTextField();
		textFieldDireccionVenta.setBounds(172, 352, 269, 20);
		contentPane.add(textFieldDireccionVenta);
		textFieldDireccionVenta.setColumns(10);
		
		textFieldImpuesto = new JTextField();
		textFieldImpuesto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numDecKeyPress(e, textFieldImpuesto);
			}
		});
		textFieldImpuesto.setBounds(172, 476, 269, 20);
		contentPane.add(textFieldImpuesto);
		textFieldImpuesto.setColumns(10);
		
		JLabel lblDireccionEntrega = new JLabel("Direcci\u00F3n Entrega:");
		lblDireccionEntrega.setBounds(10, 354, 130, 14);
		contentPane.add(lblDireccionEntrega);
		
		JLabel lblDireccionOrigen = new JLabel("Direcci\u00F3n Origen:");
		lblDireccionOrigen.setBounds(10, 321, 130, 14);
		contentPane.add(lblDireccionOrigen);
		
		JLabel lblContenido = new JLabel("Contenido:");
		lblContenido.setBounds(10, 385, 130, 14);
		contentPane.add(lblContenido);
		
		JLabel lblInfoVenta = new JLabel("Informaci\u00F3n Venta");
		lblInfoVenta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInfoVenta.setBounds(10, 287, 614, 23);
		contentPane.add(lblInfoVenta);
		
		JLabel lblPeso = new JLabel("Peso (kg):");
		lblPeso.setBounds(10, 416, 130, 14);
		contentPane.add(lblPeso);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(10, 119, 60, 14);
		contentPane.add(lblid);
		
		textFieldDireccionOrigen = new JTextField();
		textFieldDireccionOrigen.setBounds(172, 321, 269, 20);
		contentPane.add(textFieldDireccionOrigen);
		textFieldDireccionOrigen.setColumns(10);
		
		JLabel lblInfoCliente = new JLabel("Informaci\u00F3n Cliente");
		lblInfoCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInfoCliente.setBounds(10, 87, 614, 18);
		contentPane.add(lblInfoCliente);
		
		JLabel lblSeguro = new JLabel("Valor del Seguro:");
		lblSeguro.setBounds(10, 447, 130, 14);
		contentPane.add(lblSeguro);
		
		JLabel lblImpuesto = new JLabel("Impuestos de Envio:");
		lblImpuesto.setBounds(10, 478, 130, 14);
		contentPane.add(lblImpuesto);
		
		JLabel lblTotalVenta = new JLabel("Total Venta:");
		lblTotalVenta.setBounds(10, 509, 130, 14);
		contentPane.add(lblTotalVenta);
		
		textFieldTotalVenta = new JTextField();
		textFieldTotalVenta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numDecKeyPress(e, textFieldTotalVenta);
			}
		});
		textFieldTotalVenta.setBounds(172, 507, 269, 20);
		contentPane.add(textFieldTotalVenta);
		textFieldTotalVenta.setColumns(10);
		
		JLabel lblFormaPago = new JLabel("Forma de Pago");
		lblFormaPago.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFormaPago.setBounds(489, 319, 133, 23);
		contentPane.add(lblFormaPago);
		
		JRadioButton rdbtnEfectivo = new JRadioButton("Efectivo");
		rdbtnEfectivo.setBounds(488, 348, 80, 23);
		contentPane.add(rdbtnEfectivo);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		rdbtnTarjeta.setBounds(489, 379, 70, 23);
		contentPane.add(rdbtnTarjeta);
		
		JButton btnValidarPago = new JButton("Validar Pago");
		btnValidarPago.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowtarjeta.setVisible(true);
				windowtarjeta.setLocationRelativeTo(null);
				dispose();			
			}
		});
		btnValidarPago.setBounds(565, 379, 110, 23);
		contentPane.add(btnValidarPago);
		
		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.setBounds(489, 472, 174, 23);
		contentPane.add(btnRegistrarVenta);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(533, 116, 130, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAdicionarCliente = new JButton("Adicionar Cliente");
		btnAdicionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdicionarCliente.setBounds(533, 145, 130, 23);
		contentPane.add(btnAdicionarCliente);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(533, 176, 130, 23);
		contentPane.add(btnActualizar);
		
		JButton btnGenerarRecibo = new JButton("Generar Recibo");
		btnGenerarRecibo.setBounds(489, 503, 174, 23);
		contentPane.add(btnGenerarRecibo);
		
		JButton btnVolverAtras = new JButton("Volver Atr\u00E1s");
		btnVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGerente ventana = new VentanaGerente();
				setVisible(false);
				ventana.setVisible(true);
				ventana.setLocationRelativeTo(null);
			}
		});
		btnVolverAtras.setBounds(326, 591, 115, 23);
		contentPane.add(btnVolverAtras);
	}
}
