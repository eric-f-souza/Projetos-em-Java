package testes;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Python", 40));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java", 40));
        cursos.add(new Curso("c++", 140));

        //cursos.sort(Comparator.comparing(Curso::getAluno));
        //cursos.forEach(c -> System.out.printf(c.getNome()));

        //cursos.forEach(c -> System.out.println(c.getAluno()));

        //cursos.stream().filter(c -> c.getAluno() >= 100).forEach(c -> System.out.println(c.getNome()));

        //cursos.stream().filter(c -> c.getAluno() >= 100).map(c -> c.getAluno()).forEach(ca -> System.out.println(ca));//lambda
        //cursos.stream().filter(c -> c.getAluno() >= 100).map(Curso::getAluno).forEach(System.out::println); //referencia

        int sun = cursos.stream().filter(c -> c.getAluno() >= 100).mapToInt(Curso::getAluno).sum();

        //System.out.println(sun);

        //Optional<Curso> opCurso =
        //cursos.stream()
        //       .filter(c -> c.getAluno() >=100)
        //       .findAny()
        //        .ifPresent(c -> System.out.println(c.getNome()));

        //Curso cursoN = opCurso.orElse(null);
        //System.out.println(cursoN.getNome());

        //opCurso.ifPresent(c -> System.out.println(c.getNome()));

//        List<Curso> listCursos = cursos.stream()
//                .filter(c -> c.getAluno() >= 100)
//                .collect(Collectors.toList());
//
//        listCursos.stream().forEach(c -> System.out.println(c.getNome()));

        Map<String, Integer> listCursos = cursos.stream()
                .filter(c -> c.getAluno() >= 100)
                .collect(Collectors.toMap(c -> c.getNome(), c-> c.getAluno()));

        cursos.stream()
                //.filter(c -> c.getAluno() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c-> c.getAluno()))
                .forEach((nome, qAlunos) -> System.out.println(nome + " tem: " + qAlunos + "alunos"));

        System.out.println(listCursos);

        cursos.stream().
            filter(c -> c.getAluno() >5).
                findFirst().ifPresent(
                        c -> System.out.printf(c.getNome()));


        cursos.stream().
                mapToInt(c -> c.getAluno()).
                average()
                .ifPresent(System.out::println);

        List<Curso>  listaCurso = cursos.stream()
                .filter(c -> c.getAluno() > 50).collect(Collectors.toList());

        listaCurso.stream().forEach(c -> System.out.println(c.getNome()+ " " + c.getAluno()));
    }

}
