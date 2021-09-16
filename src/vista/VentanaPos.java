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
		
		JLabel lblTitulo = new JLabel("DEMAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(0, 11, 624, 23);
		contentPane.add(lblTitulo);
		
		JLabel lblTituloVentana = new JLabel("Terminal de Venta");
		lblTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVentana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTituloVentana.setBounds(10, 53, 624, 23);
		contentPane.add(lblTituloVentana);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(66, 145, 321, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(66, 176, 321, 20);
		contentPane.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(66, 116, 321, 20);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(66, 207, 321, 20);
		contentPane.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 148, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 179, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(9, 210, 47, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 243, 46, 14);
		contentPane.add(lblTelefono);
		
		textFieldContenido = new JTextField();
		textFieldContenido.setBounds(118, 382, 269, 20);
		contentPane.add(textFieldContenido);
		textFieldContenido.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(66, 238, 321, 20);
		contentPane.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(118, 413, 269, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		textFieldSeguro = new JTextField();
		textFieldSeguro.setBounds(118, 444, 269, 20);
		contentPane.add(textFieldSeguro);
		textFieldSeguro.setColumns(10);
		
		textFieldDireccionVenta = new JTextField();
		textFieldDireccionVenta.setBounds(118, 351, 269, 20);
		contentPane.add(textFieldDireccionVenta);
		textFieldDireccionVenta.setColumns(10);
		
		textFieldImpuesto = new JTextField();
		textFieldImpuesto.setBounds(118, 475, 269, 20);
		contentPane.add(textFieldImpuesto);
		textFieldImpuesto.setColumns(10);
		
		JLabel lblDireccionEntrega = new JLabel("Direcci\u00F3n Entrega:");
		lblDireccionEntrega.setBounds(10, 354, 98, 14);
		contentPane.add(lblDireccionEntrega);
		
		JLabel lblDireccionOrigen = new JLabel("Direcci\u00F3n Origen:");
		lblDireccionOrigen.setBounds(10, 321, 98, 14);
		contentPane.add(lblDireccionOrigen);
		
		JLabel lblContenido = new JLabel("Contenido:");
		lblContenido.setBounds(10, 385, 98, 14);
		contentPane.add(lblContenido);
		
		JLabel lblInfoVenta = new JLabel("Informaci\u00F3n Venta");
		lblInfoVenta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInfoVenta.setBounds(10, 287, 614, 23);
		contentPane.add(lblInfoVenta);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 416, 98, 14);
		contentPane.add(lblPeso);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(10, 119, 46, 14);
		contentPane.add(lblid);
		
		textFieldDireccionOrigen = new JTextField();
		textFieldDireccionOrigen.setBounds(118, 320, 269, 20);
		contentPane.add(textFieldDireccionOrigen);
		textFieldDireccionOrigen.setColumns(10);
		
		JLabel lblInfoCliente = new JLabel("Informaci\u00F3n Cliente");
		lblInfoCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInfoCliente.setBounds(10, 87, 614, 18);
		contentPane.add(lblInfoCliente);
		
		JLabel lblSeguro = new JLabel("Seguro:");
		lblSeguro.setBounds(10, 447, 98, 14);
		contentPane.add(lblSeguro);
		
		JLabel lblImpuesto = new JLabel("Impuestos de Envio:");
		lblImpuesto.setBounds(10, 478, 98, 14);
		contentPane.add(lblImpuesto);
		
		JLabel lblTotalVenta = new JLabel("Total Venta:");
		lblTotalVenta.setBounds(10, 509, 98, 14);
		contentPane.add(lblTotalVenta);
		
		textFieldTotalVenta = new JTextField();
		textFieldTotalVenta.setBounds(118, 506, 269, 20);
		contentPane.add(textFieldTotalVenta);
		textFieldTotalVenta.setColumns(10);
		
		JLabel lblFormaPago = new JLabel("Forma de Pago");
		lblFormaPago.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFormaPago.setBounds(421, 321, 133, 23);
		contentPane.add(lblFormaPago);
		
		JRadioButton rdbtnEfectivo = new JRadioButton("Efectivo");
		rdbtnEfectivo.setBounds(420, 350, 70, 23);
		contentPane.add(rdbtnEfectivo);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		rdbtnTarjeta.setBounds(421, 381, 70, 23);
		contentPane.add(rdbtnTarjeta);
		
		JButton btnValidarPago = new JButton("Validar Pago");
		btnValidarPago.setBounds(497, 381, 98, 23);
		contentPane.add(btnValidarPago);
		
		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.setBounds(421, 474, 174, 23);
		contentPane.add(btnRegistrarVenta);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(421, 115, 119, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAdicionarCliente = new JButton("Adicionar Cliente");
		btnAdicionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdicionarCliente.setBounds(421, 144, 119, 23);
		contentPane.add(btnAdicionarCliente);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(421, 175, 119, 23);
		contentPane.add(btnActualizar);
		
		JButton btnGenerarRecibo = new JButton("Generar Recibo");
		btnGenerarRecibo.setBounds(421, 505, 174, 23);
		contentPane.add(btnGenerarRecibo);
	}
}
