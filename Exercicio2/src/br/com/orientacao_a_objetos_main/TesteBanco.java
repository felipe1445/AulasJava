package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.CartaoDeCredito;
import br.com.orientacao_a_objetos.Cliente;

public class TesteBanco {

	public static void main(String[] args) {
		Cliente conta1 = new Cliente();
		Cliente conta2 = new Cliente();
		
		conta1.nome = "felipe";
		conta1.codigo = 123;
		conta2.nome = "gustavo";
		conta2.codigo = 321;
		
		//testes feitos para os exercicios 1~16 e atualizado nas outras classes
		
		CartaoDeCredito cartao1 = new CartaoDeCredito();
		CartaoDeCredito cartao2 = new CartaoDeCredito();	
		
		cartao1.numeroCartao = 456;
		cartao1.dataValidadeCartao = "20/01/2100";	
		
		cartao2.numeroCartao = 789;
		cartao2.dataValidadeCartao = "19/11/1980";
		
		
		System.out.printf("numero do cartao é: %d \ndata de validade é: %s ", cartao1.numeroCartao, cartao1.dataValidadeCartao);
		System.out.printf("\nnumero do cartao 2 é: %d \ndata de validade 2 é: %s ", cartao2.numeroCartao, cartao2.dataValidadeCartao);
		
		Agencia ag1 = new Agencia();
		Agencia ag2 = new Agencia();
		
		ag1.numeroAgencia = 1;
		ag2.numeroAgencia = 2;
		
		System.out.println("\nNumero da agencia: "+ag1.numeroAgencia);
		System.out.println("Numero da agencia 2: "+ag2.numeroAgencia);
		
		System.out.println("nome cliente: "+ conta1.nome + "\nconta: " + conta1.codigo);
		System.out.println("nome cliente: "+ conta2.nome + "\nconta: " + conta2.codigo);
	}

}
