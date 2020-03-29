package br.com.cvc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;



import br.com.cvc.repositories.ClienteRepository;

public class CpfMustBeUniqueValidator implements ConstraintValidator<CpfMustBeUnique, String>  {
  
  @Autowired
  private ClienteRepository clienteRepository;
  
  
  @Override
  public boolean isValid( String cpf, ConstraintValidatorContext context ) {

    return !clienteRepository.existsByCpf( cpf );
  }
  
}
