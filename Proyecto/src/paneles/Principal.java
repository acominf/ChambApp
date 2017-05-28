package paneles;

/**
 * Clase que se encarga de crear el JFrame de inicio
 */
public class Principal {
    public static void main(String []args){
        Menu menu = new Menu("ChambApp");
        menu.setVisible(true);
    }
}
