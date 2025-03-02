package String;

public class ValidacionString {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        // este dara error ya que es un objeto vacio ya que es null
        //        System.out.println(curso.toUpperCase());
/*         if (esNulo == true) {
            System.out.println(curso.toUpperCase());
        }*/

        if (esNulo) {
            curso = "";//"Programacion Java"; // si uno coloca espacio le cuenta como caracter
        }

//        System.out.println("Bienvenido al curso ".concat(curso)); -> esto dara error ya que curso esta vacio
        // concat se usara cuando la instancia no este vacia
        System.out.println("Bienvenido al curso ".concat("desde cero!"));
        System.out.println("Bienvenido al curso ".concat(curso));
        System.out.println(curso.toUpperCase());

        //asi se valida que un String tenga un tamanio
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        //tambien podemos colocar -> !esVacio ya qu esto significa lo opuesto a la afirmacion principal
        if (esVacio == false) {
            System.out.println("Bienvenido al curso ".concat("desde cero!"));
            System.out.println("Bienvenido al curso ".concat(curso));
            System.out.println(curso.toUpperCase());

        }

        //ATAJO

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        if (!esVacio2) {

            System.out.println("Bienvenido al curso ".concat("desde cero!"));
        }

        //

        String curso2 = " ";
        // aqui siempre mostrara aun con el espacio que es vacio ya que el espacio lo cuenta como que no es ningun caracter
        // es mas estricto tod0 cuando se usa isBlanck()
        boolean esBlanco = curso2.isBlank();


        // en este caso el espacio es un objeto vacio
        if (esBlanco){
            System.out.println("Es un espacio cabrones ");
        }
        // esta una forma de la cual funcionara y no dara erro pero no dara lo esperado
        System.out.println("Bienvenido al curso " + curso);
    }
}
