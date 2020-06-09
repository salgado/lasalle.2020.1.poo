package com.oop.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaJanela1 extends JFrame {
	
	public MinhaJanela1()
	{
		setLayout(new FlowLayout());
		
		JLabel texto = new JLabel("Bemvindo a TEla1");
		add(texto);
		
		JButton fechar = new JButton("Fechar");
		add(fechar); 
		
		setVisible(true);
		
		setSize(400, 400);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
