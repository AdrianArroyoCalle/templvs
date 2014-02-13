package com.divel.so.templvs;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Templvs extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel info;
	private JButton ayuda;
	private JLabel problema;
	private JTextField input;
	private AbstractAction ayudar;
	private AbstractAction validar;
	private JButton Comprobar;
	public int estado=0;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Templvs inst = new Templvs();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Templvs() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				ayuda = new JButton();
				getContentPane().add(ayuda, BorderLayout.SOUTH);
				ayuda.setText("Ayuda");
				ayuda.setPreferredSize(new java.awt.Dimension(50, 50));
				ayuda.setAction(getAyudar());
			}
			{
				problema = new JLabel();
				getContentPane().add(problema, BorderLayout.CENTER);
				problema.setText("Algunos meses tienen 31 dias, otros 30 ¿cuántos tienen 28?");
				problema.setPreferredSize(new java.awt.Dimension(349, 100));
				problema.setBounds(10, 50, 500, 100);
			}
			{
				Comprobar = new JButton();
				getContentPane().add(Comprobar, BorderLayout.EAST);
				Comprobar.setText("Comprobar");
				Comprobar.setPreferredSize(new java.awt.Dimension(232, 80));
				Comprobar.setAction(getValidar());
			}
			{
				input = new JTextField();
				getContentPane().add(input, BorderLayout.CENTER);
				input.setText("Introduce tu respuesta");
				input.setPreferredSize(new java.awt.Dimension(231, 120));
			}
			{
				info = new JLabel();
				getContentPane().add(info, BorderLayout.NORTH);
				info.setText("TEMPLVS 2.0 (C) Adrián Arroyo Calle para Divel");
				info.setPreferredSize(new java.awt.Dimension(385, 132));
			}
			pack();
			setSize(400, 300
					);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public JLabel getProblema() {
		return problema;
	}
	
	public JTextField getInput() {
		return input;
	}
	
	public JButton getComprobar() {
		return Comprobar;
	}
	
	private AbstractAction getValidar() {
		if(validar == null) {
			validar = new AbstractAction("Comprobar", null) {
				public void actionPerformed(ActionEvent evt) {
					switch(estado){
					//Caso 0
					case 0:{
					String texto=input.getText();
					int comparar=texto.compareTo("12");
					if(comparar==0){
						JOptionPane.showMessageDialog(null, "Correcto");
						estado++;
						problema.setText("¿Cuántas veces se pueden restar 1 de 1111?");
						
					}else{
						JOptionPane.showMessageDialog(null, "Incorrecto, vuelve a intentar");
					}
					}break;
					//Caso 1
					case 1:{
						String texto=input.getText();
						int comparar=texto.compareTo("1");
						if(comparar==0){
							JOptionPane.showMessageDialog(null, "Correcto");
							estado++;
							problema.setText("Si Roberto dispara a 9 pájaros y mata a dos, ¿cuántos quedan?");
							
						}else{
							JOptionPane.showMessageDialog(null, "Incorrecto, vuelve a intentar");
						}
					}break;
		
				case 2:{
					String texto=input.getText();
					int comparar=texto.compareTo("0");
					if(comparar==0){
						JOptionPane.showMessageDialog(null, "Correcto");
						estado++;
						System.exit(0);
						
					}else{
						JOptionPane.showMessageDialog(null, "Incorrecto, vuelve a intentar");
					}
				}break;
				
				}
				}
			};
		}
		return validar;
	}
	
	private AbstractAction getAyudar() {
		if(ayudar == null) {
			ayudar = new AbstractAction("Ayuda", null) {
				public void actionPerformed(ActionEvent evt) {
					try {
						Desktop.getDesktop().browse(new URI("http://sites.google.com/site/divelmedia"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}
		return ayudar;
	}

}
