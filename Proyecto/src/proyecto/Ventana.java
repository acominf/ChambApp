package proyecto;

import javax.swing.*;
import java.awt.*;
/**
 * Esta Clase Crea Un Lienzo Para Una GUI.
 * @author José Bernardo Bernal Cabrera
 */
public class Ventana extends JFrame{
    private ImageIcon icono;
    private Dimension tamano;
    /**
     * Constructor de la clase Lienzo
     * @param titulo Define el nombre de la ventana
     * @param tamano Define el tamaño de la pantalla de salida actual
     */
    public Ventana(String titulo, Dimension tamano){
        super(titulo);
        this.tamano = tamano;
        inicializaVentana();
    }

    /**
     * Método encargado de inicializar los atributos de la pantalla
     */
    private void inicializaVentana() {
        icono = new ImageIcon("src/Imagenes/Logo.png");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int) tamano.getWidth(), (int) tamano.getHeight());
        setIconImage(icono.getImage());
    }
}
