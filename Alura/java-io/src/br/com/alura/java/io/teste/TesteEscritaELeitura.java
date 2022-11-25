package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteEscritaELeitura {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket();

        InputStream fis = System.in;//socket.getInputStream();//new FileInputStream("change2.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("change3.txt");
        //OutputStream fos = System.out;//socket.getOutputStream();
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()){
        //while(linha != null){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}