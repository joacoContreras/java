import java.util.Random;
public class matricesDosD {
    public static void main(String[] args) {
        Random numero = new Random(System.currentTimeMillis());

        final int RENGLONES = numero.nextInt(100);
        final int COLUMNAS = numero.nextInt(100);
        int[][] matriz = new int[RENGLONES][COLUMNAS];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j] = numero.nextInt(100);
                System.out.println("Arreglo["+i+"]["+j+"] = " + matriz[i][j]);
            }
        }
    }
}
