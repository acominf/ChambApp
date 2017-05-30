package paneles;

/**
 * Clase que se encarga de crear el JFrame de inicio
 */
public class Principal {

    /**
     * Función principal del programa, ejecuta la interfaz del menu
     * y crea una instancia de chambapp que incluye nombres y rutas 
     * importantes de la aplicación
     * @param args
     */
    public static void main(String []args){
        Chambapp chambapp;
        chambapp = new Chambapp("Chambapp",
            "src/Imagenes/Logo.png");
        Menu menu = new Menu(chambapp);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
