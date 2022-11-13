public class TesteConexao {

    public static void main(String[] args) {

        try ( Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch (IllegalStateException ex){
            System.out.println("Deu erro aqui");
        }





        /*
        Conexao con = null;
        try{
            con = new Conexao();
            con.leDados();
            con.close();
        } catch (IllegalStateException ex) {
            System.out.println("Deu Erro na conexão");
        } finally {
            System.out.println("Finally");
            if(con != null){
                con.close();
            }
        }*/
    }
}
