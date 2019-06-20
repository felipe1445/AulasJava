package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente joao = new Gerente();
		
		//definindo dados para gerente
		joao.nome = "Joao";
		joao.salario = 200;
		
		//testando metodo de aumento de salario com taxa fixa
		joao.aumentaSalario();
		System.out.println("salario com taxa fixa: R$ "+joao.salario);
		
		//testando metodo de aumento de salario com taxa variavel
		joao.salario = 200;
		joao.aumentaSalario(20);
		System.out.println("salario com taxa variavel: R$ "+joao.salario);
		

	}

}
