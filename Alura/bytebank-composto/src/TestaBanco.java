public class TestaBanco {

    public static void main(String[] args) {
        Cliente pauloVieira = new Cliente();
        pauloVieira.nome = "Paulo Vieira Silva";
        pauloVieira.CPF = "222.222.222-22";
        pauloVieira.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        contaDoPaulo.titular = pauloVieira;
        System.out.println(contaDoPaulo.titular.nome);
    }
}
