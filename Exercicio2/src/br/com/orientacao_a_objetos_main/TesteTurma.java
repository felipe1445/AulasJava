package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Aluno;
import br.com.orientacao_a_objetos.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma1 = new Turma();	
		Aluno felipe = new Aluno();	
		
		//definindo dados para a turma 
		turma1.periodo = "Vespertino";
		turma1.sigla = "fc";
		turma1.serie = 1;
		turma1.tipoEnsino= "Medio";		
		
		//definindo dados do aluno
		felipe.nome = "felipe";
		felipe.rg = 123;
		felipe.datanascAluno  = "25/07/1994";
		
		//relacionando
		felipe.turma = turma1;
		
		//imprimindo os dados
		System.out.println("nome: " + felipe.nome + "\nrg: "+felipe.rg 
				+ "\ndatanasc: "+felipe.datanascAluno +"\n");
		
		//dados da turma, sendo acessados pelo objeto aluno
		System.out.println("turma do aluno: "+felipe.turma.sigla+ "\nSerie: "+ felipe.turma.serie
				+"\nPeriodo: "+felipe.turma.periodo + "\nTipo Ensino: "+felipe.turma.tipoEnsino);

		
	}
	
	

}
