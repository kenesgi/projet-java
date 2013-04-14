package espace;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bandeau extends JFrame {

JPanel panOne = new JPanel();
JPanel panTwo = new JPanel();
JPanel panTT = new JPanel();
JPanel panFour = new JPanel();
JPanel panessai = new JPanel();
JPanel panh = new JPanel();
private JButton bouton = new JButton("Mon bouton");
private JButton bouton2 = new JButton("north");
private JButton bouton3 = new JButton("Monds bouton");
private JButton bouton4 = new JButton("West");
private JButton bouton5 = new JButton("W");
private JButton bouton6 = new JButton("m");
public Bandeau(){

	this.setTitle("Bouton");
	this.setSize(300, 300);
    this.setLocationRelativeTo(null);
		Container c = getContentPane();
		panOne.setLayout(new BorderLayout());
		panTwo.setLayout(new BorderLayout());
		panTT.setLayout(new BorderLayout());
		panFour.setLayout(new BorderLayout());
		panessai.setLayout(new BorderLayout());
		panh.setLayout(new FlowLayout());
		//Bandeau N = new Bandeau();
		//panOne.add(panessai);
		panTwo.add(bouton2);
		panTT.add(bouton3);
		panFour.add(bouton4);
		/*panessai.add(BorderLayout.CENTER, bouton);
		panessai.add(BorderLayout.NORTH, panh);
		panh.add(bouton5);
		panh.add(bouton6);*/
		
	
		c.add(BorderLayout.CENTER, panOne);
		c.add(BorderLayout.NORTH, panTwo);
		c.add(BorderLayout.EAST, panTT);
		c.add(BorderLayout.WEST, panFour);
		setVisible(true);
}
}
