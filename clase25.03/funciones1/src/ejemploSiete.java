public class ejemploSiete {
    static void funcionRecursiva(int numero) {
        //Caso Base :
        if (numero == 1) {
            System.out.println("numero = " + numero);

        } else {
            funcionRecursiva(numero - 1);
            System.out.println("numero = " + numero);
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
