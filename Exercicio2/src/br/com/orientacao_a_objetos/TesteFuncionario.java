package br.com.orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.nomeFunc = "antenor";
		func1.salarioFunc = 200;
		func2.nomeFunc = "blabla";
		func2.salarioFunc = 300;
		
		System.out.println(func1.nomeFunc + " " + "salario: "+ func1.salarioFunc);
		System.out.println(func2.nomeFunc + " " + "salario: "+ func2.salarioFunc);
	}

}
