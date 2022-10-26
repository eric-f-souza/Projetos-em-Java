package Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestePropriets {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.setProperty("login", "eric.caodebriga");
        properties.setProperty("password", "ChamaNo@Cheske");
        properties.setProperty("endereco", "www.voadoranacara.com.br");

        properties.store(new FileWriter("config.properties"), "Comentarios");
    }
}
