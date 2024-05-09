public class TestContinentes {
    public static void main(String[] args) {
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Nro de Paises en el 4to continente = " + Continentes.AMERICA.getPaises());

        indicarPaises(Continentes.AFRICA);
    }
    public static void indicarPaises(Continentes continentes) {
        switch (continentes) {
            case AFRICA:
                System.out.println("Nro de Paises en "+continentes+": " + continentes.getPaises());
                break;
        
            default:
                break;
        }
    }
}