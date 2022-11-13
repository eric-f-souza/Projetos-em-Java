package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);//autoboxing

        System.out.println(idadeRef.doubleValue());

        idadeRef.intValue();//unboxing
        int valor = idadeRef.intValue();

        String s = args[0];

        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);



        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);

    }
}
