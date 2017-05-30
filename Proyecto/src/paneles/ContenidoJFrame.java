package paneles;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Subclase de JFrame, proporciona más flexibilidad para manipular ventanas
 */
public class ContenidoJFrame extends JFrame {
    private final Chambapp chambapp;
    private final ImageIcon icono;
    
    /**
     * Constructor para inicializar al ContenidoJFrame
     * @param chambapp
     */
    public ContenidoJFrame(Chambapp chambapp) {
        super(chambapp.getTitulo());
        this.chambapp = chambapp;
        icono = new ImageIcon(chambapp.getRutaIcono());
        setIconImage(icono.getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    /**
     * Método que retorna el ChambApp actual    
     * @return Objeto ChambApp actual
     */
    public Chambapp getChambapp() {
        return chambapp;
    }
}
