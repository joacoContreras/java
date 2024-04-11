import java.util.Random;

public class ejemplo4 {
    public static void main(String[] args) {
        var aleatorio = new Random();
        //creamos objeto random
        int valorAleatorio = aleatorio.nextInt(0);
        System.out.println("numero aleatorio = " + valorAleatorio);
    }
}
