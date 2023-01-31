package testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class main {

    public static void main(String[] args) {


        List<String> palavras = new ArrayList<String>();

        palavras.add("Alura online ed");
        palavras.add("Alura Curso");
        palavras.add("Alura online");

        System.out.println(palavras);

        //palavras.sort((p1,p2) -> Integer.compare(p1.length(), p2.length()));

        palavras.sort(Comparator.comparing(s -> s.length()));
        // palavras.sort(Comparator.comparing(String::length)); mesma coisa que a de cima
        // palavras.sort(comparing(String::length)); mesma coisa que a de cima
        // Function<String, Integer> funcao = String::length;
        // Function<String, Integer> funcao = s -> s.length();

        System.out.println(palavras);


        Consumer<String> imprimeString = s -> System.out.println(s);
        //Consumer<String> imprimeString = System.out::println; mesma coisa que o de cima

        palavras.forEach(imprimeString);

        //lambda
        palavras.forEach(s-> System.out.println(s));//mesma coisa mno lambda
        //palavras.forEach(System.out::println);
    }

}
