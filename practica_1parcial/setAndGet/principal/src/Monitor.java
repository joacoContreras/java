public class Monitor {
    private int hz;
    private String modelo;
    private int idNum;
    private String resolucion;

    public Monitor(int hz, int idNum, String modelo, String resolucion  ) {
        this.hz = hz;
        this.idNum = idNum;
        this.modelo = modelo;
        this.resolucion = resolucion;
    }
}