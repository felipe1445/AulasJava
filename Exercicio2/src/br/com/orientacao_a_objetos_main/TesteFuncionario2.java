package br.com.orientacao_a_objetos_main;

import Util.Teclado;
import br.com.orientacao_a_objetos.Funcionario;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		boolean verifica =true;
		funcionario1.nomeFunc = Teclado.lerTexto("digite o nome: ");
		
		while(verifica) {
			String consultaDados = Teclado.lerTexto("você quer consultar dados? (S/N)");
			if (consultaDados.equalsIgnoreCase("s")) {
				System.out.println("nome: " +funcionario1.nomeFunc + "\nSalario: "+funcionario1.salarioFunc);				
			}else if (consultaDados.equalsIgnoreCase("n")) {
				String alteraNome = Teclado.lerTexto("você quer alterar o nome? (S/N)");
				if (alteraNome.equalsIgnoreCase("s")) {
					funcionario1.nomeFunc = Teclado.lerTexto("digite o nome: ");
					funcionario1.salarioFunc = Teclado.lerDouble("digite o salario: ");
				}
				else if (alteraNome.equalsIgnoreCase("n")) {
					verifica=false;
				}	
				
			}
					
			
		}
	}

}
