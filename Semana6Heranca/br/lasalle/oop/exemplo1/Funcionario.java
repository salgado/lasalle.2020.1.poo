package br.lasalle.oop.exemplo1;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho()
	{
		System.out.println("Trabalho foi alterado!!");
	}
	
	
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean isTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	
}
