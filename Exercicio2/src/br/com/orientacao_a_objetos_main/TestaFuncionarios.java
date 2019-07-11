package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Funcionario;
import br.com.orientacao_a_objetos.Gerente;
import br.com.orientacao_a_objetos.Secretaria;
import br.com.orientacao_a_objetos.Telefonista;

public class TestaFuncionarios {

	public static void main(String[] args) {
		Funcionario joao = new Gerente("Joao",1500.00,"Joao1445","joao123");
		Funcionario maria = new Secretaria("Maria",1200.00, 20);
		Funcionario joana = new Telefonista("Joana", 1300.00, 6);		
		
		System.out.println("salario do gerente: "+joao.getSalarioFunc());
		joao.calculaBonificacao();
		System.out.println("salario do gerente com bonificação: "+joao.getSalarioFunc());
		System.out.println("salario da Secretaria: "+maria.getSalarioFunc());
		maria.calculaBonificacao();
		System.out.println("salario da Secretaria com bonificação: "+maria.getSalarioFunc());
		System.out.println("salario da Telefonista: "+joana.getSalarioFunc());
		joana.calculaBonificacao();
		System.out.println("salario da Telefonista com bonificação: "+joana.getSalarioFunc());
		
		
		joao.mostraDados();
		maria.mostraDados();
		joana.mostraDados();
	}

}
