public enum Continentes {
    AFRICA(52),
    AMERICA(34),
    EUROPA(45),
    ASIA(37),
    OCEANIA(20);
    
    // atributo de cada elemento
    private final int paises;
    
    // constructor de cada elemento de la enumeracion
    Continentes(int paises) {
        this.paises = paises;
    }
    public int getPaises() {
        return paises;
    }
}
