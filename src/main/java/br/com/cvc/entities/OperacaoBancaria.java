package br.com.cvc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OperacaoBancaria {
	
	@Id @GeneratedValue
	private Integer id;
	
	@Column(nullable=false)
	private String operacao;
	
	@Column(nullable=false)
	private double valor;
	
	
	public OperacaoBancaria () {
		
	}


	public OperacaoBancaria(Integer id, String operacao, double valor) {
		this.id = id;
		this.operacao = operacao;
		this.valor = valor;
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getOperacao() {
		return operacao;
	}


	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}



	
}
