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
    private String campo;
    private float sueldoMin;
    private float sueldoMax;
    private boolean prestaciones;
    private boolean tCompleto;
    private int experiencia;
    private String comentarios;
    private final String tipo;
    private Proyecto proyecto;
    public void setCampo(String campo){
        this.campo = campo;
    }
    public void setSueldoMin(float sueldo){
        sueldoMin = sueldo;
    }
    public void setProyecto(Proyecto proyecto){
        this.proyecto = proyecto;
    }
    public void setSueldoMax(float sueldo){
        sueldoMax = sueldo;
    }
    public void setPrestaciones(){
        prestaciones = true;
    }
    public void setTCompleto(){
        tCompleto = true;
    }
    public void setExperiencia(int anios){
        experiencia = anios;
    }
    public void setComentarios(String coment){
        comentarios = coment;
    }
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
    public String getTipo(){
        return tipo;
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
    public char[] getPassword(){
        return password;
    }

    /**
     * Metodo de modificacion al atributo contraseña de un usuario
     * @param password
     */
    public void setPassword(char[] password) {
        this.password = password;
    }
    public String getCampo(){
        return campo;
    }
    public float getSueldoMin(){
        return sueldoMin;
    }
    public float getSueldoMax(){
        return sueldoMax;
    }
    public boolean getPrestaciones(){
        return prestaciones;
    }
    public boolean gettCompleto(){
        return tCompleto;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public String getComentarios(){
        return comentarios;
    }
    
    /**
     * Constructor de la clase usuario
     * @param nombre
     * @param password
     * @param pregunta
     * @param respuesta
     * @param tipo
     */
    public Usuario(String nombre, char[] password, String pregunta, String respuesta, String tipo){
            this.proyecto = new Proyecto();
            this.prestaciones = false;
            this.tCompleto = false;
            this.experiencia = 0;
            this.comentarios = "";
            this.sueldoMax = 0;
            this.sueldoMin = 0;
            this.nombre = nombre;
            this.pregunta = pregunta;
            this.respuesta = respuesta;
            this.password = password;
            this.tipo = tipo;
    }
}