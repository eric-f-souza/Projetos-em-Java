/*
19. Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

 */


package calss;

public class ConversaoBinaria {


    public String conversaoParaBinario(int numeroEntrada){
        //int binarioInt = Float.floatToIntBits(numeroEntrada);
        return  Integer.toBinaryString(numeroEntrada);
    }


}
