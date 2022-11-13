package br.com.bytebank.banco.modelo;

public class ContaEspecial extends Conta {


    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {

    }
}
