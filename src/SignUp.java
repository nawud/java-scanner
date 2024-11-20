import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
                Scanner scanner = new Scanner(System.in);

                // Pedir los datos al usuario
                System.out.print("Ingrese su nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese su apellido: ");
                String apellido = scanner.nextLine();

                System.out.print("Ingrese su nombre de usuario: ");
                String usuario = scanner.nextLine();

                System.out.print("Ingrese su contraseña: ");
                String contrasenya = scanner.nextLine();


                System.out.println("\nHola " + nombre + " " + apellido + ", tu nombre de usuario es " + usuario + " y tu contraseña es " + contrasenya + ", gracias por registrarte.");


        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
    }
}