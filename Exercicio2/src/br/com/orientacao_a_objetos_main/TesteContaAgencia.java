package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Cliente;
import br.com.orientacao_a_objetos.Conta;

public class TesteContaAgencia {

	public static void main(String[] args) {		
		Agencia ag1 = new Agencia(1);
		
		Conta conta1 = new Conta(ag1);		
		
		
		//definindo dados agencia
		ag1.numeroAgencia = 123;	
		
		//associando as classes
		conta1.agencia =ag1;		
		
		
		//imprimindo dados
		System.out.println("limite � de: R$ "+ conta1.limiteConta);
		System.out.println("saldo com limite: R$ " +conta1.consultaSaldo());
		System.out.println(conta1.imprimeExtrato(15));
	}

}
