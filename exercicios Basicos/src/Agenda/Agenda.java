package Agenda;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos= new ArrayList<Contato>();

    public void addContato(String nome, String email){
        Contato contato = new Contato(nome, email);
        contatos.add(contato);
    }

    public String buscaContato(String nome){
        for (Contato contato: contatos) {
            if(nome.equals(contato.getNome())){
                return   String.format("Nome %s encontrado, Com email: %s",contato.getNome(), contato.getEmail());
            }
        }
        return "nome nao encontrado";
    }

    public boolean deletarContato(String nome){
        for (Contato contato: contatos) {
            if(nome.equals(contato.getNome())){
                contatos.remove(contato);
                return true;
            }
        }
        return false;
    }


}

