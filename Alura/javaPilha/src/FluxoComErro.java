public class FluxoComErro {

    public static void main(String[] args){
        System.out.println("Inicio do main");
        try{
            metodo1();
        } catch(Exception ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private  static void metodo2()throws MinhaExcecao{
        System.out.println("Chamada metodo 2");
        //metodo2();
        System.out.println("Fim Metodo 2");
    }

}
