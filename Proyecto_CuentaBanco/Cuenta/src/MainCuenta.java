import java.util.Random;
import java.util.Scanner;

public class MainCuenta{
    public static void main(String[] args) {
        System.out.println("Ingrese nombre para acceder a su cuenta: ");
        Scanner scanner = new Scanner(System.in);
        String inputNombre = scanner.nextLine();
        System.out.println("Seleccione su tipo de cuenta: ");
        System.out.println("1. Debito \n2. Credito \nOtro para salir \nOpcion: ");
        Scanner scanner2 = new Scanner(System.in);
        if (scanner2.hasNextInt()) {
            int opcion = scanner2.nextInt();
            if (opcion == 1) {
                Random random = new Random();
                int randomNumber = random.nextInt(999999);
                double randomSaldo = Math.round(random.nextDouble() * 999999) / 100.0;
                Cuenta debito = new Cuenta(inputNombre, randomSaldo, randomNumber, "Debito");
                debito.Menu();
            } else if(opcion == 2) {
                Random random = new Random();
                int randomNumber = random.nextInt(999999);
                double randomSaldo = Math.round(random.nextDouble() * 999999) / 100.0;
                Cuenta credito = new Cuenta(inputNombre, randomSaldo, randomNumber, "Debito");
                credito.Menu();

            } else {
                System.out.println("Caracter ingresado no valido");
            }
        } else {
            System.out.println("Saliendo...");
        }

        scanner.close();
    }
}