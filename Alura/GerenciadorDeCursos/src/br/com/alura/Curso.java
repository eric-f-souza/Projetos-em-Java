package br.com.alura;

import java.text.Format;
import java.util.*;

import static java.lang.String.format;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    Curso(String nome, String instrutor, List<Aula> aulas){
        this.nome = nome;
        this.instrutor = instrutor;
        this.aulas = aulas;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public String toString(){
        return format("Curso: %s, Tempo total: ",nome, this.getTempoTotal());
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }

    public Aluno buscaPorMatricula(int matriculaBusca) {
        if(!matriculaParaAluno.containsKey(matriculaBusca)) {
            throw new NoSuchElementException();
        }
        return matriculaParaAluno.get(matriculaBusca);
    }
}


