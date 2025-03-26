package Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

//        OPERACIONES SIEMPRE EN PARENTESIS CUANTO NO SE TIENE LA VARIABLE CON LA OPERACION
//        Cuando hay variables de igual tipo se pueden definir en una sola linea
//        FORMAS
//     F1   int i =5; int j=4;
//     F2    int i =5, j=4;

//        Operadores Aritmeticos
        int i =5,  j=4, suma = i+j;

        System.out.println("suma = " + suma);
//        Aqui concatena strings y no realiza ninguna operacion porque evalua de izq a derecha y eso dice que es string
//        por lo que todo estambien

        System.out.println("i + j = " + i + j);

//        pero si damos vueltas todo funciona correctamente
        System.out.println(i+j + " este es el resultado ");
//        otra forma que funcione es la siguiente -> ya que los parentesis indican que es una operacion
        System.out.println("suma = " + (i+j));

        int resta=i-j;

//        RECORDAR que si esto se coloca  System.out.println("i + j = " + i - j);
//        Dara error ya que es un string y no hay concatenacion de i -
//        aqui toca si o si colocar los parentesis
        System.out.println("resta = " + resta);

        int multiplicacion=i*j;

        System.out.println("multiplicacion = " + multiplicacion);

        int division=i/j;
        float division2=i/j;

//        aplicamos cast

        float division3= (float) i/j;
        System.out.println("division = " + division);
//        aqui muestra 1.0 aunque sabemos que es 1.25 y es float . porque trabaja con strings
//        por loq ue tenemos que poner un cast en la variable
        System.out.println("division2 = " + division2);
        System.out.println("division3 = " + division3);

//        El modulo es para sacar el resto de la operacion cuando no es par
//        se le llama resto por que es lo que sobra
//        el modulo es una division que muestra solo lo que sobra de dos numeros

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un Numero al sistema"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es par: " + numero);
        }else {
            JOptionPane.showMessageDialog(null, "El numero es impar: " + numero);
        }
    }
}
