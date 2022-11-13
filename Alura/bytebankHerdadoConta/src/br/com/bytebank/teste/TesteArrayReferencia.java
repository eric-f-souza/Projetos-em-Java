package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        Object[] referencia = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(2222,55555);
        referencia[0] = cc1;

        ContaPoupanca cp2 = new ContaPoupanca(3333,66666);
        referencia[1] = cp2;

        Cliente cliente = new Cliente();
        referencia[2] = cliente;

        ContaPoupanca ref = (ContaPoupanca) referencia[1];//typecast
        //System.out.println(referencia[1].getNumero());
    }
}
