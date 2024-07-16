
public class Main {
    public static void main(String[] args) {
        String saludar = "hola desde java";
      //  System.out.printf(saludar);// lee el dato //
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());//metodo para leer datos en matuscula//

        int numero = 10;// siempre se debe inicializar variable 
       // System.out.println("numero = " + numero);// forma de imprimir
        int valor3;// creo la variable mas no le doy valor//
        boolean valor = true;
        int resultado = 60;//incializo variable y le doy valor
        if (valor) {
            int valor2 = 1;// creo variable dentro de las llaves
             valor3 = 15; // le doy valor a la variable
             resultado = 49;// modifico la variable
            System.out.println("numero = " + valor2);// solo se puede usar valor2 en los if ya que ese es el contexto
            System.out.println("valor3 = " + valor3);
            System.out.println("resultado = " + resultado);
        }
// solo estas se pueden inicializar ya que son variables globales las demas son de la llave if
        System.out.println("resultado = " + resultado);
        System.out.println("numero = " + numero);

        if (resultado >45){// se declaro este if con el fin de demostrar que se puede cambiar el valor de la variable dentro de una condicion //

            resultado = 87;
            System.out.println("resultado = " + resultado);
        }
    }
}