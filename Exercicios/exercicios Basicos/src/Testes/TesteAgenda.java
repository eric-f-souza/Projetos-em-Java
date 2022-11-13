package Testes;

import Agenda.Agenda;

public class TesteAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.addContato("nome um","nomeum@hotmail.com");
        agenda.addContato("nome dois", "nomedois@hotmail.com");


       System.out.println(agenda.buscaContato("nome um"));
       System.out.println(agenda.deletarContato("nome um"));
       System.out.println(agenda.buscaContato("nome dois"));


    }
}
