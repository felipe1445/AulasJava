package br.com.polimorfismo;

public class ContaCorrente extends Conta{
	private double limite;
	@Override
	public void imprimeExtratoDetalhado() {
		System.out.println("extrato da conta corrente");
		
	}
	
	
}
