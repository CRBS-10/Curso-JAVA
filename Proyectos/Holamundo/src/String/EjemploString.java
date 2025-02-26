package String;

public class EjemploString {
    public static void main(String[] args) {
        //String es un tipo especial no es un primitivo
        // es un objeto
        // este crea el obejto con el new pero no se ve
        // se creo asi para automatizar
        //FORMA IMPLICITA
        // de esta forma se ahorra un instancia 
        String curso = "Programacion Java";

        //Creacion del objeto
        //creacion del objeto -> () aqui se coloca el argumento por el constructor
        //FORMA EXPLICITA
        String curso2 = new String("Programacion Java");
        String curso3 = new String("Programaci0n Java");
        String curso4 = new String("programacion java");

        // EN JAVA TOD0 OBJETO SON OBJETOS DIFERENTES

        boolean esIgual = curso == curso2;// aca el == compara la referencia
        System.out.println("esIgual = " + esIgual);// da falso esto debido a que son dos objetos diferentes

        // aca compara el objeto o el atributo o el valor
        esIgual = curso.equals(curso2); // se hace asi para comparar el valor y no el objeto
        System.out.println("esIgual = " + esIgual);

        // es importante que sea igual
        esIgual = curso.equals(curso3);// aca demuestra que da error por que no coincide la forma escrita
        System.out.println("esIgual = " + esIgual);


        // esto lo que te permite es ignorar las mayusculas o minisculas mientras el texto llegue a lo mismo
        esIgual = curso.equalsIgnoreCase(curso4);
        System.out.println("esIgual = " + esIgual);

        // aca cuando se realiza la comparacion se encuentra que se puede usar el mismo signo "==" ya que de esta forma
        //asigna el valor del obejto esto se hace para no crear muchos textos
        String curso5 = "Programacion Java";
        esIgual = curso == curso5;
        System.out.println("esIgual = " + esIgual);


    }
}
