public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] enteros;
        enteros = new int[5];

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 3; 
            System.out.println("Valor de entero N."+ i +" = "+ enteros[i] + "\n");
            System.out.println("Valor de entero N."+ i +"  multiplicado  por dos = "+ enteros[i]*2 + "\n");

        }
    }
}
