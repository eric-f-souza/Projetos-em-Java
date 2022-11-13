package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args)throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.00);

        cc.transfere(10.0, cp);

        System.out.println("br.com.bytebank.banco.modelo.Conta Corrente saldo " + cc.getSaldo());
        System.out.println("br.com.bytebank.banco.modelo.Conta poupança saldo " + cp.getSaldo());
    }
}
