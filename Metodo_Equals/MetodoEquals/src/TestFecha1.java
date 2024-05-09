import java.util.Scanner;

public class TestFecha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // usuario ingresa fecha
        System.out.println("Ingrese Fecha 1 (dia mes anio)");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
    //creamos un obj de la clase fecha
        Fecha f1 = new Fecha(dia, mes, anio);
    // usuario ingresa segunda fecha
    System.out.println("Ingrese Fecha 2 (dia mes anio)");
    dia = scanner.nextInt();
    mes = scanner.nextInt();
    anio = scanner.nextInt();
//creamos un obj de la clase fecha
    Fecha f2 = new Fecha(dia, mes, anio);
    System.out.println("Fecha 1 = " + f1);
    System.out.println("Fecha 2 = " + f2);
    if (f1.equals(f2)) {
        System.out.println("Las fechas son iguales");
    } else {
        System.out.println("Las fechas no son iguales");
    }
    }
}
