public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        Conta conta1 = new Conta(1337, 24227);

        Conta conta2 = new Conta(1337, 24228);

        System.out.println(conta.getAgencia());

        System.out.println(Conta.getTotal());

    }
}