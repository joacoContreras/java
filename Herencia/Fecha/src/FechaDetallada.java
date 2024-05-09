public class FechaDetallada extends Fecha2 {
    private static String meses[] = {
        "Enero","Febrero","Marzo","Abril","Mayo","Junio",
        "Julio", "Agosto","Septiembre","Octubre","Noviembre"
        ,"Diciembre"};

    //constructor nulo
    public FechaDetallada() {

    }
    // constructor que recibe dia, mes y anio
    public FechaDetallada(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAnio(a);
    }
    public String toString() {
        return getDia() +" de " + meses[getMes() - 1]
        + " de " + getAnio();
    }
}
