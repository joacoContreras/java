public class EjemploEnumeraciones {
    public static void main(String[] args) {
        System.out.println(" ");
        imprimirContinentes();
    }
    public static void imprimirContinentes() {
        
        for(Continentes c: Continentes.values()) {
            System.out.println("Continente: " +c+" contiene " + c.getPaises()+"paises.");
        }
        for (int i = 0; i < Continentes.values().length; i++) {
            System.out.println(Continentes.class.getEnumConstants()[i]+"");
        }
        System.out.println("get values()" + Continentes.values());
    }
    }

