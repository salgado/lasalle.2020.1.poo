package br.lasalle.oop.exemplo1;

public class PessoaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Funcionario funcionario = new Funcionario();
		
		pessoa.setNome("Alex");
		pessoa.setIdade(10);
		pessoa.setSexo("M");
		
		aluno.setNome("Maria");
		funcionario.setNome("Sr.Jose");
		
		//imprimir valores das classes
		pessoa.listar();
		aluno.listar();
		funcionario.listar();

	}

}
