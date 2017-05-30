package paneles;
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
    private final String version = "1.0";
    private Usuario usuarioActual;
    private ArrayList<String> comentarios;
    /**
     * Contrucctor del objeto ChambApp
     * @param titulo
     * @param rutaIcono 
     */
    public Chambapp(String titulo, String rutaIcono) {
        this.tituloApp = titulo;
        this.rutaIcono = rutaIcono;
        this.rutaComentarios = "Comentarios";
    }
    /**
     * Método de acceso al título de la aplicación
     * @return Título de la aplicación
     */
    public String getTitulo() {
        return tituloApp + " v" + version;
    }    
    /**
     * Método de acceso al ícono de la aplicación
     * @return Ruta ícono aplicación
     */
    public String getRutaIcono() {
        return rutaIcono;
    }
    /**
     * Método de acceso a la ruta del archivo comentarios
     * @return Comentarios realizados por el usuaario
     */
    public String getRutaComentarios() {
        return rutaComentarios;
    }
    /**
     * Devuelve el usuario que usa la aplicación    
     * @return Usuario actual
     */
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
    /**
     * Método de modificación atributo usuarioActual
     * @param usuarioActual 
     */
    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    /**
     * Método de acceso atributo comentarios
     * @return Los comentarios realizados por el usuario
     */
    public ArrayList<String> getComentarios() {
        return comentarios;
    }
    /**
     * Método de modificación atributo comentarios
     * @param comentarios 
     */
    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }
    /**
     * Método que agrega un nuevo comentario
     * @param comentario 
     */
    public void addComentario(String comentario) {
        comentarios.add(comentario);
    }
}
