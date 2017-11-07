package laboratorio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JTextField municipio;
	private JLabel lblbase;
	private JLabel lblAl;
	private JLabel lblLargo;
	private JComboBox tanques;
	private JTextField personas;

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
	public Main() 
	{
		initialize();
	}
	
	public void salir()
	{
		System.exit(0);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 724, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tipos = new JComboBox();
		tipos.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(tipos.getSelectedIndex() == 1) {
					lblbase.setText("Radio");
					lblLargo.setVisible(false);
					largo.setVisible(false);
				}	
			}
		});
		tipos.setModel(new DefaultComboBoxModel(new String[] {"Tipos de Tanque:", "Cilindrico", "Cubico", "Otogonal"}));
		tipos.setBounds(17, 21, 164, 27);
		frame.getContentPane().add(tipos);
		
		JLabel lblDimensionales = new JLabel("Dimensionales:");
		lblDimensionales.setBounds(223, 25, 114, 16);
		frame.getContentPane().add(lblDimensionales);
		
		lblAl = new JLabel("Altura:");
		lblAl.setBounds(223, 48, 61, 16);
		frame.getContentPane().add(lblAl);
		
		lblbase = new JLabel("Ancho:");
		lblbase.setBounds(223, 73, 61, 16);
		frame.getContentPane().add(lblbase);
		
		lblLargo = new JLabel("Largo:");
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
		
		municipio = new JTextField();
		municipio.setBounds(223, 147, 114, 26);
		frame.getContentPane().add(municipio);
		municipio.setColumns(10);
		
		JLabel lblCantidadDeAgua = new JLabel("Municipio al que pertenece:");
		lblCantidadDeAgua.setBounds(223, 132, 176, 16);
		frame.getContentPane().add(lblCantidadDeAgua);
		
		tanques = new JComboBox();
		tanques.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un tanque:"}));
		tanques.setBounds(493, 21, 193, 27);
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
				lblLargo.setVisible(true);
				largo.setVisible(true);
					if(tipos.getSelectedIndex() == 0)
					{
						JOptionPane.showMessageDialog(null, "Escoja un tipo de tanque.");
						altura.setText("");
						base.setText("");
						largo.setText("");
						municipio.setText("");
						personas.setText("");
					}
				try 
				{	
					if(tipos.getSelectedIndex() == 1)
					{
						Double.parseDouble(altura.getText());
						Double.parseDouble(base.getText());
						municipio.getText().toString();
						Double.parseDouble(personas.getText());
						lblbase.setText("Base");
						tipos.setSelectedIndex(0);
						tanques.insertItemAt("Cilindrico: "+ altura.getText() +"x"+ base.getText() +" - municipio: "+ municipio.getText(), 1);
						personas.setText("");
						municipio.setText("");
						base.setText("");
						altura.setText("");
					}
				}
				catch(Exception a) 
				{
					JOptionPane.showMessageDialog(null, "Ingrese un dato valido.");
					altura.setText("");
					base.setText("");
					largo.setText("");
					personas.setText("");
					municipio.setText("");
					tipos.setSelectedIndex(0);
				}
				try 
				{
					if(tipos.getSelectedIndex() == 2)
					{
						tipos.setSelectedIndex(0);
						Double.parseDouble(altura.getText());
						Double.parseDouble(base.getText());
						Double.parseDouble(largo.getText());
						municipio.getText().toString();
						Double.parseDouble(personas.getText());
						tipos.setSelectedIndex(0);
						tanques.insertItemAt("Cubico: "+ altura.getText() +"x"+ base.getText() +"x"+ largo.getText() +" - municipio: "+ municipio.getText(),1);
						personas.setText("");
						municipio.setText("");
						base.setText("");
						altura.setText("");
						largo.setText("");
					}
				}	
				catch(Exception a) 
				{
					JOptionPane.showMessageDialog(null, "Ingrese un dato valido.");
					altura.setText("");
					base.setText("");
					largo.setText("");
					personas.setText("");
					municipio.setText("");
					tipos.setSelectedIndex(0);
				}
				try 
				{
					if(tipos.getSelectedIndex() == 3)
					{
						tipos.setSelectedIndex(0);
						Double.parseDouble(altura.getText());
						Double.parseDouble(base.getText());
						Double.parseDouble(largo.getText());
						municipio.getText().toString();
						Double.parseDouble(personas.getText());
						tipos.setSelectedIndex(0);
						tanques.insertItemAt("Ortogonal: "+altura.getText() +"x"+ base.getText() +"x"+ largo.getText() +" - municipio:  "+ municipio.getText(),1);
						personas.setText("");
						municipio.setText("");
						base.setText("");
						altura.setText("");
						largo.setText("");
					}
				}
				catch(Exception a) 
				{
					JOptionPane.showMessageDialog(null, "Ingrese un dato valido.");
					altura.setText("");
					base.setText("");
					largo.setText("");
					personas.setText("");
					municipio.setText("");
					tipos.setSelectedIndex(0);
				}
			}
		});
		btnAgregarTanque.setBounds(223, 231, 140, 29);
		frame.getContentPane().add(btnAgregarTanque);
		
		//Boton para cerrar el programa
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir(); 
			}
		});
		btnSalir.setBounds(437, 259, 117, 29);
		frame.getContentPane().add(btnSalir);
		
		JComboBox disponibilidad = new JComboBox();
		disponibilidad.setModel(new DefaultComboBoxModel(new String[] {"Disponibilidad", "Abierto", "Cerrado"}));
		disponibilidad.setBounds(493, 94, 176, 27);
		frame.getContentPane().add(disponibilidad);
		
		JButton btnNivelDeAgua = new JButton("Nivel de Agua");
		btnNivelDeAgua.setBounds(17, 259, 117, 29);
		frame.getContentPane().add(btnNivelDeAgua);
		
		JButton btnCambiarDiponibilidad = new JButton("Cambiar diponibilidad");
		btnCambiarDiponibilidad.setBounds(499, 127, 164, 29);
		frame.getContentPane().add(btnCambiarDiponibilidad);
		
		JLabel lblCantidadDePersonas = new JLabel("Cantidad de personas en el municipio");
		lblCantidadDePersonas.setBounds(223, 178, 250, 16);
		frame.getContentPane().add(lblCantidadDePersonas);
		
		personas = new JTextField();
		personas.setBounds(223, 193, 130, 26);
		frame.getContentPane().add(personas);
		personas.setColumns(10);
	}
}
