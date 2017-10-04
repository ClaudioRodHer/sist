package com.mad.modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mad.vista.FrmEntrada;
import com.toedter.calendar.JDateChooser;

public class Frmcontador extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JComboBox cmbMaterial;
	private JComboBox cmbCodigo;
	private JComboBox cmbMaquina;
	private JComboBox cmbTurno;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmcontador frame = new Frmcontador();
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frmcontador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setVisible(true);
		
		JLabel lblMaterial = new JLabel("Material");
		lblMaterial.setForeground(Color.YELLOW);
		lblMaterial.setBounds(34, 58, 46, 14);
		contentPane.add(lblMaterial);
		
		cmbMaterial = new JComboBox();
		cmbMaterial.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "alg 100% indigo", "Azul Intenso", "alg 100% Negro", "Indigo con Goma"}));
		cmbMaterial.setBounds(34, 40, 204, 20);
		contentPane.add(cmbMaterial);
		
		cmbCodigo = new JComboBox();
		cmbCodigo.setModel(new DefaultComboBoxModel(new String[] {"-Selccione-", "DFM00002", "DFL00003", "DFL00004", "DFL00009"}));
		cmbCodigo.setBounds(34, 94, 204, 20);
		contentPane.add(cmbCodigo);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setForeground(Color.YELLOW);
		lblCodigo.setBounds(34, 114, 46, 14);
		contentPane.add(lblCodigo, BorderLayout.WEST);
		
		JLabel lblMaquina = new JLabel("Maquina");
		lblMaquina.setForeground(Color.YELLOW);
		lblMaquina.setBounds(34, 176, 46, 14);
		contentPane.add(lblMaquina);
		
		cmbMaquina = new JComboBox();
		cmbMaquina.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "1", "2"}));
		cmbMaquina.setBounds(34, 156, 77, 20);
		contentPane.add(cmbMaquina);
		
		JLabel lblControlDeMateria = new JLabel("CONTROL DE MATERIA PRIMA ENTRADA");
		lblControlDeMateria.setForeground(new Color(0, 128, 0));
		lblControlDeMateria.setBounds(118, 11, 238, 14);
		contentPane.add(lblControlDeMateria);
		
		JDateChooser dtcFecha = new JDateChooser();
		dtcFecha.setBounds(277, 40, 111, 20);
		contentPane.add(dtcFecha);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.YELLOW);
		lblFecha.setBounds(277, 58, 46, 14);
		contentPane.add(lblFecha);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(277, 94, 111, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setForeground(Color.YELLOW);
		lblPeso.setBounds(277, 114, 46, 14);
		contentPane.add(lblPeso);
		
		cmbTurno = new JComboBox();
		cmbTurno.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "1", "2", "3", "4"}));
		cmbTurno.setBounds(277, 156, 111, 20);
		contentPane.add(cmbTurno);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setForeground(Color.YELLOW);
		lblTurno.setBounds(277, 176, 46, 14);
		contentPane.add(lblTurno);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(34, 286, 358, 106);
		contentPane.add(txtResultado);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtPeso.setText("");
				cmbCodigo.setSelectedItem("");
				cmbMaquina.setSelectedItem("");
				cmbMaterial.setSelectedItem("");
				cmbTurno.setSelectedItem("");
				dtcFecha.setCalendar(null);
			}
		});
		btnNuevo.setBounds(34, 252, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(133, 252, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				FrmEntrada entrada =  new FrmEntrada();
					
				entrada.Peso = Double.parseDouble(txtPeso.getText());
				/*if (entrada.Pesos.trim.length()==0) {//<--- trim elimina los espacios
					JOptionPane.showMessageDialog(rootPane, "ingresa bien el peso,intente de nuevo");
					txtPeso.requestFocus();
					txtPeso.setText(null);//<-- quita los espacios
					
				}else*/ if (dtcFecha.getCalendar()== null) {
					JOptionPane.showMessageDialog(rootPane,"ingrese la fecha de operacion");
					dtcFecha.requestFocus();
					
				}else if (cmbMaterial.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(rootPane, "Seleccione el Tipo de Material");
					cmbMaterial.requestFocus();
				}else if (cmbCodigo.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(rootPane, "Seleccione el Tipo de Codigo");
					cmbCodigo.requestFocus();
					
				}else if (cmbMaquina.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(rootPane, "Seleccione el Numero de Maquina");
					cmbMaquina.requestFocus();
					
				}else if (cmbTurno.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(rootPane, "Seleccione el Turno Correspondiente");
					cmbTurno.requestFocus();
					
				}else {
					Date inicio = dtcFecha.getCalendar().getTime();//extrae la fecha y el tiempo
					SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
					entrada.Fecha = formato.format(inicio);
					//Date salida = dtcFecha.getCalendar().getTime();
					JOptionPane.showMessageDialog(rootPane, entrada.Mostrar());
				}
				
				/*entrada.Material = cmbMaquina.getSelectedItem().toString();
				entrada.Codigo =cmbCodigo.getSelectedItem().toString();
				entrada.Material =cmbMaterial.getSelectedItem().toString();
				entrada.Turno =cmbTurno.getSelectedItem().toString();
				entrada.Peso = Double.parseDouble(txtPeso.getText());
				entrada.Fecha = dtcFecha.getCalendar().toString();
				txtResultado.setText(entrada.Mostrar());
				} catch (Exception err) {
					// TODO: handle exception
				}*/
			}
		});
		btnMostrar.setBounds(234, 252, 89, 23);
		contentPane.add(btnMostrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(333, 252, 89, 23);
		contentPane.add(btnSalir);
		System.exit(0);
	}
}

