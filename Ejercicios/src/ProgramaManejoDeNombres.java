import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el nombre de la persona 1" );
        String nombre1 = sc.nextLine();
        System.out.println("ingrese el nombre de la persona 2");
        String nombre2 = sc.nextLine();
        System.out.println("ingrese el nombre de la persona 3");
        String nombre3 = sc.nextLine();


        nombre1 = nombre1.toUpperCase();
        nombre2 = nombre2.toUpperCase();
        nombre3 = nombre3.toUpperCase();

        System.out.println("nombre1 = " + nombre1.charAt(1)+"."+nombre1.substring(nombre1.length()-2).toLowerCase() );
        System.out.println("nombre2 = " + nombre2.charAt(1)+"."+nombre2.substring(nombre2.length()-2).toLowerCase() );
        System.out.println("nombre3 = " + nombre3.charAt(1)+"."+nombre3.substring(nombre3.length()-2).toLowerCase() );

    }

}
