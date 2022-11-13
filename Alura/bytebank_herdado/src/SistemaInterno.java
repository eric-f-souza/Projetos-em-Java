public class SistemaInterno {

    private int senha = 2020;

    public void autentica(Autenticavel g){
        boolean validacao = g.autentica(this.senha);

        if(validacao){
            System.out.println("Acesso autorizado");
        } else {
            System.out.println("Acesso negado");
        }
    }

}
