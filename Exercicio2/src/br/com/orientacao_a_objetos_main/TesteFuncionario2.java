package br.com.orientacao_a_objetos_main;

import Util.Teclado;
import br.com.orientacao_a_objetos.Funcionario;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		boolean verifica =true;
		funcionario1.nomeFunc = Teclado.lerTexto("digite o nome: ");
		
		while(verifica) {
			int auxiliar = Teclado.lerInt("o que vc quer fazer: consultar(1) alterar(2) sair(3)");
			if (auxiliar==1) {
				System.out.println(funcionario1.consultaDados());				
			}else if (auxiliar==2) {				
					funcionario1.nomeFunc = Teclado.lerTexto("digite o nome: ");
					funcionario1.salarioFunc = Teclado.lerDouble("digite o salario: ");
			}
			else if (auxiliar==3) {
					verifica=false;
			}					
		}					
			
	}
}


