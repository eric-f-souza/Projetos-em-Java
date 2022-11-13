package br.com.bytebank.banco.modelo;

public class CalculadorImposto {

    private double totalImposto;

    public void registroImposto(Tributavel valor){
        double valorImposto = valor.getValorImposto();
        this.totalImposto += valorImposto;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
