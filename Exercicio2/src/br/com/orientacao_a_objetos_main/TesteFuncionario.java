package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario(null, 0);
		Funcionario func2 = new Funcionario(null, 0);
		
		//definindo dados para 2 funcionarios
		func1.setNomeFunc("Antenor");
		func1.setSalarioFunc(200);
		func2.setNomeFunc("Alicio");
		func2.setSalarioFunc(300);
		
		//imprimindo dados com salario normal
		System.out.println("mostrando salario normal:");
		func1.mostraDados();
		func2.mostraDados();
		
		//testando metodos de aumento de salario
		func1.aumentaSalario(200);
		func2.aumentaSalario(4000);
		
		//imprimindo dados com salario alterado
		
		System.out.println("-------------------------------");
		System.out.println("salario alterado: ");
		func1.mostraDados();
		func2.mostraDados();
	}

}
