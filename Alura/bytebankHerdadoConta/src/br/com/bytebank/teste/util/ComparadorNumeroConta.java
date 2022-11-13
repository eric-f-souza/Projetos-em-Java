package br.com.bytebank.teste.util;

import br.com.bytebank.banco.modelo.Conta;

import java.util.Comparator;

class ComparadorNumeroConta implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
//       return c1.getNumero() - c2.getNumero();
//        {
//            return -1;
//        } else if (c1.getNumero() > c2.getNumero()) {
//            return 1;
//        }
//        return 0;
    }

}
