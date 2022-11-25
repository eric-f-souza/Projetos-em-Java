package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando coleções em java", "Intrutos Nome");
        javaColecoes.adiciona(new Aula("Trabalho Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 15));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        Aluno a1 = new Aluno("Aluno 01", 1111);
        Aluno a2 = new Aluno("Aluno 02", 2222);
        Aluno a3 = new Aluno("Aluno 03", 3333);

        Aluno a4 = new Aluno("Aluno 01", 1111);
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);


        System.out.println("Alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

        System.out.println(javaColecoes.estaMatriculado(a1));

        System.out.println(a4.equals(a1));

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador =alunos.iterator();

        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }


    }
}
