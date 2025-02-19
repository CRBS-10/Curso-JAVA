public class ReglasParaDefinirVariables {
    public static void main(String[] args) {
        // para usar una variable se tiene que definir
        String saludar = "Hola Mundo desde JAVA";
        System.out.println(saludar);
        System.out.println("saludar..toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;
        int numero2 = 45;
        System.out.println("numero = " + numero);
        boolean valor = true;

        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 25;
        String $salida = "gobert";
        String nombre;
        nombre = "Andres";
        if (numero > 10) {
            nombre = "Alfredo";
        }
        System.out.println("nombre = " + nombre.toUpperCase());
        /* int class = 5; -> no se puede utilizar porque es un nombre de variable, ni empezar por numero, solo "_$"
        como caracteres nuevos*/
        //NO TULIZAR ACENTOS NI CARACTERES ESPECIALES//
    }
}
