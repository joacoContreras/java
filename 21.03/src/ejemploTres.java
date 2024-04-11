import java.util.Scanner; 
public class ejemploTres {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        int[] enteros = new int[largoArreglo];

        for (int i = 0; i < largoArreglo; i++) {
            System.out.println("Proporciona elemento["+i+"]");
            enteros[i] = Integer.parseInt(consola.nextLine());
            
        }

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Contenido del arrelgo["+i+"] = " + enteros[i]);
        }
    }
}
