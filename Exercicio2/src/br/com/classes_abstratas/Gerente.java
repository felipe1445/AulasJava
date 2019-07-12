package br.com.classes_abstratas;

public class Gerente extends Funcionario{
	private String nomeUsuario;
	private String senha;
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public void calculaBonificacao() {		
		this.setSalarioFunc(this.getSalarioFunc() * (1+ 10/100));
	}
		
}
