package Primitivos;

public class SistemasNumericos {

    public static void main(String[] args) {

        int numeroDecimal=500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        //se calcula utilizando la clase integer, sirve para realizar calculos

        //BINARIO
        System.out.println("numeero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        //para que java sepa que se trata de un binario se coloca al principio "0b", pero en consola saldra decimal
        int numeroBinario =  0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        // sistema octal
        System.out.println("numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        // colocando "0" el sistema entiende que estamos hablando del sistema OCTAL
        int numeroOctal  =  0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //sistema hexadecimal
        System.out.println("numeero Haxadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        // colocando "0x" se indica que es un hexadecimal mayuscula o minuscula da igual
        int numeroHexadecimal  =  0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

    }
}
