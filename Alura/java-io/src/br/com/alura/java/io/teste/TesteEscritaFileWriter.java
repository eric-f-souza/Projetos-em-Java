package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        //fluxo entrada com arquivo
//        OutputStream fos = new FileOutputStream("change3.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter ps = new PrintWriter("change.txt", "UTF-8");

        BufferedWriter bw = new BufferedWriter(new FileWriter("change.txt"));
        bw.write("Notepad++ v8.4.4 crash/regression-fixes and new enhancement:");
        bw.newLine();
        bw.newLine();
        bw.write("BURI BURI2");


        bw.close();

    }
}