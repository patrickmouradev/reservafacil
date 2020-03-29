package br.com.cvc.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cvc.entities.Cliente;
import br.com.cvc.repositories.ClienteRepository;

@Named
@ViewScoped
public class CadastroClienteController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Cliente cliente;
	
	private List<Cliente> clientes;
	

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostConstruct
	public void init () {
		clientes = new ArrayList<Cliente>();
		setClientes(listaTodos());
		cliente = new Cliente();
	}

	
 	
	public void excluiCliente(Integer id) {
		
		clienteRepository.deleteById(id);
		init();
	}
	
	public void salvaCliente( ) {

		clienteRepository.save(getCliente());
		init();
	}
	
	public List<Cliente> listaTodos(){
		return  clienteRepository.findAll();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


}
