package br.com.statico;

import br.com.orientacao_a_objetos.Funcionario;

public class TesteFuncionarioStatic {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario(null,0);		
		
		//definindo dados para 2 funcionarios
		func1.setNomeFunc("Antenor");
		func1.setSalarioFunc(200);
		
		//imprimindo dados com salario normal
		System.out.println("mostrando salario normal:");
		func1.mostraDados();
	
		
		System.out.println("-------------------------------");
		System.out.println("salario com vale: " + (func1.getSalarioFunc()+Funcionario.getValeRefeicao())) ;
		System.out.println("valor do vale: "+ Funcionario.getValeRefeicao());		
		
		func1.reajustaValeRefeicao(50.0);
		System.out.println("vale refeição reajustado: "+Funcionario.getValeRefeicao());
	}

}
