package br.lasalle.oop.exemplo2;

public class Bolsista extends Aluno {
	
	private float bolsa;

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	@Override
	public void pagarMensalidade()
	{
		System.out.println("Aluno Bolsista pagando com desconto!!!!");
	}
}
