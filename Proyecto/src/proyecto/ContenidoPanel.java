package proyecto;

import javax.swing.JFrame;

/**
 *
 * @author davidazullo
 */
public class ContenidoPanel extends javax.swing.JPanel {
    protected JFrame ventana;
    ContenidoPanel(JFrame ventana) {
        this.ventana = ventana;
    }
    
    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }
}
