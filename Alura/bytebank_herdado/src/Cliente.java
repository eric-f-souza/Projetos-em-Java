public class Cliente implements Autenticavel {
    private ValidadosSenhaSistema autenticador;


    public Cliente(){
         this.autenticador = new ValidadosSenhaSistema();
    }
    @Override
    public void setSenha(int senha) {

        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}