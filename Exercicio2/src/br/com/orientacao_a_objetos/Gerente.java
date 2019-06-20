package br.com.orientacao_a_objetos;

public class Gerente {
	public String nome;
	public double salario;
	
	//metodo com taxa fixa
	public void aumentaSalario() {
		this.salario*=1.10;		
	}
	//meto com taxa variavel
	public void aumentaSalario(double taxa) {
		this.salario*= 1+taxa/100;
	}
}
