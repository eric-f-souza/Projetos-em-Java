package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSeralizacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        String nome = "UM nome ai";

//        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("serelizadin.bin"));
//        oss.writeObject(nome);
//        oss.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serelizadin.bin"));
        String novoNome = (String) ois.readObject();
        ois.close();

        System.out.println(novoNome);
    }
}
