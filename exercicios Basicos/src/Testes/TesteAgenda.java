package Testes;

import Agenda.Agenda;

public class TesteAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.addContato("nome um","descoladao@hotmail.com");
        agenda.addContato("nome dois", "rei@hotmail.com");


       System.out.println(agenda.buscaContato("nome um"));
       System.out.println(agenda.deletarContato("nome um"));
       System.out.println(agenda.buscaContato("nome dois"));


    }
}
