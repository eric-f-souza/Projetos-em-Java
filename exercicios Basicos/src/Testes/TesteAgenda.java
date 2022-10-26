package Testes;

import Agenda.Agenda;

public class TesteAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.addContato("Descoladao da quebrada","descoladao@hotmail.com");
        agenda.addContato("Rei do Passinho", "rei@hotmail.com");


       System.out.println(agenda.buscaContato("Rei do Passinho"));
       System.out.println(agenda.deletarContato("Rei do Passinho"));
       System.out.println(agenda.buscaContato("Rei do Passinho"));


    }
}
