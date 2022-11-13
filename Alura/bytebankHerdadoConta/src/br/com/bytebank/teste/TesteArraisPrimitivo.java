package br.com.bytebank.teste;

public class TesteArraisPrimitivo {

    public static void main(String[] args) {

        int[] idades = new int[5];

        for(int counter = 0; counter < idades.length; counter++){
            idades[counter] =  (int)Math.floor(Math.random()*(500 - 1)+1);
            System.out.println(idades[counter]);
        }


    }
}
