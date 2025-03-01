package Primitivos;

public class PrimitivosNumericos {

    public static void main(String[] args) {


        // BITE -> es el size del dato primitivo
        // BYTE ->

        // el entero mas peque que hay en java

        // Byte es el nombre de la clase que permite el acceso a los metodos
        byte numeroByte = 27; // no puede pasar de 127

        System.out.println("numeroByte = " + numeroByte);
        System.out.println(" tipo de byte corresponde en byte a " + Byte.BYTES);// esto muestra la cantidad "Byte" nombre de clase
        System.out.println(" tipo de byte corresponde en bite a " + Byte.SIZE);
        System.out.println(" valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println(" valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 30767;

        System.out.println("numeroShort = " + numeroShort);
        System.out.println(" tipo de byte corresponde en byte a " + Short.BYTES);
        System.out.println(" tipo de short corresponde en short a " + Short.SIZE);
        System.out.println(" valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println(" valor minimo de un short: " + Short.MIN_VALUE);

        // integer es el nombre de la clase de int la cual permite los metodos
        int numeroInt = 127546;

        System.out.println("numeroInt = " + numeroInt);
        System.out.println(" tipo de byte corresponde en byte a " + Integer.BYTES);
        System.out.println(" tipo de int corresponde en int a " + Integer.SIZE);
        System.out.println(" valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println(" valor minimo de un int: " + Integer.MIN_VALUE);

        // la clase de long se llama "Long" este permite que acceda a la clase
        // se coloca una "L" ya que asi convierte la literal dependiendo el tipo ya que sin la L no dice que sea long
        long numeroLong = 9223375807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println(" tipo de long corresponde en long a " + Long.BYTES);
        System.out.println(" tipo de long corresponde en long a " + Long.SIZE);
        System.out.println(" valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println(" valor minimo de un long: " + Long.MIN_VALUE);

        // si el tipo de dato queda corto con el numero o se pasa de lo permitido dara error
        // por ejemplo byte = 128 dara error ya que se pasa del maximo

        // var es un tipo de variable flexible que se autoasigna
        var numeroVar= 127;
        System.out.println("numeroVar = " + numeroVar);
    }
}
