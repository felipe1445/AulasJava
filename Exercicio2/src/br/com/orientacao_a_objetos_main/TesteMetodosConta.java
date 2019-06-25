package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Cliente;
import br.com.orientacao_a_objetos.Conta;

public class TesteMetodosConta {

	public static void main(String[] args) {
		Cliente felipe = new Cliente();
		Cliente alicio = new Cliente();
		Conta c1 = new Conta(felipe);
		Conta c2 = new Conta(alicio);

		// testando metodos da classe conta
		c1.deposita(1000);
		c1.saca(500);	
		
		//questao 39
		c1.transferirValor(c2, 200.0);		
		
		System.out.println(c2.saldoConta);
	}

}
