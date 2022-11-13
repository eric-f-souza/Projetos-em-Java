public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo Primeira conta " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo segunda conta " + segundaConta.saldo);

        segundaConta.saldo += 100;

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("Iguais");
        }

    }
}
