public class CriaConta {
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 1000.00;
        primeiraConta.agencia = 123456;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50.00;
        System.out.println("Primeira conta " +primeiraConta.saldo);
        System.out.println("Segunda conta " + segundaConta.saldo);
    }
}
