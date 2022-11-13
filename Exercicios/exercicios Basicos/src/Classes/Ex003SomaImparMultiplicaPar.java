package Classes;

public class Ex003SomaImparMultiplicaPar {

    int impar = 0;
    long par = 1;


    public Ex003SomaImparMultiplicaPar(){
        for(int contador = 1; contador <=30; contador++){
            if(contador % 2 == 0){
                this.par *= contador;
            }else{
                this.impar += contador;
            }

        }
    }

    public void resultados(){
        System.out.println("Multiplicação dos par: " + par);
        System.out.println("Soma dos numeros Impar: " + impar);
    }
}
