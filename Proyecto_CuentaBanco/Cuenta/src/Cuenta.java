import java.util.Scanner;

public class Cuenta {
    private String nombre;
    private double saldo;
    private int numCuenta;
    private String tipoCuenta;

    public Cuenta(String n, double s, int num, String tipo) {
        this.nombre = n;
        this.saldo = s;
        this.numCuenta = num;
        this.tipoCuenta = tipo;
    }

    public void Retirar(int retiro) {
        if (retiro > saldo) {
            System.out.println("Retiro a fallado, no posee saldo suficiente");
        } else {
            saldo -= retiro;
            System.out.println("Retiro realizado exitosamente");
            System.out.println("Nuevo saldo = " + saldo);
        }
    }
    
    public void Depositar(int deposito) {
        saldo += deposito;
        System.out.println("Se ha ingresado " + deposito  + "$ en su cuenta");
        System.out.println("Nuevo saldo = " + saldo);

    }

    public void Imprimir() {
        System.out.println("Nombre Titular = " + nombre);
        System.out.println("Numero de cuenta = " + numCuenta);
        System.out.println("Tipo de Cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo + "$");
    }

    public void Menu() {
        System.out.println("Menu");
        System.out.println("1. Imprimir datos de la cuenta");
        System.out.println("2. Realizar Deposito");
        System.out.println("3. Realizar Retiro");
        System.out.println("Otro para salir");
        System.out.println("Ingrese el numero de operacion a  realizar: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Imprimir();
                    Menu();
                    break;
                case 2:
                    System.out.println("Ingrese monto a depositar en su cuenta: ");
                    Scanner depositoScanner = new Scanner(System.in);
                    if (scanner.hasNextInt()) {
                        int deposito = scanner.nextInt();
                        Depositar(deposito);
                    } else {
                        System.out.println("Caracteres ingresados incorrectos");
                    }
                    Menu();
                    break;
                case 3:
                    System.out.println("Ingrese monto a retirar de su cuenta:");
                    Scanner retiroScanner = new Scanner(System.in);
                    if (scanner.hasNextInt()) {
                        int retiro = scanner.nextInt();
                        Retirar(retiro);
                    } else {
                        System.out.println("Caracteres ingresados incorrectos");
                    }
                    Menu();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Saliendo...");
        }
        scanner.close(); 
    }

}