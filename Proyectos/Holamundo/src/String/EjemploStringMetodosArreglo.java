package String;

public class EjemploStringMetodosArreglo {

    public static void main(String[] args) {

       String trabalenguas = "trabalenguas";
       //Asi se convierte un arreglo en un array y con el metodo indicada convierte un string en un arreglo de caracteres
        //tipo char
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        //tod0 arreglo en java es una instancia

        //Aqui creamos un arreglo de tipo char
        char[] arreglo = trabalenguas.toCharArray();

        // aca length es un atributo cuando de arreglos hablamos
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        //con una iteracion mostraremos cada caracter del array

        for (int i = 0; i < largo; i++) {
            //se coloca arreglo i por que deacuerdo al numero soltara el char correspondiente
            //println-> cada que imprime salta una linea y aca imprime de forma vertical
            //solo print lo hace de corrido de forma horizontal
            System.out.print(arreglo[i]);
        }

        System.out.println();
        //convierte el String en un array de patrones que terminan donde se encuentre la letra. Suprime la letra seleccionada(separador)
        //tipo String
        // funcia el split colocando una secuencia de caracteres
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglos = trabalenguas.split("a");
        int tam = arreglos.length;
        System.out.println("tam = " + tam);

        for (int i = 0; i < tam; i++) {
            System.out.println(arreglos[i]);
        }

        String archivo = "alguna.imagen.pdf";
        System.out.println("archivo = " + archivo.split("."));

        // si solo se usa el "." es un caracter especial de expresion regulares
        // pero con doble parcelarge indica que el caracter es el punto
        // tambien se puede colocar entre corchetes "[.]"
        String[] archivoArr = archivo.split("\\.");
        // para no crear otro tambien podriamos utilizar l o tam y cambiar la variable 
        // l = archivoArr.length;  o  tam = archivoArr.length; ya que sirve por que ya se definio como int
        int large2 = archivoArr.length;
        System.out.println("Los siguientes arechivos son: ");
        for (int i = 0; i < large2; i++) {

            System.out.println("-"+archivoArr[i]);
        }

        //aqui obtenemos la extension
        System.out.println("archivoArr[large2-1] = " + archivoArr[large2-1]);

    }
}
