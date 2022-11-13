package Testes;

import Classes.Ex006MediaAluno;

public class Ex006Teste {

    public static void main(String[] args) {

        Ex006MediaAluno mediaAluno = new Ex006MediaAluno();

        mediaAluno.entradaNotas();
        System.out.println(mediaAluno.getNotas());

        System.out.println(mediaAluno.getMedia());


    }
}
