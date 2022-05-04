package com.dio.santander.bankline.api.dto;

import javax.persistence.Column;

import com.dio.santander.bankline.api.model.MovimentacaoTipo;

public class NovaMovimentacao {
	
	private String descricao;
	private Double valor;
	private Integer idConta;
	private MovimentacaoTipo tipo;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
	
}
