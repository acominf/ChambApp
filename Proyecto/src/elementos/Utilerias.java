package elementos;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import paneles.ContenidoPanel;

/**
 *
 * @author davidazullo
 */
public class Utilerias {
    public static void muestraComponente(JFrame jframe, ContenidoPanel componente) {
        JFrame f  = new JFrame();
        f.getContentPane().add(componente);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        jframe.setVisible(false);
    }
    
    public static void cambiaComponentePadre(ContenidoPanel actual) {         
        JFrame padre;
        actual.getVentana().setVisible(true);
        padre = (JFrame) SwingUtilities.getWindowAncestor(actual);
        padre.setVisible(false);
    }
}
