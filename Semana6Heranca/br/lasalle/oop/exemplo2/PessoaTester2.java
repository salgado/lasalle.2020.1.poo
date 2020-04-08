package br.lasalle.oop.exemplo2;

public class PessoaTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pessoa pessoa = new Pessoa();	
		Visitante visitante = new Visitante();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		visitante.setNome("AlunoVisitante");
		aluno.setNome("Aluno1");
		prof.setNome("ProfAlex");
		prof.setIdade(20);
		prof.fazerAniversario();
		
		//prof.listar();
		
		Bolsista bolsista = new Bolsista();
		bolsista.setNome("AlunoBolsa");
		bolsista.listar();
		bolsista.pagarMensalidade();
		
		
	}

}
