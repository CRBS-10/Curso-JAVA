package String;

public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.indexOf('.');
        int a = archivo.lastIndexOf('.');

        System.out.println("i = " + i);
        //cantidad de caracteres 
        System.out.println("archivo.length() = " + archivo.length());
        //Este nos dice desde donde quiere el fragmento
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        //Forma dinamica
        //El +1 para que muestre los caracteres despues del punto
        System.out.println("archivo = " + archivo.substring(i+1));
        //La mejor forma es con las que conseguir las extensiones de forma dinamica
        System.out.println("archivo = " + archivo.substring(a+1));

    }
}
