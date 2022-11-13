package Testes;

import Classes.Ex001MaiorNumero;

public class Ex001Teste {

    public static void main(String[] args) {
        int primeiroNumero = 10;
        float segundoNumero = 50.5f;

        Ex001MaiorNumero Comparador = new Ex001MaiorNumero();

        System.out.println("O maior numero é o " + Comparador.comparador(primeiroNumero,segundoNumero));

    }
}
