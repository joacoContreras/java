import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        char unCaracter = 'a';
        System.out.println("Contenido de la variable = "+ unCaracter);
        char unCaracter2 = 65;
        System.out.println("Segundo caracter = " + unCaracter2);

        boolean variable = true;
        if (variable == true) {
            System.out.println("La variable es verdadera ");
        } else{
            System.out.println("La varaible es falsa");
        }
        
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        var edad = entrada.nextLine();
        entrada.close();
        System.out.println("Tienes "+edad+ " years");

    }
}
