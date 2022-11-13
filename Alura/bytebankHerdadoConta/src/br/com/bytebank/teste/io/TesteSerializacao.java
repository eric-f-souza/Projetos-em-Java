package br.com.bytebank.teste.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setCPF("122222222222");
        cliente.setNome("QUalque zin");
        cliente.setProfissao("Predeiro");

        ContaCorrente cc = new ContaCorrente(2222,5555);
        cc.deposita(2500.00);
        cc.setTitular(cliente);

        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oss.writeObject(cc);
        oss.close();




//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cce.bin"));
//        Cliente novoNome = (Cliente) ois.readObject();
//        ois.close();
//
//        System.out.println(cliente.getNome());
    }
}
