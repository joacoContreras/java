public class Fecha2 {
    private int dia;
    private int mes;
    private int anio;
    // retorna la fecha expresada en dias
    private int fechaToDias() {
        return anio*360 + mes *30 + dia;
    }
    // asigna la fecha expresada en dias a los atributos
    private void diasToFecha(int i) {
        // dividimos por 360 y obtenemos el anio
        anio = (int) i / 360;
        //del resto podemos obtener el mes y el dia
        int resto = i % 360;
        mes = (int) resto / 30;
        dia = resto % 30;

        if (dia==0) {
            dia = 30;
            mes--;
        }
        if (mes == 0) {
            mes = 12;
            anio--;
        }
        public void addDias(int d) {
            // convertimos la fecha a dias y le sumumamos d
            int sum = fechaToDias() + d;
            diasToFecha(sum);
        }
    }

    public Fecha2(String s) {
    // buscamos la primera ocurrencia de '/'
        int pos1 = s.indexOf('/');
    // buscamos la ultima ocurrencia de '/'
        int pos2 = s.lastIndexOf('/');
    // procesamos el dia
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);
    // procesamos el mes
        String sMes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);
    // procesamos el anio
        String sAnio = s.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);
    }
    // constructor
    public Fecha2(int d, int m, int a) {
        dia = d;
        mes = m;
        anio = a;
    }
    // constructor vacio
    public Fecha2() {
        
    }
    // sobrescribimos el metodo toString
    public String toString() {
        // retonar una cadena tal como queremos que se vea la fecha
        return dia+"/"+mes+"/"+anio;
    }

    // sobrescribimos el metodo equals
    public boolean equals(Object o) {
        Fecha2 otra = (Fecha2)o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }

    public int getDia() {
        // retorna el valor de la variable dia
        return dia;
    }
    public void setDia(int dia) {
        // asigna el valor del parametro a la variable dia
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}
