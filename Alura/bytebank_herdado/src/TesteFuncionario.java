public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario eric = new Gerente();
        eric.setNome("Eric Souza");
        eric.setCpf("090.467.029-52");
        eric.setSalario(3500.00);

        System.out.println(eric.getNome());
        System.out.println(eric.getBonificacao());
    }
}
