package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex006MediaAluno {

    ArrayList<Integer> notas = new ArrayList<Integer>();
    float media = 0;

    public void entradaNotas(){
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas medias devem ser adicionadas?");
        int numeroNotas = input.nextInt();
        while(numeroNotas >0){
            System.out.println("Valor nota: ");
            int nota = input.nextInt();
            if(validaNota(nota)){
                notas.add(nota);
                numeroNotas--;
            }else {
                System.out.println(String.format("A nota %d é invalida, digite um valor inteiro entre 0 e 100", nota));
            }

        }

    }

    public ArrayList<Integer> getNotas(){
        return notas;
    }


    public boolean validaNota(int nota){
        if(nota >= 0 && nota  <= 100 ){
            return true;
        }else {
            return false;
        }
    }

    public float getMedia(){
        for (float nota: notas){
            media += nota;
        }
        return media/notas.size();
    }
}
