package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2222,3333);
        cc.deposita(1000.00);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto leao = new CalculadorImposto();
        leao.registroImposto(cc);
        leao.registroImposto(seguro);

        System.out.println(leao.getTotalImposto());
    }
}
