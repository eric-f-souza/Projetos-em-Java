package br.com.bytebank.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacao {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 21);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        ImpressaoLista impressaoLista = new ImpressaoLista();

        impressaoLista.impressaoLista(lista);
//        for (Conta conta: lista) {
//            System.out.println(conta);
//        }

        System.out.println("Fim primero laço");

        lista.sort(new ComparadorTitular());

        impressaoLista.impressaoLista(lista);

        System.out.println("Fim segundo laço");

        lista.sort(new ComparadorNumeroConta());
        impressaoLista.impressaoLista(lista);
        System.out.println("Terçeiro laço");
//        for (Conta conta: lista) {
//            System.out.println(conta);
//        }

    //Collections.sort(lista, new ComparadorNumeroConta());
        Collections.rotate(lista, 2);
   // Collections.reverse(lista);
        impressaoLista.impressaoLista(lista);


    }
}


