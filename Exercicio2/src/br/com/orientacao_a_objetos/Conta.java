package br.com.orientacao_a_objetos;

import java.util.Random;

public class Conta {
	private int numeroConta;
	private double saldoConta;
	private double limiteConta = 100.0;
	private static int contadorContas = 0;
	//vinculo
	public Agencia agencia;
	
	public Conta (Agencia agencia) {		
		this.agencia = agencia;
		contadorContas++;		
		this.numeroConta = new Random().nextInt(9999999) + contadorContas;
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
	
	public static void zeraContador() {
		System.out.println("zerando contas...Contas criadas ate o momento: "+ contadorContas);
		contadorContas=0;	
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public double getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}

	public static int getContadorContas() {
		return contadorContas;
	}

	public static void setContadorContas(int contadorContas) {
		Conta.contadorContas = contadorContas;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
}
