package br.com.statico;

import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Conta;

public class TesteContaStatic {

	public static void main(String[] args) {
		Agencia ag1 = new Agencia(1);
		System.out.println("numero de instancias: " +Conta.getContadorContas());
		Conta conta1 = new Conta(ag1);		
		System.out.println("criando conta 1...");
		System.out.println("numero de instancias: " +Conta.getContadorContas());
		Conta conta2 = new Conta(ag1);		
		System.out.println("criando conta 2...");
		System.out.println("numero de instancias: " +Conta.getContadorContas());
		
		//definindo dados agencia
		ag1.setNumeroAgencia(123);	
		
		//associando as classes
		conta1.agencia =ag1;				

		//imprimindo numero das contas
		System.out.println("Numero da conta 1: "+conta1.getNumeroConta());
		System.out.println("Numero da conta 2: "+conta2.getNumeroConta());
		
		Conta.zeraContador();
		System.out.println("numero de instancias: " +Conta.getContadorContas());
		
	}

}
