public class Primitivos {
    public static void main(String[] args) {


        //los tipode datos primitivos son tipos de datos que nos ayudan a retornar valor dandonle limites depende el tipo de dato //
        // todos estos son primitivos pero enteros//
         byte numeroByte = 127;//El primitivo se llama byte pero la clase Byte
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);// te da el numero de datos de byts
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);// size te da el numero de bits del dato primitivo
        System.out.println("Valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 30000; //el primitivo se llama short pero la clase se llama Short
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShort corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);// size te da el numero de bits del dato primitivo
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE );

        int numeroInt =  2147483647;// int es el primitivo pero la clase se llama Integer
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroInt corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);


        long numeroLong = 9223372036854775807L; // long es el primitivo y la clase se LLama Long // Tenemos que indicar que ya no es entero con una "L"
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroLong corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);

        var numeroVar= 9223372036854775807L; // tipo de dato que se asigna de forma automatica // ya que es dinamico //
        System.out.println("numeroVar = " + numeroVar);// siempre es integer a menos que nos pasemos del limite //


        /// primitivos de punto flotante ///



    }
}
