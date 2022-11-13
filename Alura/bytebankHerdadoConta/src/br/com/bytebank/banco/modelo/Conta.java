package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * @author Eric Souza
 *
 */
public abstract class Conta implements Comparable<Conta>, Serializable {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Contrutor para inicializar o objeto Conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("Total de contas " + br.com.bytebank.banco.modelo.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public  abstract void deposita(double valor);

    /**
     * Valor precisa ser maior do que o saldo.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor)throws SaldoInsuficienteException{
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }


    public void transfere(double valor, Conta destino)throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){return this.numero;}

    public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("Não pode valor negativo.");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia<= 0){
            System.out.println("Não pode valor negativo.");
            return;
        }
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Agencia: " + this.getAgencia() +" Conta: " + this.getNumero() + " " + this.getTitular() + " Saldo: " + this.getSaldo();
    }
    @Override
    public boolean equals(Object obj){

        Conta outraConta = (Conta)obj;

        if(this.agencia != outraConta.agencia){
            return false;
        }
        if(this.numero != outraConta.numero){
            return false;
        }
        return true;
    }


    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return Double.compare(this.saldo, outraConta.saldo);
    }
}
