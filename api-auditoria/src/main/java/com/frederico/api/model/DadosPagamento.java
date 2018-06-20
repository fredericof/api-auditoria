package com.frederico.api.model;

public class DadosPagamento {

	private String usuario;
	private String numeroCartao;
	private Float valorDebito;
	
	public DadosPagamento() {}
	
	public DadosPagamento(String usuario, String numeroCartao, Float valorDebito) {
		this.usuario = usuario;
		this.numeroCartao = numeroCartao;
		this.valorDebito = valorDebito;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Float getValorDebito() {
		return valorDebito;
	}

	public void setValorDebito(Float valorDebito) {
		this.valorDebito = valorDebito;
	}
	
}
