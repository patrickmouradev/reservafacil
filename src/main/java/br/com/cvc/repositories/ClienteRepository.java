package br.com.cvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cvc.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	boolean existsByCpf(String cpf);

}
