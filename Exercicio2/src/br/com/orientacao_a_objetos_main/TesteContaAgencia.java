package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Cliente;
import br.com.orientacao_a_objetos.Conta;

public class TesteContaAgencia {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Agencia ag1 = new Agencia();
		Cliente felipe = new Cliente();
		
		//definindo dados cliente
		felipe.nome = "felipe";
		felipe.codigo = 1;
		
		//definindo dados agencia
		ag1.numeroAgencia = 123;	
		
		//associando as classes
		conta1.agencia =ag1;
		conta1.cliente =felipe;
		
		//testando metodos da classe conta
		conta1.deposita(1000);
		conta1.saca(500);
		
		//imprimindo dados
		System.out.println("limite é de: R$ "+ conta1.limiteConta);
		System.out.println("saldo com limite: R$ " +conta1.consultaSaldo());
		System.out.println(conta1.imprimeExtrato(15));
	}

}
