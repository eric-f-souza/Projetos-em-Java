package br.com.alura.funcionario;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class OrdenaPorIdade implements Comparator<Funcionario> {


    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return o1.getIdade() - o2.getIdade();
    }
}

