//Gerente é um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario  implements  Autenticavel{

    private ValidadosSenhaSistema autenticador;

    public Gerente(){
        this.autenticador = new ValidadosSenhaSistema();
    }
    @Override
    public double getBonificacao() {
        return super.getSalario() + (super.getSalario()* 0.10) ;
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
