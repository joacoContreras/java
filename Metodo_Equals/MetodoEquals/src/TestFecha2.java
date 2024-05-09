public class TestFecha2 {
    public static void main(String[] args) throws Exception {
        // creamos una fecha  a partir de los tres valores por separado
        Fecha f = new Fecha2(25,10,2004);
        // creamos una fecha a partir de una cadena con formato dd/mm/aaaa
        Fecha f2 = new Fecha2("25/10/2004");

        // imprimimos el dia
        System.out.println("Dia = " + f.getDia());
        System.out.println("Mes = " + f.getMes());
        System.out.println("Anio = " + f.getAnio());

        // imprimimos la fecha
        System.out.println(f);
        System.out.println(f2);
        System.out.println("Son iguales f1 y f2?" + f.equals(f2));
    }
}
