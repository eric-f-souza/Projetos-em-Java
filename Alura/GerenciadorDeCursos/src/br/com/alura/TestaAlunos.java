package br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Nome aluno 1");
        alunos.add("Nome aluno 2");
        alunos.add("Nome aluno 3");
        alunos.add("Nome aluno 4");
        alunos.add("Nome aluno 5");
        alunos.add("Nome aluno 6");

//        for (String aluno : alunos) {
//            System.out.println(aluno);
//        }

        alunos.forEach(aluno -> System.out.println(aluno));
        System.out.println(alunos);

        List<String> alunosLista = new ArrayList<>(alunos);


    }

}
