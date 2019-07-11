package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.CartaoDeCredito;
import br.com.orientacao_a_objetos.Cliente;

public class TesteClienteECartao {

	public static void main(String[] args) {
		Cliente alirio = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito(123);
		
		//Definindo dados cliente
		alirio.setCodigo(1);
		alirio.setNome("alirio");		
		
		//associando ao cartao
		cdc.setCliente(alirio);	
		
		//definindo dados cartao
		cdc.setNumeroCartao(123);
		cdc.setDataValidadeCartao("10/01/2001");
		
		//imprimindo dados do cliente usando a classe cartao
		System.out.println("nome cliente do cartao: " +cdc.getCliente().getNome());
	}

}
