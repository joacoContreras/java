import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporciona un valor entre 0 y 10:");
        int calificion = Integer.parseInt(scanner.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificion >= 9 && calificion <= 10) {
            System.out.println("A");
        
        } else if (calificion >= 8 && calificion < 9) {
            System.out.println("B");
        
        } else if (calificion < 8 && calificion >= 7) {
            System.out.println("C");
            
        } else if (calificion <7 && calificion >= 6) {
            System.out.println("D");

        } else if (calificion >= 0 && calificion < 6) {
            System.out.println("F");
        
        } else {
            System.out.println("Valor Desconocido");
        }
    }
}
