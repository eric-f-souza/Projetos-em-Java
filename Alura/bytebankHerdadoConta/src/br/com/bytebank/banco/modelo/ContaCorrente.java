package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double getValorImposto() {
        return super.saldo * 0.001;
    }

    public ContaCorrente(int agencia, int numero){
        super (agencia, numero);
    }

    public void saca(double valor) throws SaldoInsuficienteException{
        double valorComTaxa = valor + 0.2;
        super.saca(valorComTaxa);
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }

    public void deposita(double valor){
        super.saldo += valor;
    }

}
