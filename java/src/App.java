import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona Envio gratuito:");
        boolean envioGratis = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + "'s " + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envioGratis);

    }   
}
