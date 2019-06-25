package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Cliente;
import br.com.orientacao_a_objetos.Conta;

public class TesteValoresPadrao {

	public static void main(String[] args) {		
		Agencia ag1 = new Agencia(1);
		Cliente felipe = new Cliente();
		Conta conta1 = new Conta(felipe);
		
		//imprimindo dados
		System.out.println("limite é de: R$ "+ conta1.limiteConta);
		System.out.println("saldo com limite: R$ " +conta1.consultaSaldo());		
		System.out.println(conta1.imprimeExtrato(1));
		System.out.println(felipe.codigo);
		System.out.println(felipe.nome);

	}

}
