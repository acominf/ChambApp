package paneles;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.System.exit;
import javax.swing.JFrame;

/**
 *
 * @author davidazullo
 */
public class ContenidoJFrame extends JFrame {
    private final String titulo;
    
    public ContenidoJFrame(String titulo) {
        super(titulo);
        this.titulo = titulo;
    }        

    public String getTitulo() {
        return titulo;
    }
}
