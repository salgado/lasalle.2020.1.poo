package com.oop.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jan implements ActionListener {

	//texto
	private JLabel titulo;
	private JTextField num1;
	private JTextField num2;
	private JButton btnCalc;
	private JLabel resultado;
			
	public Jan()
	{
		//texto
		 titulo = new JLabel("Calculadora");
		 num1 = new JTextField(10);
		num2 = new JTextField(10);
		 btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(this);
		 resultado = new JLabel("Resultado");
		
		JPanel painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        painel.setLayout(new GridLayout(0, 1));
        painel.add(titulo);
        painel.add(num1);
        painel.add(num2);
        painel.add(btnCalc);
        painel.add(resultado);
		
		JFrame frame = new JFrame();
		
		frame.add(painel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calc");
		frame.pack();
		frame.setVisible(true);
	}
	
	// create one Frame
    public static void main(String[] args) {
        new Jan();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		resultado.setText("=" + (Integer.parseInt(num1.getText()) + Integer.parseInt( num2.getText())));
		
	}
}
