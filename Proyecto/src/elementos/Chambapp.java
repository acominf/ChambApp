package elementos;

import java.util.ArrayList;

/**
 * Clase que contiene toda la información necesaria para ejecutar el programa,
 * desde los usuarios, proyectos y demás.
 * @author davidazullo
 */
public class Chambapp {
    private final String tituloApp;
    private final String rutaIcono;
    private final String version = "0.5";

    public Chambapp(String titulo, String rutaIcono) {
        this.tituloApp = titulo;
        this.rutaIcono = rutaIcono;
    }

        
    //TODO: leer usuarios desde archivo
    ArrayList<Usuario> usuarios;
    
    public String getTitulo() {
        return tituloApp + " v" + version;
    }    

    public String getRutaIcono() {
        return rutaIcono;
    }
}
