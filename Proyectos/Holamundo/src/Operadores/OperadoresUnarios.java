package Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {


        //OPERADORES UNARIOS
        // invierte signos

        int i = -5;
        int j = +i; //j = (1) * q => -5
        int k = -i; //k = (1) * q => 5

        System.out.println("j = " + j);
        System.out.println("k = " + k);

        i = 6 ;
        j = -i;
        k = +i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);  
    }
}
