package br.com.cvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cvc.entities.OperacaoBancaria;

@Repository
public interface OperacaoBancariaRepository extends JpaRepository<OperacaoBancaria, Integer> {

}
