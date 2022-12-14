package br.com.bytebank.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {


       ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(2222,5555);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(2222,5535);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(2222,5555);
        //lista.add(cc3);

        boolean existe = lista.contains(cc3);

        System.out.println("Existe? " + existe);

        for(Conta conta: lista){
            if(conta.equals(cc3)){
                System.out.println("Conta na lista: " + existe);
            }
        }

        for(Conta conta : lista){
            System.out.println(conta);
        }

    }
}
