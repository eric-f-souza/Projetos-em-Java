package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteGuardadorReferencias {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

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
        }

        for(Conta conta : lista){
            System.out.println(conta);
        }

    }
}
