package br.com.orientacao_a_objetos;

public class Conta {
	public int numeroConta;
	public double saldoConta;
	public double limiteConta = 100;
	//vinculo
	public Cliente cliente;
	public Agencia agencia;
	
	public Conta (Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void deposita(double valor) {
		this.saldoConta+=valor;
	}
	
	public void saca(double valor) {
		this.saldoConta-=valor;
	}
	
	public double consultaSaldo() {
		return this.saldoConta+=limiteConta;
	}
	
	public void transferirValor( Conta contaDestino, double valor ) {
		 this.saldoConta -= valor ;
		 contaDestino.saldoConta += valor;
	}
	
	public String imprimeExtrato(int dias) {
		//codigo
		return "extrato dos ultimos "+ String.valueOf(dias) + " dias";			
		 
	}
}
