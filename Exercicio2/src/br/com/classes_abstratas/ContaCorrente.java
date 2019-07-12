package br.com.classes_abstratas;

public class ContaCorrente extends Conta{
	private double limite;
	@Override
	public void imprimeExtratoDetalhado() {
		System.out.println("extrato da conta corrente");
		
	}
	
	
}
