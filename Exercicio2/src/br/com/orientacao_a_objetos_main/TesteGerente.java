package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente joao = new Gerente("Joao",1500.00,"Joao1445","joao123");	
		
		
		//testando metodo de aumento de salario com taxa fixa
		joao.aumentaSalario();
		System.out.println("salario com taxa fixa: R$ "+joao.getSalarioFunc());
		
		//testando metodo de aumento de salario com taxa variavel
		joao.setSalarioFunc(200);
		joao.aumentaSalario(20);
		System.out.println("salario com taxa variavel: R$ "+joao.getSalarioFunc());
		

	}

}
