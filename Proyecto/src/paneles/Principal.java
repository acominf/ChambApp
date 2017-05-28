package paneles;

/**
 * Clase que se encarga de crear el JFrame de inicio
 */
public class Principal {

    /**
     * Función principal del programa
     * @param args
     */
    public static void main(String []args){
        String tituloApp = "ChambApp";
        Menu menu = new Menu(tituloApp);
        menu.setVisible(true);
    }
}
