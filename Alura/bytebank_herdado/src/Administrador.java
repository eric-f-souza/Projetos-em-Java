public class Administrador extends Funcionario implements Autenticavel {

    private ValidadosSenhaSistema autenticador;
    public Administrador(){
        this.autenticador = new ValidadosSenhaSistema();
    }
    @Override
    public double getBonificacao() {
        return 1000;
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