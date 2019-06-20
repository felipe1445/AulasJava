package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		//definindo dados para 2 funcionarios
		func1.nomeFunc = "Antenor";
		func1.salarioFunc = 200;
		func2.nomeFunc = "Alicio";
		func2.salarioFunc = 300;
		
		//imprimindo dados com salario normal
		System.out.println("mostrando salario normal:");
		System.out.println(func1.consultaDados());
		System.out.println(func2.consultaDados());
		
		//testando metodos de aumento de salario
		func1.aumentaSalario(200);
		func2.aumentaSalario(4000);
		
		//imprimindo dados com salario alterado
		
		System.out.println("-------------------------------");
		System.out.println("salario alterado: ");
		System.out.println(func1.consultaDados());
		System.out.println(func2.consultaDados());
	}

}
