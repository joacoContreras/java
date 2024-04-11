public class ejemploOcho {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("Largo de la cadena: " + cadena.length());
        
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(i + " -  " + cadena.charAt(i));
            
        }   
    }

}
