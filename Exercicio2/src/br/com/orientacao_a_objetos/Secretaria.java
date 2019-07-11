package br.com.orientacao_a_objetos;

public class Secretaria extends Funcionario{
	
	private int numRamal;
	
	

	public Secretaria(String nomeFunc, double salarioFunc, int numRamal) {
		super(nomeFunc, salarioFunc);
		this.numRamal = numRamal;
	}	

	public int getNumRamal() {
		return numRamal;
	}

	public void setNumRamal(int numRamal) {
		this.numRamal = numRamal;
	}
	
	
	@Override
	public void mostraDados() {
		System.out.println("\nNome do funcionario: "+this.getNomeFunc() + "\nSalario: R$" 
				+ String.valueOf(this.getSalarioFunc())
					+ "\nBonificação: " +this.getBonificacao() +"%"
						+ "\nNumero do Ramal: " + this.getNumRamal());		
	}

}
