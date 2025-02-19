public class CaracteresEspeciales {

    public static void main(String[] args) {

        // caracteres especiales //


        // '\'esp se le conoce como parcelarge
        // aqui representa el espacio
        char space = '\u0020';
        char espacio = ' ';
        String song = "ella y yo";
        System.out.println("Aventura y Don Omar =" + espacio + song);
        System.out.println("Aventura y Don Omar =" + space + song);

        // BACK SPACE -> retrocede un espacio
        char retroceso = '\b';
        System.out.println("Aventura y Don Omar = " + retroceso + song);
        System.out.println("Aventura y Don Omar = " + retroceso + retroceso + song);

        // TABULADOR
        char tabulador = '\t';
        System.out.println("Aventura y Don Omar = " + tabulador + song);
        System.out.println("Aventura y Don Omar = \t " + tabulador + song);

        // Nueva Linea o Salto de Linea
        char nuevaLinea = '\n';
        System.out.println("Aventura y Don Omar = " + nuevaLinea + song);
        System.out.println("Aventura y Don Omar = \n " + nuevaLinea + song);

        // RETORNO CARRO
        char retornoCarro = '\r';
        System.out.println("Aventura y Don Omar = " + nuevaLinea + nuevaLinea + retornoCarro + song);
        System.out.println("Aventura y Don Omar = \r " + nuevaLinea + nuevaLinea + retornoCarro + song);
        // Esto es parte de la clase SYSTEM ya esta definidas de la maquina virtual de java
        System.out.println("Aventura y Don Omar =" + System.lineSeparator()+ song);

     }
}
