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
    private final String rutaComentarios;
    private final String version = "0.5";
    private Usuario usuarioActual;
    private ArrayList<String> comentarios;
    
    public Chambapp(String titulo, String rutaIcono) {
        this.tituloApp = titulo;
        this.rutaIcono = rutaIcono;
        this.rutaComentarios = "Comentarios";
    }
    
    public String getTitulo() {
        return tituloApp + " v" + version;
    }    

    public String getRutaIcono() {
        return rutaIcono;
    }

    public String getRutaComentarios() {
        return tituloApp+"/"+rutaComentarios;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public void addComentario(String comentario) {
        comentarios.add(comentario);
    }
}
