import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class PrincipalGUI {

	private JFrame ventana;
	private JTextField tfNombreAsignatura;
	private JLabel lblSaludo;
	private final JPanel AsignaturasAdd = new JPanel();
	private JLabel lblNota;
	private JTextField tfNota;
	private JButton btnAgregarAsignatura;
	private JLabel lblAsignatura1;
	private JLabel lblAsignatura2;
	private JLabel lblAsignatura3;
	private JPanel pEstudiante;
	private JLabel lblNombre;
	private JTextField tfNombre;
	private JLabel lblCarnet;
	private JTextField tfCarnet;
	private JButton btnAddEstudiante;
	
	private Estudiante estPOO;
	private JLabel lblEstudiante;
	private int numeroAsignatura;
	private JLabel lblPromedioGeneral;
	private JLabel lblProm;
	private JButton btnCalcularProm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PrincipalGUI window = new PrincipalGUI();
		window.ventana.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public PrincipalGUI() {
		estPOO = new Estudiante();
		numeroAsignatura = 0;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MiListener oyente = new MiListener();
		
		ventana = new JFrame();
		ventana.setBounds(100, 100, 650, 450);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pEstudiante = new JPanel();
		pEstudiante.setBorder(new TitledBorder(null, "Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ventana.getContentPane().add(pEstudiante, BorderLayout.NORTH);
		
		lblNombre = new JLabel("Nombre:");
		pEstudiante.add(lblNombre);
		
		tfNombre = new JTextField();
		pEstudiante.add(tfNombre);
		tfNombre.setColumns(10);
		
		lblCarnet = new JLabel("Carnet:");
		pEstudiante.add(lblCarnet);
		
		tfCarnet = new JTextField();
		pEstudiante.add(tfCarnet);
		tfCarnet.setColumns(10);
		
		btnAddEstudiante = new JButton("Agregar");
		btnAddEstudiante.addActionListener(oyente);
		pEstudiante.add(btnAddEstudiante);
		
		lblEstudiante = new JLabel("Estudiante: ");
		pEstudiante.add(lblEstudiante);
		
		JPanel pCentro = new JPanel();
		pCentro.setBorder(new TitledBorder(null, "Asignatura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ventana.getContentPane().add(pCentro, BorderLayout.CENTER);
		pCentro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNombreAsig = new JLabel("Nombre: ");
		pCentro.add(lblNombreAsig);
		
		tfNombreAsignatura = new JTextField();
		pCentro.add(tfNombreAsignatura);
		tfNombreAsignatura.setColumns(10);
		
		lblNota = new JLabel("Nota de la asignatura:");
		pCentro.add(lblNota);
		
		tfNota = new JTextField();
		pCentro.add(tfNota);
		tfNota.setColumns(10);
		
		btnAgregarAsignatura = new JButton("Agregar");
		btnAgregarAsignatura.addActionListener(oyente);
		pCentro.add(btnAgregarAsignatura);
		
		lblSaludo = new JLabel("");
		pCentro.add(lblSaludo);
		AsignaturasAdd.setBorder(new TitledBorder(null, "Asignaturas Agregadas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ventana.getContentPane().add(AsignaturasAdd, BorderLayout.SOUTH);
		AsignaturasAdd.setLayout(new GridLayout(0, 3, 0, 0));
		
		lblAsignatura1 = new JLabel("New label");
		AsignaturasAdd.add(lblAsignatura1);
		
		lblAsignatura2 = new JLabel("New label");
		AsignaturasAdd.add(lblAsignatura2);
		
		lblAsignatura3 = new JLabel("New label");
		AsignaturasAdd.add(lblAsignatura3);
		
		lblPromedioGeneral = new JLabel("Promedio General:");
		AsignaturasAdd.add(lblPromedioGeneral);
		
		lblProm = new JLabel("New label");
		AsignaturasAdd.add(lblProm);
		
		btnCalcularProm = new JButton("Calcular Promedio General");
		AsignaturasAdd.add(btnCalcularProm);
		btnCalcularProm.addActionListener(oyente);
		

	}
	
	private class MiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btnAddEstudiante) {
				estPOO.setNombre(tfNombre.getText());
				estPOO.setCarnet(Integer.parseInt(tfCarnet.getText()));
				lblEstudiante.setText("Estudiante: "+estPOO.getNombre()+" carnet: "+estPOO.getCarnet());
			}
			if (e.getSource() == btnAgregarAsignatura) {
				estPOO.setAsignatura(tfNombreAsignatura.getText(), Double.parseDouble(tfNota.getText()), numeroAsignatura);
				
				switch (numeroAsignatura) {
				case 1:
					lblAsignatura1.setText("Asignatura: "+estPOO.getAsignatura(numeroAsignatura));
					break;
				case 2:
					lblAsignatura2.setText("Asignatura: "+estPOO.getAsignatura(numeroAsignatura));
					break;
				case 3:
					lblAsignatura3.setText("Asignatura: "+estPOO.getAsignatura(numeroAsignatura));
					break;
				}
				numeroAsignatura++;
				if (numeroAsignatura>4) {
					btnAgregarAsignatura.setEnabled(false);
				}
				tfNombreAsignatura.setText(null);
				tfNota.setText(null);
			}
			if (e.getSource() == btnCalcularProm) {
				double promedio = estPOO.promGral();
				lblProm.setText(Double.toString(promedio));
			}
		}
		
	}
}
