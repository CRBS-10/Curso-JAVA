
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su nombre completo ");
        String name = scanner.nextLine();

        System.out.println("ingres el precio de su primer producto");
        double producto1 = scanner.nextDouble();

        System.out.println("ingres el precio de su segundo producto");
        double producto2 = scanner.nextDouble();

        double totalSinIntereses = (producto1 + producto2);
        double totalDeFactura = totalSinIntereses * 0.19;
        double facturaReal= totalDeFactura+totalSinIntereses;

        //Forma realizada para la tarea esta buena pero se pudo optimizar mas
        
     /* System.out.println("DETALLES DE FACTURA" + "\n" + name);
        System.out.println("La factura producto de oficina tiene un total bruto de " + totalSinIntereses);
        System.out.println("con un impuesto de " + totalDeFactura + " y el monto después de impuesto es de " + facturaReal);
     */

        //FORMA OPTIMIZADA
        String detalle = "DETALLES DE FACTURA" + "\n" + name + "\n" + "La factura producto de oficina tiene un total bruto de " + totalSinIntereses;
        detalle += "con un impuesto de " + totalDeFactura + " y el monto después de impuesto es de " + facturaReal;

        System.out.println(detalle);

    }
}
