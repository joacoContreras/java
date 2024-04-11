public class ejemploCinco {string[] args) {

    //Definimos la funcion
    static void cambiarValor(String[] parametro) {
        parametro{0} = "Adios";
        System.out.println("Parametro = " + parametro{0});
    }
    var argumento = "Hola";
    System.out.println("Antes de llamar a la funcion: " + argumento[0]);
    cambiarValor(argumento);
    System.out.println("Antes de llamar a la funcion: " + argumento[0]);
}
}
