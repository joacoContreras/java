import java.text.DecimalFormat;

public class ejemplo6 {
    public static void main(String[] args) {
        var numero = 8.32;
        var redondo = Math.round(numero);
        System.out.println("redondeo = " + redondo);
        var patron = "0";
        var decimalFormat = new DecimalFormat(patron);
        var truncado = decimalFormat.format(numero);
        System.out.println("Truncado = " + truncado);
    }
}
