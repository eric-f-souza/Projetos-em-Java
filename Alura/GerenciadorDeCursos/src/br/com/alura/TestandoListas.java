package br.com.alura;

import sun.awt.windows.WPrinterJob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestandoListas {
    public static void main(String[] args) {

        String aula01 = "Conhecendo mais de listas";
        String aula02 = "Trabalhando com cursos e sets";
        String aula03 = "Modelando a classe Aula";
        String aula04 = "Alterando estruturas";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula01);
        aulas.add(aula02);
        aulas.add(aula03);

        //System.out.println(aulas);

        //aulas.remove(0);

        //System.out.println(aulas);

//        for (String aula:aulas) {
//            System.out.println(String.format("Aula: %s ", aula));
//        }

        printList(aulas);

        Collections.sort(aulas);

        System.out.println("Quebra");
        printList(aulas);



    }

    public static void printList(ArrayList<String> aulas){
        aulas.forEach(aula -> {
            System.out.println("Percorrendo");
            System.out.println(aula);
        });
    }

}

