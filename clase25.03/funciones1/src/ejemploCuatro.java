public class ejemploCuatro {

    //Definimos la funcion
    static void cambiarValor(int[] parametro) {
        parametro[0] = 20;
    }
    public static void main(String[] args){
        //Creamos la variable
        int[] argumento = {10};
        System.out.println("Antes de llamar a la funcion: " + argumento[0]);
        //Llamamos a la funcion
        cambiarValor(argumento);
        System.out.println("Despues llamar a la funcion: " + argumento[0]);
    }
}
