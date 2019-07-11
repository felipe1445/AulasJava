package br.com.orientacao_a_objetos;

public class Telefonista extends Funcionario{
	private int codEstacao;

	public Telefonista(String nomeFunc, double salarioFunc, int codEstacao) {
		super(nomeFunc, salarioFunc);
		this.codEstacao = codEstacao;
	}

	public int getCodEstacao() {
		return codEstacao;
	}

	public void setCodEstacao(int codEstacao) {
		this.codEstacao = codEstacao;
	}
	@Override
	public void mostraDados() {
		System.out.println("\nNome do funcionario: "+this.getNomeFunc() + "\nSalario: R$" 
				+ String.valueOf(this.getSalarioFunc())
					+ "\nBonificação: " +this.getBonificacao() +"%"
						+ "\nCodigo Estação: " + this.getCodEstacao());		
	}
	
	
}
