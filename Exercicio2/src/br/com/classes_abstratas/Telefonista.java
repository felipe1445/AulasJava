package br.com.classes_abstratas;

public class Telefonista extends Funcionario{

	@Override
	public void calculaBonificacao() {		
		this.setSalarioFunc(this.getSalarioFunc() * (1+ 10/100));
	}
}
