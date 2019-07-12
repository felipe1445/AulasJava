package br.com.classes_abstratas;

public class TesteGeradorExtrato {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.imprimeExtratoDetalhado();
		cp.imprimeExtratoDetalhado();
	}

}
