package testes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auxiliar.MensagensAlerta;

class MensagensAlertaTest {
	
	MensagensAlerta msg = new MensagensAlerta();
	

	@BeforeEach
	void setUp() throws Exception {	
		
		
	}

	@Test
	void testMensagemNovoContato() {
		String mensagemTrue = msg.mensagemNovoContato(true);
		String mensagemFalse = msg.mensagemNovoContato(false);
		
		Assertions.assertEquals("Cliente cadastrado!", mensagemTrue);
		Assertions.assertEquals("Erro banco, cliente não foi cadastrado! tente novamente", mensagemFalse);
					
	}

	@Test
	void testMensagemContatoEditado() {
		
		String mensagemTrue = msg.mensagemContatoEditado(true);
		String mensagemFalse = msg.mensagemContatoEditado(false);
		
		Assertions.assertEquals("Cliente atualizado!", mensagemTrue);
		Assertions.assertEquals("Erro banco, Alterações não foram salvas! Tente novamente", mensagemFalse);
					
	}

	@Test
	void testMensagemContatoDeletado(){

		String mensagemTrue = msg.mensagemContatoDeletado(true);
		String mensagemFalse = msg.mensagemContatoDeletado(false);
		Assertions.assertEquals("Contato deletado!", mensagemTrue);
		Assertions.assertEquals("Erro banco, contato não foi deletado! Tente novamente", mensagemFalse);
		
	}
	
	@Test
	void testErroValidador(){		
		String mensagem1 = msg.erroValidador(1);
		String mensagem2 = msg.erroValidador(2);
		String mensagem3 = msg.erroValidador(3);
		
		Assertions.assertEquals("Campo Nome em branco ou invalidao", mensagem1);
		Assertions.assertEquals("Campo Sobrenome em branco ou invalidao", mensagem2);
		Assertions.assertEquals("Campo Telefone Invalido", mensagem3);
		
	}
}
