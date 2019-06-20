package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
		turma1.periodo = "Vespertino";
		turma1.sigla = "fc";
		turma1.serie = 1;
		turma1.tipoEnsino= "sadasdsa";
		
		turma2.periodo = "matutino";
		turma2.sigla = "ac";
		turma2.serie = 2;
		turma2.tipoEnsino= "kkkkkk";
		
		System.out.println("Periodo turma1: " + turma1.periodo + "\nSigla: " + turma1.sigla 
				+ "\nSerie: " +turma1.sigla + "\nTipo Ensino: "+ turma1.tipoEnsino);
		System.out.println("Periodo turma2: " + turma2.periodo + "\nSigla: " + turma2.sigla 
				+ "\nSerie: " +turma2.sigla + "\nTipo Ensino: "+ turma2.tipoEnsino);
		
		
	}

}
