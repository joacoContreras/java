import java.util.Scanner;

public class ejemplo5 {
    public static void main(String[] args) {
        System.out.println("Proporciona un valor numerico: ");
        var scanner = new Scanner(System.in);
        var numero = Integer.parseInt(scanner.nextLine());
        var numAbsoluto = Math.abs(numero);
        System.out.println("numero = " + numero);
    }
}
