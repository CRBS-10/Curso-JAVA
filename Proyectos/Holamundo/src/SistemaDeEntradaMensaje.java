import javax.swing.*;

public class SistemaDeEntradaMensaje {
    public static void main(String[] args) {

        // JOptionPane.showInputDialog(null,"Ingrese un numero entero"); -> TOD0 eso es un String
        //Al utilizar JOptionPane aqui estamos utilizando ventanas emergentes para el desarrollo del codigo
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");

        int numeroDecimal = 0;// se define en cero ya que es un valor por defecto

        // el try catch -> sirve para el manejo de errores
        try{
            //try -> lo que intenta ejecutar
            // cuando el string no es un numero
            numeroDecimal = Integer.parseInt(numeroStr);

        }catch (NumberFormatException e){// catch -> por si algo sale mal en el try
            JOptionPane.showMessageDialog(null,"El numero entero no es valido");
            // para que repita el proceso se llama al metodo "main
            main(args);// si solo se deja asi se vuelve recursivo
            System.exit(0);// cero que tod0 salio sin ningun problema
        }// dentro del catch se coloca la excepcion para manejar el error

        // Se utiliza la clase Integer con el metodo parseInt para convertir de string a decimal
        System.out.println("numeroDecimal = " + numeroDecimal);

        //BINARIO
        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        int numeroBinario =  0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        // sistema octal
        String mensajeOctal = "numero octal = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal  =  0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //sistema hexadecimal
        String mensajeHex = "numero hex = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHex);
        int numeroHexadecimal  =  0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);


        // ESTO ES UNA FORMA DE HACERLO
        /*String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        //+= -> esto sirve como una concatenacion
        //esto '+=' -> sustituye a poner "mensaje = mensaje +" ambas son validas para concatenar
        // "\n" -> bajar una linea
        mensaje += "\nnumero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero Haxadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);*/

        //OTRA FORMA DE HACERLO
       /* String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;*/

        //OTRA FORMA DE HACERLO
        String mensaje = mensajeBinario + "\n" + mensajeOctal + "\n" + mensajeHex;
        // JOptionPane -> clase con metodos estaticos
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
