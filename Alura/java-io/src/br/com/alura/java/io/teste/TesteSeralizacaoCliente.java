package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSeralizacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Cliente cliente = new Cliente();
        cliente.setCpf("122222222222");
        cliente.setNome("QUalque zin");
        cliente.setProfissao("Predeiro");

//        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oss.writeObject(cliente);
//        oss.close();




        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente novoNome = (Cliente) ois.readObject();
        ois.close();

        System.out.println(cliente.getNome());


    }
}
