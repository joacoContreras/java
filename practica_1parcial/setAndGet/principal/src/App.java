import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Ingrese caracteristicas del monitor");
        System.out.println("Nombre modelo: ");
        Scanner scannerModelo = new Scanner(System.in);
        String modelo = scannerModelo.nextLine();
        Scanner scannerResolucion = new Scanner(System.in);
        String resolucion = scannerResolucion.nextLine();
        Scanner scannerHz = new Scanner(System.in);
        int hz = scannerHz.nextInt();
        Scanner scannerId = new Scanner(System.in);
        int idNum = scannerId.nextInt();
        Monitor version1 = new Monitor(hz, idNum, modelo, resolucion);
        
    }
}


