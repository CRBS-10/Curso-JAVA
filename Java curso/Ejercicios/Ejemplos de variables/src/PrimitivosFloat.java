public class PrimitivosFloat {

    public static void main(String[] args) {
        // no necesariamente tinen que ser decimales // acepta tambien enteros //
        //pero lo convertira en punto flotante como "1.00"//

        float numFloat = 1212312.0f; // se tiene que colocar la f para especificar el tipo de dato, ya que no se puede colocar el punto//
        //  ya que si se realiza asi lo tranforma en un double y nos indica error//
        float numFloat2 = 12e3f;// notacion cientifica que indica por cuanto se esta multiplicando en notacion cientifica//
        float numFloat3 = 12e-3f;// notacion cientifica negativa// mantiza,exponente,valor//
        System.out.println("Primitivo float: " + numFloat);
        System.out.println("Primitivo float2: " + numFloat2);
        System.out.println("Primitivo float3: " + numFloat3);
        System.out.println("numFloat corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);
    }
}
