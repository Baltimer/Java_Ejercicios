package org.foobarspam.InterficiesGraficas.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class prueba {

	private JFrame frame;
	private JTextField txtIntroduceDni;
	ArrayList<Solicitante> solicitantes = new ArrayList<Solicitante>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
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
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Solicitante solicitante = new Solicitante(txtIntroduceDni.getText(), 
						getSelectedCheckBox(), comboBox.getSelectedItem().toString() );
				solicitantes.add(solicitante);
				JOptionPane.showMessageDialog(null, "Añadido solicitante correctamente.");
			}
		});
		btnAceptar.setBounds(29, 262, 133, 52);
		frame.getContentPane().add(btnAceptar);
		
		
		btnLimpiar.setBounds(174, 262, 133, 52);
		frame.getContentPane().add(btnLimpiar);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxAtur.setSelected(false);
				chckbxNewCheckBox.setSelected(false);
				chckbxTreballador.setSelected(false);
				txtIntroduceDni.setText("");
			}
		});
		
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try(FileWriter fw = new FileWriter("src/org/foobarspam/InterficiesGraficas/main/EstatSolicitants.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter out = new PrintWriter(bw)) {
					for (int i = 0; i<solicitantes.size(); i++) {
						out.println(solicitantes.get(i).getDni()+", "+ 
									solicitantes.get(i).getEstado()+", "+
									solicitantes.get(i).getSexo()+".");
					}
					} catch (IOException error) {
						System.out.println(error);
					}
				System.exit(0);
			}
		});
		btnSalir.setBounds(318, 262, 133, 52);
		frame.getContentPane().add(btnSalir);
		
		
		chckbxAtur.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxAtur.setBounds(41, 143, 73, 25);
		frame.getContentPane().add(chckbxAtur);
		chckbxAtur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxNewCheckBox.setSelected(false);
				chckbxTreballador.setSelected(false);
			}
		});
		
		
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxNewCheckBox.setBounds(189, 143, 105, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxAtur.setSelected(false);
				chckbxTreballador.setSelected(false);
			}
		});
		
		
		chckbxTreballador.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxTreballador.setBounds(338, 143, 113, 25);
		frame.getContentPane().add(chckbxTreballador);
		chckbxTreballador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxNewCheckBox.setSelected(false);
				chckbxAtur.setSelected(false);
			}
		});
		
		
		lblEstat.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEstat.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstat.setBounds(12, 101, 459, 25);
		frame.getContentPane().add(lblEstat);
		
		
		lblSexe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSexe.setBounds(84, 192, 65, 36);
		frame.getContentPane().add(lblSexe);
		
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Home", "Dona"}));
		comboBox.setBounds(174, 195, 210, 36);
		frame.getContentPane().add(comboBox);
		
		
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDni.setBounds(95, 25, 54, 44);
		frame.getContentPane().add(lblDni);
		
		txtIntroduceDni = new JTextField();
		txtIntroduceDni.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtIntroduceDni.setText("Introduce DNI");
		txtIntroduceDni.setBounds(162, 34, 237, 30);
		frame.getContentPane().add(txtIntroduceDni);
		txtIntroduceDni.setColumns(10);
	}
	
	// Botones
	JButton btnAceptar = new JButton("Aceptar");
	JButton btnLimpiar = new JButton("Limpiar");
	JButton btnSalir = new JButton("Salir");
	
	// Labels
	JLabel lblEstat = new JLabel("Estat de l'Usuari:");
	JLabel lblSexe = new JLabel("Sexe:");
	JLabel lblDni = new JLabel("DNI:");
	
	// CheckBox
	JCheckBox chckbxAtur = new JCheckBox("Atur");
	JCheckBox chckbxNewCheckBox = new JCheckBox("Estodiant");
	JCheckBox chckbxTreballador = new JCheckBox("Treballador");
	
	// ComboBox
	JComboBox comboBox = new JComboBox();
	
	
	/**
	 * Funcion para obtener el checkbox seleccionado
	 */
	public String getSelectedCheckBox() {
		if (chckbxNewCheckBox.isSelected()) {
			return chckbxNewCheckBox.getText();
		}
		else if (chckbxAtur.isSelected()) {
			return chckbxAtur.getText();
		}
		else if (chckbxTreballador.isSelected()){
			return chckbxTreballador.getText();
		}
		else {
			return "Indefinido";
		}
}
}
