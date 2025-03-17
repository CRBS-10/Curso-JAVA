package Operadores;

public class OperadoresDeAsignacion {

    public static void main(String[] args) {

        //los operadores de asignacion son los que se venian
        // trabajando antes en este caso el igual "="
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        // operadores combinados o compuestos
        //EJEMPLO
        // aqui decimos que se va suma a la variable anterior
        //COMPUESTO PARA SUMA
        i += 2; //i = i + 2;
        System.out.println("i = " + i);

        // como anteriormente era 7 se debido a la suma realizada
        // cambia
        i += 5;// i=i+5
        System.out.println("i = " + i);

        //COMPUESTO PARA RESTA
        j-=4;// j = j-4
        System.out.println("j = " + j);

        //COMPUESTO PARA MULTI
        j*=3; // j= j*3
        System.out.println("j = " + j);

        // COMPUESSTO PARA DIV
        j /= 3; //j = j/3;
        System.out.println("j = " + j);

        //COMPUESTO PARA STRING
        String ssqlString = "select * from clientes as c";
        ssqlString += "where c.nombre 'Andres' "; // concatena
        ssqlString += "and c.activo=1 ";
        System.out.println(ssqlString);


    }
}
