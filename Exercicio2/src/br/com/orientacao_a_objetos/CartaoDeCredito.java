package br.com.orientacao_a_objetos;

public class CartaoDeCredito {
	private int numeroCartao;
	private String dataValidadeCartao;
	//vinculo
	private Cliente cliente;
	
	
	public CartaoDeCredito(int numeroCartao) {		
		this.numeroCartao = numeroCartao;		
	}
	
	void novocartaoCredito() {		
	}
	void alterarlimiteCredito() {		
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getDataValidadeCartao() {
		return dataValidadeCartao;
	}

	public void setDataValidadeCartao(String dataValidadeCartao) {
		this.dataValidadeCartao = dataValidadeCartao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
