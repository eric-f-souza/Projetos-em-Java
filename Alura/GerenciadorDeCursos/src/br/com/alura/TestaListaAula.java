package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

    public static void main(String[] args) {

        Aula aula01 = new Aula("Revisando os Arraylist", 21);
        Aula aula02 = new Aula("Lista objetos", 20);
        Aula aula03 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(aula01);
        aulas.add(aula02);
        aulas.add(aula03);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        //Usando colections para ordenar
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        //Usando função de listas
        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
