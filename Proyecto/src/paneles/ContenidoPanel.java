package paneles;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author davidazullo
 */
public class ContenidoPanel extends javax.swing.JPanel {
    protected ContenidoJFrame ventana;
    ContenidoPanel(ContenidoJFrame ventana) {
        this.ventana = ventana;
    }
    
    public void setVentana(ContenidoJFrame ventana) {
        this.ventana = ventana;
    }
    
    public JFrame getVentana() {
        return ventana;
    }
    
    public ContenidoJFrame getPadre() {
        ContenidoJFrame padre;
        padre = (ContenidoJFrame) SwingUtilities.getWindowAncestor(this);
        return padre;
    }
}
