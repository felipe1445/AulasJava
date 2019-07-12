package br.com.polimorfismo;

public class TesteControleDePonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gern = new Gerente();
		gern.setCodigo(1);
		gern.setNomeUsuario("joao1445");
		gern.setSenha("123");
		gern.setNome("Joao de sei la");
		
		Telefonista telf = new Telefonista();
		telf.setNome("Joana");
		telf.setCodigo(22);
		
		
		ControleDePonto cdp = new ControleDePonto();
		
		cdp.entradaFuncionario(gern);
		cdp.entradaFuncionario(telf);
		cdp.saidaFuncionario(gern);
		cdp.saidaFuncionario(telf);
	}

}
