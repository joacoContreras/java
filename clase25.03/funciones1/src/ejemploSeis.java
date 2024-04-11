public class ejemploSeis {
    //Variable de objeto
    int i = 5;

    //Atributo de clase
    static int atributoClase = 10;
    public static void main(String[] args) {
        var variableLocal = 20;
        System.out.println("Variable local " + variableLocal);
        System.out.println("Variable clase: " + atributoClase);
        System.out.println("Variable instancia (objeto): " + new ejemploSeis().i);
    }
}
