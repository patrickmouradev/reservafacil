package br.com.cvc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContaBancaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private Integer agConta;

	@Column(nullable = false)
	private Integer numConta;

	@Column(nullable = false)
	private Date dataCadastro;

	public ContaBancaria() {

	}

	public ContaBancaria(Integer id, Integer agConta, Integer numConta) {

		this.id = id;
		this.agConta = agConta;
		this.numConta = numConta;

	}

	public Integer getId() {
		return id;
	}

	public Integer getAgConta() {
		return agConta;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAgConta(Integer agConta) {
		this.agConta = agConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
