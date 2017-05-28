package elementos;
import java.io.Serializable;

/**
 * Clase encargada de la creacion de un nuevo usuario
 */
public class Usuario implements Serializable{

    private String nombre;
    private String pregunta;
    private String respuesta;
    private char []password; 

    /**
     * Metodo de acceso al atributo nombre de un usuario
     * @return Nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo de modificacion al atributo nombre de un usuario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo de acceso al atributo pregunta de un usuario
     * @return Pregunta de seguridad del usuario
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Metodo de modificacion al atributo pregunta de un usuario
     * @param pregunta
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Metodo de acceso al atributo respuesta de un usuario
     * @return Respuesta a la pregunta de seguridad del usuario
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Metodo de modificacion al atributo respuesta de un usuario
     * @param respuesta
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Metodo de acceso al atributo contraseña de un usuario
     * @return Contraseña del usuario
     */
    public char[] getPassword() {
        return password;
    }

    /**
     * Metodo de modificacion al atributo contraseña de un usuario
     * @param password
     */
    public void setPassword(char[] password) {
        this.password = password;
    }
    
    /**
     * Constructor de la clase usuario
     * @param nombre
     * @param password
     * @param pregunta
     * @param respuesta
     */
    public Usuario(String nombre, char[] password, String pregunta, String respuesta){
            this.nombre = nombre;
            this.pregunta = pregunta;
            this.respuesta = respuesta;
            this.password = password;
    }
}