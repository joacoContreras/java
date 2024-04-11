import java.util.Scanner;

public class Cuenta {
    Scanner scanner  = new Scanner(System.in);
    public String nombre = "";
    public int numero = 0;
    public double saldo = 0;
    public String tipo = "";

    public void depositar() {
        System.out.println("Ingrese cantidad a Depositar:");
        float value = scanner.nextFloat();
        if (value > 0) {
            System.out.println("Operacion exitosa");
            saldo = saldo + value;
        } else {
            System.out.println("Error");
        }
    }
    
    public void retirar() {
        System.out.println("Ingrese cantidad a retirar:");
        float value = scanner.nextFloat();

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
        System.out.println("\n");
    }

    public void operar() {
        int opcion;
    
        do {
            System.out.println("Seleccione operacion a realizar");
            System.out.println("1. Imprimir datos de la cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Tu opcion: ");
            opcion = scanner.nextInt();
    
            switch (opcion) {
                case 1:
                    imprimir();
                    break;
                case 2: 
                    depositar();
                    break;
                case 3:
                    retirar();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (opcion != 4);
    }
    
    
}