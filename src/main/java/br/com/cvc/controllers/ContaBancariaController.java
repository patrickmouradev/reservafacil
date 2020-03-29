package br.com.cvc.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.cvc.entities.ContaBancaria;
import br.com.cvc.repositories.ClienteRepository;
import br.com.cvc.repositories.ContaBancariaRepository;

@Named
@Scope
@Controller
public class ContaBancariaController {

	@Autowired
	ContaBancariaRepository contaBancariaRepository;
	
	ContaBancaria contaBancaria;
	List<ContaBancaria> listaContaBancaria;
	
	@PostConstruct
	public void init() {
	listaContaBancaria = new ArrayList<>();
	setListaContaBancaria(contaBancariaRepository.findAll());
	contaBancaria  = new ContaBancaria();
	
	}

	public void salvaConta () {
		contaBancaria.setDataCadastro(new Date());
		contaBancariaRepository.save(contaBancaria);
		init();
	}
	
	public void excluiConta(Integer id) {
		contaBancariaRepository.deleteById(id);
		init();
	}

	public ContaBancaria getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(ContaBancaria contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	public List<ContaBancaria> getListaContaBancaria() {
		return listaContaBancaria;
	}

	public void setListaContaBancaria(List<ContaBancaria> listaContaBancaria) {
		this.listaContaBancaria = listaContaBancaria;
	}
	
}
