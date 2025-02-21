import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaDeEntradaTerminal {

    public static void main(String[] args) {

        //instancia de la clase scanener un objeto
        // InputeString eso recibe en los parentesis
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero entero: ");
       // String numeroStr = sc.nextLine(); //esto captura el parametro del usuario

        int numeroDecimal = 0;
        try{
            // scanner.nextInt(); -> convierte tod0 de un solo
            numeroDecimal = scanner.nextInt();// Integer.parseInt(numeroStr);
            // como se espera que sea un numero aqui lo convierte a decimal el texto

        }catch (InputMismatchException e){// aquai podemos colocar Solo Exception para incluir todas esas Excepciones
            System.out.println("El numero entero no es valido");
            main(args);//
            System.exit(0);
        }
        // System.out.println -> Esto imprime en la consola
        System.out.println("numeroDecimal = " + numeroDecimal);

        //BINARIO
        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        // sistema octal
        String mensajeOctal = "numero octal = " + Integer.toOctalString(numeroDecimal);

        //sistema hexadecimal
        String mensajeHex = "numero hex = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario + "\n" + mensajeOctal + "\n" + mensajeHex;

        System.out.println(mensaje);
    }
}
