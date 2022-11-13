package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestObject {

    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(true);

        ContaCorrente cc = new ContaCorrente(2222, 55544 );
        ContaPoupanca cp = new ContaPoupanca(5555,55566);

        System.out.println(cc);
        System.out.println(cp);

        println();
    }

    static void println(){

    }

    static void println(int a){}
    static void println(boolean bool){}
    static void println(Object conta){}

}
