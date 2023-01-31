package auxiliar;

public class MensagensAlerta {
	
	
	public String mensagemNovoContato(boolean chamadoMsg){		
		if(chamadoMsg) {
			return "Cliente cadastrado!";
		} 
		return "Erro banco, cliente não foi cadastrado! tente novamente";
	}

	
	public String mensagemContatoEditado(boolean chamadoMsg) {
		if(chamadoMsg) {
			return "Cliente atualizado!";
		}
		return "Erro banco, Alterações não foram salvas! Tente novamente";
	}
	
	
	public String mensagemContatoDeletado(boolean chamadoMsg) {
		if(chamadoMsg){
			return "Contato deletado!";
		}
		return "Erro banco, contato não foi deletado! Tente novamente";
	}
	
	
	public String erroValidador(int chamadoMsg) {
		if(chamadoMsg == 1) {
			return "Campo Nome em branco ou invalidao";
		}else if(chamadoMsg == 2){
			return "Campo Sobrenome em branco ou invalidao";
		}else {
			return "Campo Telefone Invalido";
		}
		
	}
	
}
