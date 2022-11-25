package br.com.alura.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        nomesParaIdade.values().forEach(System.out::println);

        nomesParaIdade.keySet().forEach(System.out::println);

        //nomesParaIdade.entrySet().forEach(System.out::println);

        Set<Entry<String,Integer>> associacoes = nomesParaIdade.entrySet();
        for (Entry<String,Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }


    }
}
