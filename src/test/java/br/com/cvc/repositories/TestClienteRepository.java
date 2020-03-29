package br.com.cvc.repositories;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.cvc.entities.Cliente;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TestClienteRepository {

	@Autowired
	ClienteRepository clienteRepository;

	@Test
	public void testSalvarClient() {
		Cliente cli = new Cliente("Joao", "21958651800", "teste@teste.com");
		Cliente clisalvo = clienteRepository.save(cli);
		Assert.assertNotNull(clisalvo.getId());

	}

	@Test
	public void testListarClient() {
		Cliente cli = new Cliente("Joao", "21958651800", "teste@teste.com");
		Cliente cli1 = new Cliente("Joao1", "21958651800", "teste@teste.com");
		Cliente cli2 = new Cliente("Joao2", "21958651800", "teste@teste.com");
		List<Cliente> clientList = new ArrayList<>();
		clientList.add(cli);
		clientList.add(cli1);
		clientList.add(cli2);
		clienteRepository.saveAll(clientList);
		List<Cliente> clisalvo = clienteRepository.findAll();
		Assert.assertTrue(clisalvo.size() > 0);

	}

}
