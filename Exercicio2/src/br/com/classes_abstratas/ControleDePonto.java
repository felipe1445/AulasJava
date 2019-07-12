package br.com.classes_abstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
	
	public void entradaFuncionario(Funcionario f) {
		SimpleDateFormat entrada = new SimpleDateFormat ("dd/MM/ yyyy HH:mm:ss") ;
		Date agora = new Date () ;
		
		System.out.println("entrada funcionario cod: " + f.getCodigo());
		System.out.println("data: " + entrada.format(agora));
		
	}
	
	public void saidaFuncionario(Funcionario f) {
		SimpleDateFormat saida = new SimpleDateFormat ("dd/MM/ yyyy HH:mm:ss") ;
		Date agora = new Date () ;		
		System.out.println("saida funcionario cod: " + f.getCodigo());
		System.out.println("data: " + saida.format(agora));
		
	}
	
}
