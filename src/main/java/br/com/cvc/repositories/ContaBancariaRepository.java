package br.com.cvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cvc.entities.ContaBancaria;

@Repository
public interface ContaBancariaRepository  extends JpaRepository<ContaBancaria, Integer>{

}
