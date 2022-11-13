package br.com.bytebank.teste.util;

import br.com.bytebank.banco.modelo.Conta;

import java.util.List;

class ImpressaoLista {
    public void impressaoLista(List<Conta> lista) {
        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }

}
