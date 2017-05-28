package paneles;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.System.exit;
import javax.swing.JFrame;

/**
 *
 * @author davidazullo
 */
public class ContenidoPanel extends javax.swing.JPanel implements KeyListener {
    protected JFrame ventana;
    ContenidoPanel(JFrame ventana) {
        this.ventana = ventana;
    }
    
    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }
    
    public JFrame getVentana() {
        return ventana;
    }
    
    private void KeyReleased(java.awt.event.KeyEvent evt) {                                 
        int tecla = evt.getKeyCode();
        switch(tecla) {
            case KeyEvent.VK_ESCAPE:
                exit(0);
                break;
        }
    }                                

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
