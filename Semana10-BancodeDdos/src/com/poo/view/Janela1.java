package com.poo.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Janela1 implements ActionListener {
	
	private JFrame frame = new JFrame();
	private JPanel painel = new JPanel();
	
	private JLabel lblTitulo = new JLabel("Calculadora");
	private JTextField txtNum1 = new JTextField(10);
	private JTextField txtNum2 = new JTextField(10);
	private JButton btnSomar = new JButton("Somar");
	private JLabel lblResultdo = new JLabel("Resultado=");
	
	public Janela1() {
		
		//programar click do botao
		btnSomar.addActionListener(this);
		
		
		 // the panel with the button and text
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        painel.setLayout(new GridLayout(0, 1));
        painel.add(lblTitulo);
        painel.add(txtNum1);
        painel.add(txtNum2);
        painel.add(btnSomar);
        painel.add(lblResultdo);
        
        String [] colunas = {"Nome", "Telefone", "Email"};
        
        Object [][] dados = {
        	    {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
        	    {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
        	    {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"}
        	};
        

        JTable table = new JTable(dados, colunas);

	     // por padrão, vem sem bordas, então colocamos:
	     table.setBorder(new LineBorder(Color.black));
	     table.setGridColor(Color.black);
	     table.setShowGrid(true);
	     
	   
	     
	    painel.add(table); 
	        
        //panel.add(button);
        //panel.add(label);

        // set up the frame and display it
        frame.add(painel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Minha Janela 1");
        frame.pack();
        frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(txtNum1.getText());
		int n2 = Integer.parseInt(txtNum2.getText());
		
		int soma = n1+n2;
		
		lblResultdo.setText( "Resultado = " + soma );
		
	}

}
