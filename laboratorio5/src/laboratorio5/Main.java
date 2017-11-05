package laboratorio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JComboBox tipos;
	private JTextField altura;
	private JTextField base;
	private JTextField largo;
	private JTextField cantidadAgua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	
	public void salir()
	{
		System.exit(0);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 724, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tipos = new JComboBox();
		tipos.setModel(new DefaultComboBoxModel(new String[] {"Tipos de Tanque:", "Cilindrico", "Cubico", "Otogonal"}));
		tipos.setBounds(17, 21, 164, 27);
		frame.getContentPane().add(tipos);
		
		JLabel lblDimensionales = new JLabel("Dimensionales:");
		lblDimensionales.setBounds(223, 25, 114, 16);
		frame.getContentPane().add(lblDimensionales);
		
		JLabel lblAl = new JLabel("Altura:");
		lblAl.setBounds(223, 48, 61, 16);
		frame.getContentPane().add(lblAl);
		
		JLabel lblBase = new JLabel("Ancho:");
		lblBase.setBounds(223, 73, 61, 16);
		frame.getContentPane().add(lblBase);
		
		JLabel lblLargo = new JLabel("Largo:");
		lblLargo.setBounds(223, 98, 61, 16);
		frame.getContentPane().add(lblLargo);
		
		altura = new JTextField();
		altura.setBounds(276, 45, 61, 26);
		frame.getContentPane().add(altura);
		altura.setColumns(10);
		
		base = new JTextField();
		base.setColumns(10);
		base.setBounds(276, 70, 61, 26);
		frame.getContentPane().add(base);
		
		largo = new JTextField();
		largo.setColumns(10);
		largo.setBounds(276, 95, 61, 26);
		frame.getContentPane().add(largo);
		
		cantidadAgua = new JTextField();
		cantidadAgua.setBounds(223, 147, 114, 26);
		frame.getContentPane().add(cantidadAgua);
		cantidadAgua.setColumns(10);
		
		JLabel lblCantidadDeAgua = new JLabel("Cantidad de agua:");
		lblCantidadDeAgua.setBounds(223, 132, 114, 16);
		frame.getContentPane().add(lblCantidadDeAgua);
		
		JComboBox tanques = new JComboBox();
		tanques.setModel(new DefaultComboBoxModel(new String[] {"Numero de tanque:", ""}));
		tanques.setBounds(493, 21, 176, 27);
		frame.getContentPane().add(tanques);
		
		JLabel nivelDeAgua = new JLabel("----");
		nivelDeAgua.setBounds(499, 73, 148, 16);
		frame.getContentPane().add(nivelDeAgua);
		
		JLabel lblNivelDeAgua = new JLabel("Nivel de agua");
		lblNivelDeAgua.setBounds(499, 48, 101, 16);
		frame.getContentPane().add(lblNivelDeAgua);
		
		JButton btnAgregarTanque = new JButton("Agregar tanque");
		btnAgregarTanque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altura.setText("");
				base.setText("");
				largo.setText("");
				cantidadAgua.setText("");
			}
		});
		btnAgregarTanque.setBounds(223, 188, 140, 29);
		frame.getContentPane().add(btnAgregarTanque);
		
		//Boton para cerrar el programa
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir(); 
			}
		});
		btnSalir.setBounds(301, 259, 117, 29);
		frame.getContentPane().add(btnSalir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Disponibilidad", "Abierto", "Cerrado"}));
		comboBox.setBounds(493, 94, 176, 27);
		frame.getContentPane().add(comboBox);
		
		JButton btnNivelDeAgua = new JButton("Nivel de Agua");
		btnNivelDeAgua.setBounds(17, 259, 117, 29);
		frame.getContentPane().add(btnNivelDeAgua);
		
		JButton btnCambiarDiponibilidad = new JButton("Cambiar diponibilidad");
		btnCambiarDiponibilidad.setBounds(499, 127, 164, 29);
		frame.getContentPane().add(btnCambiarDiponibilidad);
	}
}
