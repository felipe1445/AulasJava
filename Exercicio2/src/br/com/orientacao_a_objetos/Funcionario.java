package br.com.orientacao_a_objetos;

public class Funcionario {
	public String nomeFunc;
	public double salarioFunc = 1000.0;
	

	public void aumentaSalario(double valor) {
		this.salarioFunc+=valor;
	}
	
	public String consultaDados() {
		return "nome do funcionario: "+this.nomeFunc + "\nSalario: R$" + String.valueOf(this.salarioFunc);		
	}
	
	
}

