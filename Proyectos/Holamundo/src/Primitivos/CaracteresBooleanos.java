package Primitivos;

public class CaracteresBooleanos {

    public static void main(String[] args) {

        // se le conoce como tipo de dato logico ya que solo son dos opciones
        // TRUE OR FALSE
        // RECORDAR  si se coloca "boolean" de esta forma es prmitivo si la 'b' va en mayuscula es de Referencia la apalabra
        // esto escribiendolo el true or false

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        // esto a apartir de la constante
        boolean datoLogico2 = Boolean.FALSE;// aca retorna una instancia de la clase "BOOLEAN"
        System.out.println("datoLogico2 = " + datoLogico2);

        // el boolean sirve para los flujos de control como if,else, for , while, etc

        double d = 98765.43e-3; // se corre a la izq dando como resultado 98.76543
        System.out.println("d = " + d);
        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 == 1 ; // un '=' solo es de asignacion con dos '==' es de comparacion
        System.out.println("esIgual = " + esIgual);
    }
}
