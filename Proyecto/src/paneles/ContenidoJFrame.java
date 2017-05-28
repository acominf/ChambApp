package paneles;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author davidazullo
 */
public class ContenidoJFrame extends JFrame {
    private final String titulo;
    private final ImageIcon icono;
    
    public ContenidoJFrame(String titulo) {
        super(titulo);
        String rutaIcono = "src/Imagenes/Logo.png";
        icono = new ImageIcon(rutaIcono);
        setIconImage(icono.getImage());
        this.titulo = titulo;
    }        

    public String getTitulo() {
        return titulo;
    }
}
