import java.util.Scanner;

public class Cuenta {
    String nombre = "";
    int numero = 0;
    float saldo = 0;
    String tipo = "";

    public void depositar() {
        System.out.println("Ingrese cantidad a Depositar:");
        Scanner scanner = new Scanner(System.in);
        float value = scanner.nextFloat();
        scanner.close();
        if (value > 0) {
            System.out.println("Operacion exitosa");
            saldo = saldo + value;
        } else {
            System.out.println("Error");
        }
    }
    
    public void retirar() {
        System.out.println("Ingrese cantidad a retirar:");
        Scanner scanner = new Scanner(System.in);
        float value = scanner.nextFloat();
        scanner.close();

        if (saldo >= value) {
            System.out.println("El retiro se ha realizado exitosamente");
            saldo = saldo - value;
        } else {
            System.out.println("No se ha podido realizar el retiro, saldo insuficiente");
        }
    }

    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Numero de cuenta = " + numero);
        System.out.println("Saldo = " + saldo);
        System.out.println("Tipo de cuenta = " + tipo);
    }
}
