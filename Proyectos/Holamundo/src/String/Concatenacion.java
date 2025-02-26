package String;

public class Concatenacion {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String detalle = curso + " con el profesor es: " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        // no hace la suma por la presedencia de sus concatenadores entonces en este caso tod0 viene de un String
        System.out.println(detalle + " " + numeroA + numeroB);
        // a menos que tenga parentesis
        System.out.println(detalle + " " + (numeroA + numeroB));
        // pero si se hace al reves. como viene de numero enteros solo concatena el String
        System.out.println(numeroA + numeroB + " " + detalle );

        // La clase String trae la concatenacion del metodo
        String detalle2 = curso.concat(" "+ profesor);// permite concatenar String, recordar que los Sting son inmutables
        //otra forma, de concatenar y es mas eficiente
       /* String detalle2 = curso.concat(" ").concat(profesor);*/
        System.out.println(detalle2);



    }
}
