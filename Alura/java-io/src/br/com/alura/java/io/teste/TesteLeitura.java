package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        //fluxo entrada com arquivo
        FileInputStream fis = new FileInputStream("change.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader buf = new BufferedReader(isr);

        String linha = buf.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = buf.readLine();
        }

        buf.close();

    }
}