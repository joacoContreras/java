public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var mes = 4;
        var estacion = "Estacion indefinida";

        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Verano";
                break;
            
            case 3: case 4: case 5:
                estacion = "Otonio";
                break;

            case 6: case 7: case 8:
                estacion = "Invierno";
                break;

            case 9: case 10: case 11:
                estacion = "Primavera";
                break;

            default:
                estacion = "unknown";
            break;
        }

        System.out.println("Estacion = " + estacion);
    }
}
