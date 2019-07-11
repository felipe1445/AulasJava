package br.com.orientacao_a_objetos_main;


import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Conta;

public class TesteMetodosConta {

	public static void main(String[] args) {
		Agencia ag1 = new Agencia(1);
		Agencia ag2 = new Agencia(2);
		Conta c1 = new Conta(ag1);
		Conta c2 = new Conta(ag2);

		// testando metodos da classe conta
		c1.deposita(1000);
		c1.saca(500);	
		
		//questao 39
		c1.transferirValor(c2, 200.0);		
		
		System.out.println(c2.getSaldoConta());
	}

}
