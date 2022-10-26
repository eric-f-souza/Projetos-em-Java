package Classes;

public class Ex005ComparaNumeros {

    public void comparaNumeros(float primeiroNumero, float segundoNumero){
        float diferencaNumeros;
        if(primeiroNumero > segundoNumero) {
            diferencaNumeros = primeiroNumero - segundoNumero;
            System.out.println(String.format("O maior numero dos valores recebidos e o %2.2f e o menor é o %2.2f",primeiroNumero,segundoNumero));
        } else {
            diferencaNumeros = segundoNumero - primeiroNumero;
            System.out.println(String.format("O maior numero dos valores recebidos e o %2.2f e o menor é o %2.2f",segundoNumero,primeiroNumero));
        }

        System.out.println(String.format("A diferença entre os numero %2.2f e %2.2f, é de %2.2f",primeiroNumero,segundoNumero,diferencaNumeros));
    }
}
