package String;

public class Inmutabilidad {

    public static void main(String[] args) {

        // El String es inmutable eso quiere decir que su Valor no cambia
        //NO CAMBIA . sin embargo se puede modificae

        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat( profesor); // esto provoca que se haga la concatenacion y altera el resultado

        System.out.println(curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        //convierte o concatena string
        //este bloque modifica el string
        // en el parentesis recibe una funcion
        // transform modifica al string
        // sin embargo no modifica la variable original
        String resultado2 = curso.transform(c ->{
            return c + " con " + profesor;
        });//en el parentesus recibe una funcion

        System.out.println("curso = " + curso);
        System.out.println("profesor = " + resultado2);

        //nada funciona como corresponde si no se crea una nueva varaible que incluya la funcion
        // siempre retorna una nueva instancia
       String resultado3 = resultado.replace("a", "A"); // esta funcion sirve para remplazar caracteres
       System.out.println("resultado = " + resultado3);

    }
}
