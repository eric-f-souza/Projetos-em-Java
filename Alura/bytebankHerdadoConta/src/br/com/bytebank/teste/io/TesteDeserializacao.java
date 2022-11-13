package br.com.bytebank.teste.io;

import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream( new FileInputStream("cc.bin"));
        ContaCorrente novaCC = (ContaCorrente) ois.readObject();
        ois.close();

        System.out.println(novaCC.getAgencia());


    }
}
