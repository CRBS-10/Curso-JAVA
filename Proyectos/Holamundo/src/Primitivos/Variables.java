package Primitivos;

public class Variables {
    public static void main(String[] args) {

        //ejemplo de valores


        //definir el tipo de dato
        //integer permite colocar valores
        String saludar = "Hola Mundo desde JAVA";
        System.out.println(saludar);
        System.out.println("saludar..toUpperCase() = " + saludar.toUpperCase());
        //.toUpperCase() -> se utiliza para que salga en matuscula, es un metodo
        
        // primtivos . int .
        int numero = 10;
        int numero2 = 45;
        System.out.println("numero = " + numero);
        boolean valor = true;

        if (valor) {
            System.out.println("numero = " + numero);
             numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 25;
        var numero4 = "54";
        //var es para decir que es un tipo de dato flexible, este lo asigna de forma automatica
    }
    //ATAJOS
    // sout -> System.out.println(saludar);
    // soutv -> imprime con la variable asignada
}
