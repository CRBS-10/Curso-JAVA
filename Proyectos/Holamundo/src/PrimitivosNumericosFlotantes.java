public class PrimitivosNumericosFlotantes {
    
    static float varFlotante;// variable de la clase
    // al no tener valor pero ser una variable de forma global lo registra en cero
    public static void main(String[] args) {


        // Primitivos punto flotante

        // "Float" es la clase para acceder a todos los metodos
        // LA 'f' ES OBLIGATORIA 
        float numeroFloat = 165790000.98f;
        float realFloat = 1.5e4f; // esto de agregar la e es como NOTACION CIENTIFICA, SE CORRE A LA DERECHA
        float numFloat = 124.3e-3f;// nuevamente NOTACION CIENTIFICA, SE CORRE A LA IZQUIERDA
        System.out.println("numeroVar = " + numeroFloat);
        System.out.println("realFloat = " + realFloat);
        System.out.println("numFloat = " + numFloat);
        System.out.println(" tipo de float corresponde en float a " + Float.BYTES);
        System.out.println(" tipo de float corresponde en bite a " + Float.SIZE);
        System.out.println(" valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println(" valor minimo de un float: " + Float.MIN_VALUE);


        // "Double" es la clase que nos permite acceder a todos los elementos de esta clase
        // SE PUEDE COLO COLOCAR UNA 'D' PERO NO ES NECESARIA
        double numeroDouble = 9223375807.0;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println(" tipo de double corresponde en double a " + Double.BYTES);
        System.out.println(" tipo de double corresponde en bite a " + Double.SIZE);
        System.out.println(" valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println(" valor minimo de un double: " + Double.MIN_VALUE);
        
        
        //var es flexible de igual manera en este lugar
        //AUTOMATICAMENTE AJUSTA 
        var varFlotant = 3.1416f;
        System.out.println("varFlotant = " + varFlotant);


        System.out.println("varFlotante = " + varFlotante);
    }
}
