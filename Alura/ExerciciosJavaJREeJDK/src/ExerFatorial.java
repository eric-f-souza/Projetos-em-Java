public class ExerFatorial {
    public static void main(String[] args) {
        int valorFinal= 1;
        for(int contador = 1; contador < 11; contador++){
            valorFinal *= contador;
            System.out.println(valorFinal);
        }
        System.out.println(valorFinal);
    }
}
