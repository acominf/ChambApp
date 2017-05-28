package paneles;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.System.exit;
import javax.swing.JFrame;

/**
 *
 * @author davidazullo
 */
public class ContenidoJFrame extends JFrame implements KeyListener {
    ContenidoJFrame(String titulo) {
        super(titulo);
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
        int tecla = ke.getKeyCode();
        switch(tecla) {
            case KeyEvent.VK_ESCAPE:
                exit(0);
                break;
        }
    }
    
}
