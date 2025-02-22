import javax.swing.*;

public class ConversionesDeDatos {

    public static void main(String[] args) {

        // se puede utilizar "var" para que tod0 sea mas dinamico
        String numeroStr = "50";

        // primera forma de convercion de string a entero
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //pasar de string a decimal
        String realStr = "98765.43e-3" ; //98.76543
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //pasar de string a boolean
        String logicoStr = "T";
        boolean logicoBool = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBool = " + logicoBool);

        //PASAR DE DATO PRIMITIVO A STRING

        int valor = 100;
        System.out.println("valor = " + valor);

        //asi paso de entero primitivo entero a String
        String valorStr = Integer.toString(valor);
        System.out.println("valorStr = " + valorStr);

        //Primitivo a un string dependiendo el argumento
        // al argumento se le pueden colocar cosas , aqui el mas no concatena si no que suma ya que son datos numericos
        valorStr = String.valueOf(valor+10);
        System.out.println("valorStr = " + valorStr);

        //resultado distinto ya que se trabaja con string y aqui el + sirve como concatenacion
        valorStr = String.valueOf(valorStr+10);
        System.out.println("valorStr = " + valorStr);

        // double a string
        double otroRealDouble = 1.2345e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealDouble = " + otroRealStr);

        otroRealStr = String.valueOf(otroRealDouble +82);
        System.out.println("otroRealStr = " + otroRealStr);

        //float a string
        otroRealStr = String.valueOf(87.3242e2f);
        System.out.println("otroRealStr = " + otroRealStr);


        //CONVERSION DE PRIMITIVO A PRIMITIVO

        // int a short
        int i = 21000;

        //short s = i; --> // aqui dara error ya que short es un tipo de dato mas peque que int
        //Para estos casos se hace un cast ya que se necesita forzar la convercion aunque no sea lo mejor

        short s = (short) i;// si en dado caso no estra dentro de los parametros el numero realizara de forma eficaz la conversion
        System.out.println("s = " + s);
        long l = i; // en este caso no dara error
        System.out.println("l = " + l);

        /* boolean b = (boolean) i;*//*  ---> */// esto no se puede realizar ya que no son compatibles

        // de entero a float
        float f = (float) i ;
        System.out.println("f = " + f);

        double d = i; // en este caso no es necesario el cast ya que el dato lo permite
        System.out.println("d = " + d);

    }
}
