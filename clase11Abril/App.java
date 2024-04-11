
public class App {
    public static void main(String[] args) throws Exception {
        Ejemplo e;
        Ejemplo f;
        e = new Ejemplo(); // instancia "e" de la clase Ejemplo
        f = new Ejemplo(); // instancia "f" de la clase Ejemplo
        e.a = 7;
        e.hacerAlgo();
        f.x = e.suma();
        f.a = f.x + e.a;
        e.a = f.suma();
        e.imprimir();
        f.imprimir();
    }
}
