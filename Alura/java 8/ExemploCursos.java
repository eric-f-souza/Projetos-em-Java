package testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Python", 40));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java", 40));
        cursos.add(new Curso("c", 140));

        cursos.sort(Comparator.comparing(Curso::getAluno));
        //cursos.forEach(c -> System.out.printf(c.getNome()));


        cursos.forEach(c -> System.out.println(c.getAluno()));

        //cursos.stream().filter(c -> c.getAluno() >= 100).forEach(c -> System.out.println(c.getNome()));


        cursos.stream().filter(c -> c.getAluno() >= 100).map(c -> c.getAluno()).forEach(ca -> System.out.println(ca));//lambda
        //cursos.stream().filter(c -> c.getAluno() >= 100).map(Curso::getAluno).forEach(System.out::println); //referencia

        int sun = cursos.stream().filter(c -> c.getAluno() >= 100).mapToInt(Curso::getAluno).sum();

        System.out.println(sun);

    }



}
