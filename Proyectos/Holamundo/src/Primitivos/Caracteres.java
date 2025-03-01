package Primitivos;

public class Caracteres {


    public static void main(String[] args) {

        // un string es una secuencia de caracteres
        // char solo permite un caracter tanto en letra como en numero
        char caracter = 'a' ;
        // se puede buscar la tabla unicode en google
        char caracterw = '\u0040' ; // esto es cuanto hay caracteres que estan colocados de la forma unicode
        char caracter2 = '4' ;
        char decimal = 64 ; // esto pasa cuando coloca
        System.out.println("Caracter: " + caracter);
        System.out.println("Caracter2: " + caracter2);
        System.out.println("Caractew: " + caracterw);
        System.out.println("Decimal: " + decimal);
        // esto de hacer la comparacion se conoce como presedencia de los operadores
        // string que concatena una expresion booleana
        System.out.println("Decimal = caracterw: " + (decimal == caracterw));
        // esto imprime true o false ya que se esta haciendo como una comparacion booleana

        char simobolo = '@' ;
        System.out.println("Simobolo: " + simobolo);
        System.out.println("Simobolo = caracterw: " + (simobolo == caracterw));

        var caracter3 = '\u0040' ;
        System.out.println("Caracter3: " + caracter3);

        // estos nos sirve para saber los size de esta variable
        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("Character en SIZE corresponde a = " + Character.SIZE);
        System.out.println("Character maximo valor = " + Character.MAX_VALUE); // no da datos ya que de pende la variable
        System.out.println("Character minimoo valor = " + Character.MIN_VALUE); // no da datos ya que de pende la variable



    }
}
