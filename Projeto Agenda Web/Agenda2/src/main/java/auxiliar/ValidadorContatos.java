package auxiliar;

import model.Contatos;

public class ValidadorContatos {
	
	

	
	public int validarIntegridadeContato(Contatos contato) {
		if(contato.getNome() == null){
			return 1;
		}else if(contato.getSobrenome() == null){
			return 2;
		}
		String nome = contato.getNome().replaceAll(" ", "");
		String sobrenome = contato.getSobrenome().replaceAll(" ", "");
		if(nome.isEmpty() || nome.length() < 2){
			return 1;
		}else if(sobrenome.length() < 1){
			return 2;
		}else if(contato.getTelefone01() == null || contato.getTelefone01().length() < 11){
			return 3;
		}
		return 4;
	}
	
	
	
	
}
