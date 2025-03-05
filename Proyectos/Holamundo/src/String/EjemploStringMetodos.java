package String;

public class EjemploStringMetodos {

    public static void main(String[] args) {

        String name = "Camilo";
        // esto para saber cuantos caracteres tiene el string no parte de cero
        System.out.println("name.length() = " + name.length());
        // esto para tener tod0 en mayuscula
        System.out.println("name.length() = " + name.toUpperCase());
        //para tener tod0 en minuscula
        System.out.println("name.length() = " + name.toLowerCase());
        //como comprar un string con su valor no con su referencia, metodo booleano
        System.out.println("name.length() = " + name.equals("Camilo"));
        System.out.println("name.length() = " + name.equals("camilo"));
        // esto es un metodo que compara el valor pero le da igual la mayuscula o la minuscula
        System.out.println("name.equalsIgnoreCase(\"camilo\") = " + name.equalsIgnoreCase("camilo"));
        // compara caracteres de orden alfabetico segun la tabla unicode aqui el resultado es un numero
        //si da cero es que la comparacion es exitosa, cabe recalcar que es un metodo booleano
        System.out.println("name.length() = " + name.compareTo("Camilo"));
        System.out.println("name.length() = " + name.compareTo("Ariel"));
        // retorna el caracter segun el numero que se coloque del 0-9
        System.out.println("name.charAt() = " + name.charAt(3));
        //forma dinamica de obtener el ultimo caracter o cualquier caracter
        System.out.println("name.charAt(3) = " + name.charAt(name.length() - 1));

        // forma de obtener un fragmento del string, se coloca numero para indicar desde donde quiere el fragmento
        //tambien puede colocar dos argumento (1,3) asi dice desde donde inicia hasta donde llega, pero el caracter 4 no se incluye
        System.out.println("name.charAt(3) = " + name.substring(1));
        System.out.println("name.charAt(3) = " + name.substring(1,4));
        // aqui aunque el 6 no exista este lo incluye
        System.out.println("name.charAt(3) = " + name.substring(1,6));
        //forma dinamica
        System.out.println("name.charAt(3) = " + name.substring(1,name.length() - 3));

        String trabalenguas = "trabalenguas";
        // de esta forma nos dice que cambiaran caracteres por unos nuevo
        // Esto modifica el String pero dando una nueva instancia ya que la variable original se mantiene
        System.out.println("trabalengua = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);

        //Esto permite saber si se encuentra algun caracter dentro del string
        //returna la primera posicion
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf("a"));
        //returna la utlima ocurrecia del caracter
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        // si no esta la caracter returna un valor negativo

        //"" -> esto indica una secuencia // '' -> esto indica un caracter

        //recibe una secuencia de caracteres y indica si lo contiene o no es un metodo booleano
        System.out.println("trabalenguas.concat() = " + trabalenguas.contains("leguas"));
        System.out.println("trabalenguas.concat() = " + trabalenguas.contains("te"));
        System.out.println("trabalenguas.concat() = " + trabalenguas.contains("ua"));

        // esto tambien funciona con secuencia de caracteres pero del inciio, metodo booleano
        //cuidado que si no se pone bien el caracter lo cuenta como malo
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        // esto funciona con secuencia de caracteres del final, metodo booleano
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.endsWith("Traba"));


        // como quitar los espacios del string
        System.out.println("    trabalengua    " );
        // esto elimina los espacios en blanco a la izq y a la derecha
        System.out.println("    trabalengua    ".trim() );


    }
}
