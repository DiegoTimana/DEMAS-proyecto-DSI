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
    VerificarBtnGuardar verificar = new VerificarBtnGuardar();


	/**
	 * Create the frame.
	 */
	public VentanaPos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DEMAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(0, 11, 837, 23);
		contentPane.add(lblTitulo);
		
		JLabel lblTituloVentana = new JLabel("Terminal de Venta");
		lblTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVentana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTituloVentana.setBounds(10, 53, 827, 23);
		contentPane.add(lblTituloVentana);
		
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 148, 216, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 179, 216, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(9, 210, 217, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 243, 216, 14);
		contentPane.add(lblTelefono);
		
		
		JLabel lblDireccionEntrega = new JLabel("Direcci\u00F3n Entrega:");
		lblDireccionEntrega.setBounds(10, 354, 216, 14);
		contentPane.add(lblDireccionEntrega);
		
		JLabel lblDireccionOrigen = new JLabel("Direcci\u00F3n Origen:");
		lblDireccionOrigen.setBounds(10, 321, 216, 14);
		contentPane.add(lblDireccionOrigen);
		
		JLabel lblContenido = new JLabel("Contenido:");
		lblContenido.setBounds(10, 385, 216, 14);
		contentPane.add(lblContenido);
		
		JLabel lblInfoVenta = new JLabel("Informaci\u00F3n Venta");
		lblInfoVenta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInfoVenta.setBounds(10, 287, 614, 23);
		contentPane.add(lblInfoVenta);
		
		JLabel lblPeso = new JLabel("Peso (kg):");
		lblPeso.setBounds(10, 416, 216, 14);
		contentPane.add(lblPeso);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(10, 119, 216, 14);
		contentPane.add(lblid);
		
		JLabel lblInfoCliente = new JLabel("Informaci\u00F3n Cliente");
		lblInfoCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInfoCliente.setBounds(10, 87, 614, 18);
		contentPane.add(lblInfoCliente);
		
		JLabel lblSeguro = new JLabel("Valor del Seguro:");
		lblSeguro.setBounds(10, 447, 216, 14);
		contentPane.add(lblSeguro);
		
		JLabel lblImpuesto = new JLabel("Impuestos de Envio:");
		lblImpuesto.setBounds(10, 478, 216, 14);
		contentPane.add(lblImpuesto);
		
		JLabel lblTotalVenta = new JLabel("Total Venta:");
		lblTotalVenta.setBounds(10, 509, 216, 14);
		contentPane.add(lblTotalVenta);
		
		JLabel lblFormaPago = new JLabel("Forma de Pago");
		lblFormaPago.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFormaPago.setBounds(618, 320, 133, 23);
		contentPane.add(lblFormaPago);
		
		
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
		textFieldNombre.setBounds(236, 144, 341, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
				lblApellido.setText("Apellido:");
				lblApellido.setForeground(Color.BLACK);
			}
		});
		textFieldApellido.setBounds(236, 175, 341, 20);
		contentPane.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldId = new JTextField();
		textFieldId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
				lblid.setText("ID:");
				lblid.setForeground(Color.BLACK);
			}
		});
		textFieldId.setBounds(236, 115, 341, 20);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblDireccion.setText("Dirección:");
				lblDireccion.setForeground(Color.BLACK);
			}
		});
		textFieldDireccion.setBounds(236, 206, 341, 20);
		contentPane.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		textFieldContenido = new JTextField();
		textFieldContenido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.textKeyPress(e);
				lblContenido.setText("Contenido:");
				lblContenido.setForeground(Color.BLACK);
			}
		});
		textFieldContenido.setBounds(236, 383, 341, 20);
		contentPane.add(textFieldContenido);
		textFieldContenido.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numKeyPress(e);
				lblTelefono.setText("Telefono:");
				lblTelefono.setForeground(Color.BLACK);
			}
		});
		textFieldTelefono.setBounds(236, 237, 341, 20);
		contentPane.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		textFieldPeso = new JTextField();
		textFieldPeso.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numDecKeyPress(e, textFieldPeso);
				lblPeso.setText("Peso (Kg):");
				lblPeso.setForeground(Color.BLACK);
			}
		});
		textFieldPeso.setBounds(236, 414, 341, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		textFieldSeguro = new JTextField();
		textFieldSeguro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numDecKeyPress(e, textFieldSeguro);
				lblSeguro.setText("Valor Seguro:");
				lblSeguro.setForeground(Color.BLACK);
			}
		});
		textFieldSeguro.setBounds(236, 445, 341, 20);
		contentPane.add(textFieldSeguro);
		textFieldSeguro.setColumns(10);
		
		textFieldDireccionVenta = new JTextField();
		textFieldDireccionVenta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblDireccionEntrega.setText("Dirección Origen:");
				lblDireccionEntrega.setForeground(Color.BLACK);
			}
		});
		textFieldDireccionVenta.setBounds(236, 352, 341, 20);
		contentPane.add(textFieldDireccionVenta);
		textFieldDireccionVenta.setColumns(10);
		
		textFieldImpuesto = new JTextField();
		textFieldImpuesto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numDecKeyPress(e, textFieldImpuesto);
				lblImpuesto.setText("Impuestos de Envio:");
				lblImpuesto.setForeground(Color.BLACK);
			}
		});
		textFieldImpuesto.setBounds(236, 476, 341, 20);
		contentPane.add(textFieldImpuesto);
		textFieldImpuesto.setColumns(10);

		
		textFieldDireccionOrigen = new JTextField();
		textFieldDireccionOrigen.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblDireccionOrigen.setText("Dirección Origen:");
				lblDireccionOrigen.setForeground(Color.BLACK);
			}
		});
		textFieldDireccionOrigen.setBounds(236, 321, 341, 20);
		contentPane.add(textFieldDireccionOrigen);
		textFieldDireccionOrigen.setColumns(10);
				
		textFieldTotalVenta = new JTextField();
		textFieldTotalVenta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textf.numDecKeyPress(e, textFieldTotalVenta);
			}
		});
		textFieldTotalVenta.setBounds(236, 507, 341, 20);
		textFieldTotalVenta.setEditable(false);
		contentPane.add(textFieldTotalVenta);
		textFieldTotalVenta.setColumns(10);
		
	
		JRadioButton rdbtnEfectivo = new JRadioButton("Efectivo");
		rdbtnEfectivo.setBounds(617, 349, 80, 23);
		contentPane.add(rdbtnEfectivo);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		rdbtnTarjeta.setBounds(618, 380, 70, 23);
		contentPane.add(rdbtnTarjeta);
		
		JButton btnValidarPago = new JButton("Validar Pago");
		btnValidarPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValidarPago.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowtarjeta.setVisible(true);
				windowtarjeta.setLocationRelativeTo(null);
				dispose();			
			}
		});
		btnValidarPago.setBounds(694, 380, 110, 23);
		contentPane.add(btnValidarPago);
		
		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarVenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textFieldDireccionOrigen.getText().equals("")) {
					verificar.guardar(textFieldDireccionOrigen,lblDireccionOrigen);
				}else {
					if(textFieldDireccionVenta.getText().equals("")) {
						verificar.guardar(textFieldDireccionVenta,lblDireccionEntrega);
					}else {
						if(textFieldContenido.getText().equals("")) {
							verificar.guardar(textFieldContenido,lblContenido);
						}else {
							if(textFieldPeso.getText().equals("")) {
								verificar.guardar(textFieldPeso,lblPeso);
							}else {
								if(textFieldSeguro.getText().equals("")) {
									verificar.guardar(textFieldSeguro,lblSeguro);
								}else {
									if(textFieldImpuesto.getText().equals("")) {
										verificar.guardar(textFieldImpuesto,lblImpuesto);
									}
								}
							}
						}
					}
				}
			}
		});
		btnRegistrarVenta.setBounds(630, 476, 174, 23);
		contentPane.add(btnRegistrarVenta);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(674, 119, 130, 23);
		contentPane.add(btnBuscar);
		
		
		//BOTON GUARDAR CLIENTE (se verifica que los campos no esten vacios)
		JButton btnAdicionarCliente = new JButton("Adicionar Cliente");
		btnAdicionarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textFieldId.getText().equals("")) {
					verificar.guardar(textFieldId,lblid);
				}else {
					if(textFieldNombre.getText().equals("")) {
						verificar.guardar(textFieldNombre,lblNombre);
					}else {
						if(textFieldApellido.getText().equals("")) {
							verificar.guardar(textFieldApellido,lblApellido);
						}else {
							if(textFieldDireccion.getText().equals("")) {
								verificar.guardar(textFieldDireccion,lblDireccion);
							}else {
								if(textFieldTelefono.getText().equals("")) {
									verificar.guardar(textFieldTelefono,lblTelefono);
								}
							}
						}
					}
				}
			}
		});
		btnAdicionarCliente.setBounds(674, 148, 130, 23);
		contentPane.add(btnAdicionarCliente);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(674, 179, 130, 23);
		contentPane.add(btnActualizar);
		
		JButton btnGenerarRecibo = new JButton("Generar Recibo");
		btnGenerarRecibo.setBounds(630, 507, 174, 23);
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
		btnVolverAtras.setBounds(370, 591, 115, 23);
		contentPane.add(btnVolverAtras);
		
		
		//BOTON LIMPIAR, PARA LA PARTE DEL CLIENTE
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar.limpiar(textFieldId);
				verificar.limpiar(textFieldNombre);
				verificar.limpiar(textFieldApellido);
				verificar.limpiar(textFieldDireccion);
				verificar.limpiar(textFieldTelefono);				
			}
		});
		btnLimpiar.setBounds(674, 210, 130, 23);
		contentPane.add(btnLimpiar);
		
		//BOTON LIMPIAR PARA LA PARTE DE LA VENTA
		JButton btnLimpiar2 = new JButton("Limpiar");
		btnLimpiar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar.limpiar(textFieldDireccionOrigen);
				verificar.limpiar(textFieldDireccionVenta);
				verificar.limpiar(textFieldContenido);
				verificar.limpiar(textFieldPeso);
				verificar.limpiar(textFieldSeguro);
				verificar.limpiar(textFieldImpuesto);
				verificar.limpiar(textFieldTotalVenta);
			}
		});
		btnLimpiar2.setBounds(630, 540, 174, 23);
		contentPane.add(btnLimpiar2);
	}
}
