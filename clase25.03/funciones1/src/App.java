import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Definimos la funcion
        public static void saludar(String mensaje) {
            System.out.println("Mensaje: "+mensaje);
        }

        public static void main(String[] args) {
            System.out.println("Proporciona un mensaje: ");
            var mensajeArg = new Scanner(System.in).nextLine();
            //Llamamos a la funcion
            saludar(mensajeArg);
        }
    }
}
