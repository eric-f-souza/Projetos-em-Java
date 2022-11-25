package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        //fluxo entrada com arquivo
        OutputStream fos = new FileOutputStream("change3.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Notepad++ v8.4.4 crash/regression-fixes and new enhancement:");
        bw.newLine();
        bw.newLine();
        bw.write("BURI BURI");
        bw.close();

    }
}