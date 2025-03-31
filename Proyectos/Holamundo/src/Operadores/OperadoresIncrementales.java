package Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre - Incremento
        int i = 1;
        int j = ++i; // i = i+1 // Incrementa y demuestra el valor

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post - Incremento
        i = 2;
        j = i++; // esto dice que primero J reconoce i como varaible y despues incrementa

        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //Pre-Decremento
        i = 3;
        j = --i; //i = i-1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post - Decremento
        i = 4;
        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //CURIOSIDADES

        System.out.println("(++j) = " + (++j)); // J =  VALDRA 5 EN ESTE CASO
        System.out.println("(--j) = " + (j++));// Saldra en pantalla 5 pero valdra 6
        System.out.println("(--j) = " + (--j)); // J = VALDRA 5
        System.out.println("(++j) = " + (j--));// saldra 5 pero valdra 4
        System.out.println("(--j) = " + (j)); // saldra 4 

        }
}
