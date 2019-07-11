package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.CartaoDeCredito;
import br.com.orientacao_a_objetos.Cliente;

public class TesteBanco {

	public static void main(String[] args) {
		Cliente conta1 = new Cliente();
		Cliente conta2 = new Cliente();
		
		conta1.setNome("felipe");
		conta1.setCodigo(123);
		conta2.setNome("gustavo");
		conta2.setCodigo(321);
		
		//testes feitos para os exercicios 1~16 e atualizado nas outras classes
		
		CartaoDeCredito cartao1 = new CartaoDeCredito(123);
		CartaoDeCredito cartao2 = new CartaoDeCredito(1234);	
		
		cartao1.setNumeroCartao(456);
		cartao1.setDataValidadeCartao("20/01/2100");	
		
		cartao2.setNumeroCartao(789);
		cartao2.setDataValidadeCartao("19/11/1980");
		
		
		System.out.printf("numero do cartao é: %d \ndata de validade é: %s ", cartao1.getNumeroCartao(), cartao1.getDataValidadeCartao());
		System.out.printf("\nnumero do cartao 2 é: %d \ndata de validade 2 é: %s ", cartao2.getNumeroCartao(), cartao2.getDataValidadeCartao());
		
		Agencia ag1 = new Agencia(1);
		Agencia ag2 = new Agencia(2);
		
		ag1.setNumeroAgencia(1);
		ag2.setNumeroAgencia(2);
		
		System.out.println("\nNumero da agencia: "+ag1.getNumeroAgencia());
		System.out.println("Numero da agencia 2: "+ag2.getNumeroAgencia());
		
		System.out.println("nome cliente: "+ conta1.getNome() + "\nconta: " + conta1.getCodigo());
		System.out.println("nome cliente: "+ conta2.getNome() + "\nconta: " + conta2.getCodigo());
	}

}
