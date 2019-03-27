package LP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LN.clsGestorLN;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import java.awt.Color;

public class Ventana extends JFrame {
	

	private JPanel contentPane;
	private JTextField textID;
	private JTextField textMarca;
	private JTextField textUnidades;
	private JTextField textColor;
	private JTextField textPrecio;
	private JTextField textFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				clsGestorLN.obtGestor().guardarDatos();
				
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textID = new JTextField();
		textID.setBounds(178, 49, 86, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(178, 80, 86, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textUnidades = new JTextField();
		textUnidades.setBounds(178, 111, 86, 20);
		contentPane.add(textUnidades);
		textUnidades.setColumns(10);
		
		JEditorPane dtrpnCantidad = new JEditorPane();
		dtrpnCantidad.setText("Unidades");
		dtrpnCantidad.setBounds(107, 111, 61, 20);
		contentPane.add(dtrpnCantidad);
		
		JEditorPane dtrpnTamao = new JEditorPane();
		dtrpnTamao.setText("Color");
		dtrpnTamao.setBounds(107, 142, 61, 20);
		contentPane.add(dtrpnTamao);
		
		JEditorPane dtrpnCartuchos = new JEditorPane();
		dtrpnCartuchos.setText("Cartuchos");
		dtrpnCartuchos.setBounds(62, 18, 106, 20);
		contentPane.add(dtrpnCartuchos);
		
		JEditorPane dtrpnMarca = new JEditorPane();
		dtrpnMarca.setText("Marca");
		dtrpnMarca.setBounds(107, 80, 61, 20);
		contentPane.add(dtrpnMarca);
		
		textColor = new JTextField();
		textColor.setBounds(178, 142, 86, 20);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(178, 173, 86, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JEditorPane dtrpnId = new JEditorPane();
		dtrpnId.setText("ID");
		dtrpnId.setBounds(107, 49, 61, 20);
		contentPane.add(dtrpnId);
		
		JEditorPane dtrpnPrecio = new JEditorPane();
		dtrpnPrecio.setText("Precio");
		dtrpnPrecio.setBounds(107, 173, 61, 20);
		contentPane.add(dtrpnPrecio);
		
		textFecha = new JTextField();
		textFecha.setBounds(178, 204, 86, 20);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
		JEditorPane dtrpnFecha = new JEditorPane();
		dtrpnFecha.setText("Fecha");
		dtrpnFecha.setBounds(107, 204, 61, 20);
		contentPane.add(dtrpnFecha);
		
		JButton guardar = new JButton("Dar de Alta");
		guardar.setBackground(Color.GREEN);
		guardar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
			
			int id = Integer.parseInt(textID.getText());
			int cant = Integer.parseInt(textUnidades.getText());
			double pre = Integer.parseInt(textPrecio.getText());
			String fec = textFecha.getText();
			String mar = textMarca.getText();
			String col = textColor.getText();
			
			clsGestorLN.obtGestor().addCartucho( id , cant , pre, fec, mar, col );
			
		}
		});
		guardar.setBounds(419, 323, 101, 23);
		contentPane.add(guardar);
		
		JButton btnDarDeBaja = new JButton("Dar de Baja");
		btnDarDeBaja.setForeground(Color.BLACK);
		btnDarDeBaja.setBackground(new Color(204, 0, 0));
		btnDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			
			
		});
		btnDarDeBaja.setBounds(308, 323, 101, 23);
		contentPane.add(btnDarDeBaja);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(Color.CYAN);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			
			
		});
		btnBuscar.setBounds(308, 357, 101, 23);
		contentPane.add(btnBuscar);
		
		JButton btnNewButton = new JButton("Mostrar Todos");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			
		});
		btnNewButton.setBounds(419, 357, 101, 20);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(308, 30, 212, 282);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 564, 411);
		contentPane.add(scrollPane_1);
	}
}
