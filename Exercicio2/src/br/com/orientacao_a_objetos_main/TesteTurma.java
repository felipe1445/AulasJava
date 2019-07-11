package br.com.orientacao_a_objetos_main;

import br.com.orientacao_a_objetos.Aluno;
import br.com.orientacao_a_objetos.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma1 = new Turma();	
		Aluno felipe = new Aluno();	
		
		//definindo dados para a turma 
		turma1.setPeriodo("Vespertino");
		turma1.setSigla("fc");
		turma1.setSerie(1);
		turma1.setTipoEnsino("Medio");		
		
		//definindo dados do aluno
		felipe.setNome("felipe");
		felipe.setRg(123);
		felipe.setDatanascAluno("25/07/1994");
		
		//relacionando
		felipe.setTurma(turma1);
		
		//imprimindo os dados
		System.out.println("nome: " + felipe.getNome() + "\nrg: "+felipe.getRg() 
				+ "\ndatanasc: "+felipe.getDatanascAluno() +"\n");
		
		//dados da turma, sendo acessados pelo objeto aluno
		System.out.println("turma do aluno: "+felipe.getTurma().getSigla()+ "\nSerie: "
			+	felipe.getTurma().getSerie()+"\nPeriodo: "+felipe.getTurma().getPeriodo() 
				+ "\nTipo Ensino: "+felipe.getTurma().getTipoEnsino());

		
	}
	
	

}
