package br.com.bytebank.teste;

import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {

        String vazio = " ";
        String outroVazio = vazio.trim();// Remove espaços

   //     System.out.println(outroVazio.isEmpty());

       String nome = "Alura";

  //      System.out.println(nome.length());

        for(int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }


   //     String sub = nome.substring(1);
   //     System.out.println(sub);

   //     int pos = nome.indexOf("ur");
   //     System.out.println(pos);
   //     char c = nome.charAt(2);
   //     System.out.println(c);
  /*        String outra = nome.replace("A", "a");
        //nome.toLowerCase();
        System.out.println(outra);
        nome = "nome";
  */
        //System.out.println(nome);

    }
}
