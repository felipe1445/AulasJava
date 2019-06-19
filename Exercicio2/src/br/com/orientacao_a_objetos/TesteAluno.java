package br.com.orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		Aluno gustavo = new Aluno();
		
		felipe.nome = "felipe";
		felipe.rg = 123;
		felipe.datanascAluno  = "25/07/1994";
		
		gustavo.nome = "gustavo";
		gustavo.rg = 122;
		gustavo.datanascAluno = "22/11/1980";
		
		System.out.println("nome: " + felipe.nome + "\nrg: "+felipe.rg 
				+ "\ndatanasc: "+felipe.datanascAluno);
		System.out.println("nome: " + gustavo.nome + "\nrg: "+gustavo.rg 
				+ "\ndatanasc: "+gustavo.datanascAluno);
		
	}

}
