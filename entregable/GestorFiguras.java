import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GestorFiguras {
    // HerramientaDeAzar provee las funcionalidades para
    // la generacion de objetos aleatoriamente.
    private HerramientaDeAzar generador;
    // Coleccion para almacenar los objetos a usar
    private List<FiguraGeometrica> figuras;

    /**
     * Inicializa la aplicacion.
     * Debe construir los objetos HerramientaDeAzar y
     * la coleccion de figuras geometricas.
     */
    public GestorFiguras () {
        // TODO - Implementar el metodo
    }

    public List<FiguraGeometrica> getFiguras () {
        return figuras;
    }

    public HerramientaDeAzar getAzar () {
        return generador;
    }
    
    /**
     * Agrega una figura geometrica a la coleccion.
     * @param f La figura para agregar.
     */
    public void agregarFigura (FiguraGeometrica f) {
        figuras.add(f);
    }

    /**
     * Agrega una figura geometrica aleatoria a la coleccion.
     * Se solicita la figura a la clase HerramientaDeAzar.
     */
    public void agregarFiguraAleatoria () {
        // TODO - Implementar el metodo
    }

    /**
     * Crea la cantidad de figuras indicadas y las incorpora
     * a la coleccion. Las figuras se generan aleatoriamente
     * mediante la clase HerramientaDeAzar.
     * @param cantidad La cantidad de figuras a crear.
     */
    public void crearFigurasAleatoriamente(Integer cantidad) {
        // TODO - Implementar el metodo
    }

    /**
     * Muestra por pantalla la informacion de todas las figuras
     * geometricas coleccionadas usando toString().
     */
    public void listarFigurasColeccionadas() {
        // TODO - Implementar el metodo
    }

    /**
     * Muestra por pantalla la informacion de todas las figuras
     * geometricas coleccionadas usando toString() pero ordenadas
     * en su orden natural.
     */
    public void listarFigurasOrdenadas() {
        // TODO - Implementar el metodo
    }

    /**
     * Muestra por pantalla la informacion de todas las figuras
     * geometricas coleccionadas usando toString() pero ordenadas
     * segun la distancia a la posicion indicada.
     * Agregar al toString() de las figuras geometricas una linea
     * con el formato
     *      " -- Distancia=X"
     * donde X es la distancia al origen.
     */
    public void listarFigurasSegunDistanciaAlOrigen() {
        // TODO - Implementar el metodo
    }

}
