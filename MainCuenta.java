import java.util.Random;

public class MainCuenta {
    public static void main(String[] args) {
        String[] prefixes = { "John", "Emma", "David", "Olivia", "James" };
        String[] middles = { "William", "Elizabeth", "Michael", "Sophia", "Alexander" };
        String[] suffixes = { "Smith", "Johnson", "Brown", "Taylor", "Miller" };
        String[] tipo_cuenta = {"Credito", "Debito"};
        Random random = new Random();
        Cuenta a;
        a = new Cuenta();
        a.nombre = prefixes[random.nextInt(prefixes.length)] + " " + 
        middles[random.nextInt(middles.length)] + " " +
        suffixes[random.nextInt(suffixes.length)];
        
        a.numero = random.nextInt(1000000);
        a.saldo = random.nextFloat() * 100000;
        a.tipo = tipo_cuenta[random.nextInt(tipo_cuenta.length)];

        a.operar();
        
    }
}