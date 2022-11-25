package br.com.alura;

public class TestaBuscaAlunosNoCurso {

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

        System.out.println("Quem é o aluno com matricula 2222");
        Aluno alunoMatricula = javaColecoes.buscaPorMatricula(222);
        System.out.println(alunoMatricula);

    }
}
