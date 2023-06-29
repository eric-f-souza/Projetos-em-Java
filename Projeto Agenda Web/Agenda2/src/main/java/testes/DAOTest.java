package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Contatos;
import model.DAO;

class DAOTest {
	
	DAO dao;
	
	Contatos contatoFalse = new Contatos();
	Contatos contatoTrue = new Contatos();
	
	

	@BeforeEach
	void setUp() throws Exception {
		
		
		
		contatoTrue.setNome("Eric");
		contatoTrue.setSobrenome("Souza");
		contatoTrue.setTelefone01("(41) 99999-8888");
		contatoTrue.setTelefone02("(41) 99999-7777");
		contatoTrue.setTelefone03("(41) 99999-9999");
		contatoTrue.setDataNascimento("29/10/1993");
		contatoTrue.setGrauParentesco("Pai");
		
		contatoFalse.setNome("Eric");
		contatoFalse.setTelefone01("(41) 99999-8888");
		contatoFalse.setTelefone02("(41) 99999-7777");
		contatoFalse.setTelefone03("(41) 99999-9999");
		contatoFalse.setDataNascimento("29/10/1993");
		contatoFalse.setGrauParentesco("Pai");
		
	}

	@Test
	void testAdd() {
		
		Contatos contatoTrue = new Contatos();
		
		contatoTrue.setNome("Eric");
		contatoTrue.setSobrenome("Souza");
		contatoTrue.setTelefone01("(41) 99999-8888");
		contatoTrue.setTelefone02("(41) 99999-7777");
		contatoTrue.setTelefone03("(41) 99999-9999");
		contatoTrue.setDataNascimento("29/10/1993");
		contatoTrue.setGrauParentesco("Pai");
		
		boolean adicionado = new DAO().add(contatoTrue);
		DAO dao = new DAO();
		//Assertions.assertEquals(true, dao.add(contatoFalse));
		Assertions.assertEquals(true, adicionado);
	}

	@Test
	void testListaContatos() {
		fail("Not yet implemented");
	}

	@Test
	void testSelecionarContatos() {
		fail("Not yet implemented");
	}

	@Test
	void testEditarContato() {
		fail("Not yet implemented");
	}

	@Test
	void testDeletarContato() {
		fail("Not yet implemented");
	}

}
