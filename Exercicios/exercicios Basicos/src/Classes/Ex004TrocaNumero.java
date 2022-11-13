package Classes;

public class Ex004TrocaNumero {

    public void trocaNumero(float primeiroNumero, float segundoNumero){

        System.out.println(String.format("Entrada: Primerio numero %2.2f. Segundo numero %2.2f",primeiroNumero,segundoNumero));
        float variavelAuxiliar = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = variavelAuxiliar;

        System.out.println(String.format("Final: Primerio numero %2.2f, Segundo numero %2.2f",primeiroNumero,segundoNumero));

    }
}
