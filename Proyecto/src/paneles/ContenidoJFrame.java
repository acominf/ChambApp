package paneles;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Superclase de JFrame, proporciona más flexibilidad para manipular ventanas
 */
public class ContenidoJFrame extends JFrame {
    private final String titulo;
    private final ImageIcon icono;
    
    /**
     * Constructor para inicializar al ContenidoJFrame
     * @param titulo
     */
    public ContenidoJFrame(String titulo) {
        super(titulo);
        String rutaIcono = "src/Imagenes/Logo.png";
        icono = new ImageIcon(rutaIcono);
        setIconImage(icono.getImage());
        this.titulo = titulo;
    }        

    /**
     * Método de acceso que retorna el titulo de la app
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }
}
