package String;

public class TestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a ;

        //STRINGBUILDER ES EL METODO MAS EFICIENTE con muchos string

        //Prueba Utilizando String BUilder
        // Creacion de objeto
        // este si es mutable
        StringBuilder sb = new StringBuilder(a); // ese a se coloca por defecto

        // prueba de rendimeinto
        //calculo de timepo, la clase System contiene el tiempo actual, fecha en milisegundos
        long inicio = System.currentTimeMillis();

        //flujo de control
        //i++ -> postIncremento
        //el signo se invierte para saber cuando se rompa
        for( int i = 0 ; i < 500 ; i++){

            /*c = c.concat(a).concat(b).concat("\n");*/ // 500 -> 4 miliseg

            // cuando concatenas asi te ahorras decir c= c+a+b
            /*c += a + b + "\n";*/ // 500 tardo 32 milisegundos


            //StringBuilder -> aqui la concatenacion es con append
            sb.append(a).append(b).append("\n"); // en este caso el resultado son cero milisegundos 500 -> 0
          /*  sb.append(a);
                    sb.append(b);
                            sb.append("\n");*/ // ESTO ES OTRA FORMA
        }

        long fim = System.currentTimeMillis();
        System.out.println(fim - inicio);
        System.out.println(" Resultado = " + sb);
    }
}
