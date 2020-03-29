package br.com.cvc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.cvc.validators.CpfMustBeUnique;
import br.com.cvc.validators.CpfMustBeValid;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Nome deve ser informado.")
	@Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres")
	private String nome;

	@NotBlank(message = "CPF deve ser informado.")
	private String cpf;

	@NotBlank(message = "Email deve ser informado.")
	private String email;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String email) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
