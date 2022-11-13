package Classes;

public class Ex001MaiorNumero {
    public Number comparador(Number primeiroNumero, Number segundoNumero) {
        if(primeiroNumero.floatValue() >= segundoNumero.floatValue()){
            return primeiroNumero;
        }
        return segundoNumero;
    }
}