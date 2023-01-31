package testes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auxiliar.ValidadorContatos;
import model.Contatos;

class ValidadorContatosTest {

	String nome = "Nome";
	String sobrenome = "Sobrenome";
	String telefone01 = "(41)99999-9999";
	String telefone02 = "(41)99999-8888";
	String telefone03 = "(41)99999-7777";
	String dataNascimento = "29-10-1993";
	String grauParentesco = "Parente";

	
	ValidadorContatos validador = new ValidadorContatos();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testValidarIntegridadeContatoOK() {
		
		Contatos contato = new Contatos();
		
		contato.setNome(nome);
		contato.setSobrenome(sobrenome);
		contato.setTelefone01(telefone01);
		contato.setTelefone02(telefone02);
		contato.setTelefone03(telefone03);
		contato.setDataNascimento(dataNascimento);
		contato.setGrauParentesco(grauParentesco);
		
		int intRetorno = validador.validarIntegridadeContato(contato);
		
		Assertions.assertEquals(intRetorno, 4);
			
	}
	
	@Test
	void testValidarIntegridadeContatoSemNome() {
		
		Contatos contato = new Contatos();
		//contato.setNome("");
		contato.setSobrenome(sobrenome);
		contato.setTelefone01(telefone01);
		contato.setTelefone02(telefone02);
		contato.setTelefone03(telefone03);
		contato.setDataNascimento(dataNascimento);
		contato.setGrauParentesco(grauParentesco);
		
		int intRetorno = validador.validarIntegridadeContato(contato);
		
		Assertions.assertEquals(intRetorno, 1);
		
		contato.setNome("");
		
		intRetorno = validador.validarIntegridadeContato(contato);
		
		Assertions.assertEquals(intRetorno, 1);
			
	}
	
	@Test
	void testValidarIntegridadeContatoSemSobrenomeNome() {
		
		Contatos contato = new Contatos();
		contato.setNome(nome);
		contato.setTelefone01(telefone01);
		contato.setTelefone02(telefone02);
		contato.setTelefone03(telefone03);
		contato.setDataNascimento(dataNascimento);
		contato.setGrauParentesco(grauParentesco);
		
		int intRetorno = validador.validarIntegridadeContato(contato);
		
		Assertions.assertEquals(intRetorno, 2);
		
		contato.setSobrenome("");
		
		intRetorno = validador.validarIntegridadeContato(contato);
		
		Assertions.assertEquals(intRetorno, 2);
			
	}
	
	@Test
	void testValidarIntegridadeContatoSemTelefone(){
		
		Contatos contato = new Contatos();
		
		contato.setNome(nome);
		contato.setSobrenome(sobrenome);
		//contato.setTelefone01(telefone01);
		contato.setTelefone02(telefone02);
		contato.setTelefone03(telefone03);
		contato.setDataNascimento(dataNascimento);
		contato.setGrauParentesco(grauParentesco);
		
		int intRetorno = validador.validarIntegridadeContato(contato);
		
		Assertions.assertEquals(intRetorno, 3);
		
		contato.setTelefone01("99999999");
		
		intRetorno = validador.validarIntegridadeContato(contato);
		
		Assertions.assertEquals(intRetorno, 3);
			
	}


}
