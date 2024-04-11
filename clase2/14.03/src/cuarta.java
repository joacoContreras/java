public class cuarta {
    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "Valor Desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Uno";
                break;
            
            case 2:
                numeroTexto = "Dos";
                break;

            case 3:
                numeroTexto = "Tres";
                break;
            
            case 4:
                numeroTexto = "Cuatro";
                break;

            default:
                numeroTexto = "Numero no encontrado";
                break;
        }
        System.out.println("Numero Texto = " + numeroTexto);
    }
}
