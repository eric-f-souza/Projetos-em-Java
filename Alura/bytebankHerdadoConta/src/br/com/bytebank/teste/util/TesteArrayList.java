package br.com.bytebank.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteArrayList {

    public static void main(String[] args) {

        List<Conta> lista = new Vector<Conta>();
        //List<Conta> lista = new ArrayList<Conta>();
        //List<Conta> lista = new LinkedList<Conta>();


        Conta cc = new ContaCorrente(2222,5555);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(2222,5535);
        lista.add(cc2);

        System.out.println(lista.size());

        lista.get(0);

        Conta ref = lista.get(0);

        System.out.println(ref);

        lista.remove(0);

        System.out.println("Tamanho " + lista.size());

        Conta cc3 = new ContaCorrente(2233,5566);
        lista.add(cc3);
        Conta cc4 = new ContaPoupanca(2233,3355);
        lista.add(cc4);

        for(int contador = 0; contador < lista.size(); contador ++){
            System.out.println(lista.get(contador));
            System.out.println("-----------------------------------------");
        }

        for(Conta conta : lista){
            System.out.println(conta);
            System.out.println("-----------------------------------------");
        }

    }
}
