import javax.swing.*;
import java.awt.*;
/**
 * Esta Clase Crea Un Lienzo Para Una GUI.
 * @author José Bernardo Bernal Cabrera
 */
public class Lienzo extends JFrame{
    String titulo;
    private ImageIcon icono;
    Dimension tamano;
    /**
     * Constructor de la clase Lienzo
     * @param titulo Define el nombre de la ventana
     * @param tamano Define el tamaño de la pantalla de salida actual
     */
    public Lienzo(String titulo, Dimension tamano){
        super(titulo);
        this.tamano = tamano;
        inicializaVentana();
    }

    /**
     * Método encargado de inicializar los atributos de la pantalla
     */
    private void inicializaVentana(){
        icono = new ImageIcon("src/Imagenes/Logo.png");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int)tamano.getWidth(), (int)tamano.getHeight());
        setIconImage(icono.getImage());
    }

}
