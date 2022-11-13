package br.com.bytebank.teste.util;

import br.com.bytebank.banco.modelo.Conta;

import java.util.Comparator;

class ComparadorTitular implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String titularConta01 = c1.getTitular().getNome();
        String titularConta02 = c2.getTitular().getNome();
        return titularConta01.compareTo(titularConta02);
    }
}
