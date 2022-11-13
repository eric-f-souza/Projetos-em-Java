package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
*
* @author Eric Souza
*
 **/
public class Cliente implements Serializable {

    private String nome;
    private String CPF;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String toString(){
        return "Titular: " + this.getNome();
    }
}
