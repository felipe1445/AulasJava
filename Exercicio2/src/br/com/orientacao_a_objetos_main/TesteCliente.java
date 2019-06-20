package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.CartaoDeCredito;
import br.com.orientacao_a_objetos.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente alirio = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito();
		
		//Definindo dados cliente
		alirio.codigo = 1;
		alirio.nome = "alirio";		
		
		//associando ao cartao
		cdc.cliente = alirio;	
		
		//definindo dados cartao
		cdc.numeroCartao = 123;
		cdc.dataValidadeCartao = "10/01/2001";
		
		//imprimindo dados do cliente usando a classe cartao
		System.out.println("nome cliente do cartao: " +cdc.cliente.nome);
	}

}
