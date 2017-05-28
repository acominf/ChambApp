package paneles;

import javax.swing.SwingUtilities;

/**
 * Superclase de JPanel, añade métodos útiles para la manipulación del programa
 */
public class ContenidoPanel extends javax.swing.JPanel {
    protected ContenidoJFrame ventana;
    
    /**
     * Constructor empleado para inicializar el ContenidoPanel
     */
    ContenidoPanel(ContenidoJFrame ventana) {
        this.ventana = ventana;
    }
    
    /**
     * Método de seteo para la ventana predecesora
     * @param ventana
     */
    public void setVentana(ContenidoJFrame ventana) {
        this.ventana = ventana;
    }
    
    /**
     * Método de acceso que retorna la ventana predecesora
     * @return ventana
     */
    public ContenidoJFrame getVentana() {
        return ventana;
    }
    
    /**
     * Método de acceso que retorna la ventana actual
     * @return ventanaPadre
     */
    public ContenidoJFrame getPadre() {
        ContenidoJFrame padre;
        padre = (ContenidoJFrame) SwingUtilities.getWindowAncestor(this);
        return padre;
    }
}
