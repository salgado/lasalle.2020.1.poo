package com.poo.controller;

import java.util.ArrayList;
import java.util.List;

import com.poo.dao.AlunoDAO;
import com.poo.model.Aluno;

public class AlunoController {
	
	//regra para incluir um aluno
	
	public void create(Aluno aluno)
	{
		try {
			AlunoDAO dao = new AlunoDAO();
			
			dao.create(aluno);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro no Controller");
		}
		finally {
			System.out.println("Fim inserção");
		}
	}
	
	public List<Aluno> readAll()
	{
		List<Aluno> alunos = new ArrayList<Aluno>();
		try{
			AlunoDAO dao = new AlunoDAO();
			alunos = dao.readAll();		
		}
		finally {
			//System.out.println("Fim da leitura!");
		}
		
		return alunos;
	}

}
