package Classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestandoPropriets {

    public static void main(String[] args) throws IOException {

        Properties props = new Properties();
        props.load(new FileReader("config.properties"));

        String login = props.getProperty("login");
        String password = props.getProperty("password");
        String endereco = props.getProperty("endereco");

        System.out.println(String.format("Loguin: %s. Senha: %s. Endereço: %s",login, password,endereco));
    }
}
