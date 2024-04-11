import java.util.Random;

public class mainCuenta {
    public static void main(String[] args) {
        String[] prefixes = { "John", "Emma", "David", "Olivia", "James" };
        String[] middles = { "William", "Elizabeth", "Michael", "Sophia", "Alexander" };
        String[] suffixes = { "Smith", "Johnson", "Brown", "Taylor", "Miller" };
        String[] tipo_cuenta = {"Credito", "Debito"};
        Random random = new Random();
        Cuenta a;

        a.nombre = prefixes[random.nextInt(prefixes.length)] + " " + 
        middles[random.nextInt(middles.length)] + " " +
        suffixes[random.nextInt(suffixes.length)];
        
        a.numero = random.nextInt();
        a.saldo = random.nextFloat();
        a.tipo = tipo_cuenta[random.nextInt(tipo_cuenta.length)];

        a.imprimir();
    }
}
