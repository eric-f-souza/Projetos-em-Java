package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
        //fluxo entrada com arquivo
//        OutputStream fos = new FileOutputStream("change3.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


        //BufferedWriter bw = new BufferedWriter(new FileWriter("change.txt"));
        //PrintStream ps = new PrintStream("change3.txt");

        PrintWriter ps = new PrintWriter("change.txt");

        ps.println("Notepad++ v8.4.4 crash/regression-fixes and new enhancement:");
        ps.println();
        ps.println();
        ps.println("BURI BURI3");


        ps.close();

    }
}