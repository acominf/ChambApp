package elementos;

import paneles.ContenidoJFrame;
import paneles.ContenidoPanel;

/**
 * Clase encargada de manipulaciones entre JFrames y JPanels
 */
public class Utilerias {

    /**
     * Metodo cuya funcion es asignar el JFrame actual al componente creado,
     * lo asigna a otro JFrame y lo hace visible, oculta el original
     * @param jframe
     * @param componente
     */
    public static void muestraComponente(ContenidoJFrame jframe, ContenidoPanel componente) {
        ContenidoJFrame f;
        f = new ContenidoJFrame(jframe.getChambapp());
        f.getContentPane().add(componente);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        jframe.setVisible(false);
    }
    
    /**
     * Metodo que se encarga de hacer visible al JFrame predecesor
     * @param actual
     */
    public static void cambiaComponentePadre(ContenidoPanel actual) {         
        actual.getVentana().setVisible(true);
        actual.getPadre().setVisible(false);
    }
    
    /**
     * Método que compara si son constraseñas son iguales
     * @param principal
     * @param secundario
     * @return 
     */
    public static boolean comparaPassword(char principal[], char secundario[]){
        if(principal.length == secundario.length){
            for(int i = 0; i < principal.length; i++){
                if(principal[i] != secundario[i])
                    return false;
            }
            return true;
        }
        return false;
    }
}
