package br.com.alura;

public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString(){
        return String.format("Aula %s, com tempo estimado de %o\n", this.getTitulo(), this.getTempo());
    }


    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
