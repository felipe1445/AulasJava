package br.com.classes_abstratas;


public abstract class Funcionario {
	private int codigo;
	private String nome;
	private double salarioFunc;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}

	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}

	public abstract void calculaBonificacao();
}
