import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner
        Scanner scanner = new Scanner(System.in);



        System.out.println("Hola, ¿Cómo te llamas?");
        String nombre = scanner.nextLine();
        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.


        System.out.println("Hola "+nombre+" ! Soy un Bot. ¿De qué ciudad eres?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        String ciudad = scanner.nextLine();

        System.out.println("\nHe escuchado que "+ciudad+" es un encanto. Yo nací en Oracle city.");
        System.out.println("\n¿Cuántos años tienes?");
        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

      int edad = scanner.nextInt();
      scanner.nextLine();




        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("Entonces me dices que tienes "+edad+" años. Yo tengo 400 años.");
        System.out.println("Eso quiere decir que soy " + ((double)400 / edad) + " veces más vieja que tu.");
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");


        //Recoge el dato
        String language = scanner.nextLine();
        //Añade una nueva línea.
        System.out.println(language+"\n, ¡Eso es excelente! Mucho gusto haber hablado contigo "+nombre+" ¡Hablamos luego!");

        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner

    }
}
