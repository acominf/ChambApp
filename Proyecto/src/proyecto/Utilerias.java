package proyecto;

import java.awt.Component;
import javax.swing.JFrame;

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
        componente.setVentana(f);
    }
}
