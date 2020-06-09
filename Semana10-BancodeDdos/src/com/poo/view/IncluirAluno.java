package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class IncluirAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JButton btnIncluir;
	private JLabel lblMensagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirAluno frame = new IncluirAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IncluirAluno() {
		setTitle("Inclusão de Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblEntreComA = new JLabel("Entre com a Matrícula:");
		lblEntreComA.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblEntreComA);
		
		txtMatricula = new JTextField();
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNome = new JLabel("Entre com o Nome:");
		lblNome.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aluno aluno = new Aluno();
				AlunoController controller = new AlunoController();
				
				aluno.setMatricula(txtMatricula.getText());
				aluno.setNome(txtNome.getText());
				
				controller.create(aluno);
				
				lblMensagem.setText("Aluno Incluido com sucesso!!");
				
				
				
			}
		});
		
		lblMensagem = new JLabel("*******");
		lblMensagem.setFont(new Font("Kohinoor Gujarati", Font.PLAIN, 16));
		lblMensagem.setForeground(Color.RED);
		contentPane.add(lblMensagem);
		contentPane.add(btnIncluir);
		
	}

}
