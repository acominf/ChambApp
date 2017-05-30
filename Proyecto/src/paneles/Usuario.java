package paneles;
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
    /**
     * Modifica el área de especialidad del usuario
     * @param campo Valor que remplazará el campo.
     */
    public void setCampo(String campo){
        this.campo = campo;
    }
    /**
     * Método para modificar el sueldo mínimo del usuario
     * @param sueldo Valor que reemplaza el sueldo
     */
    public void setSueldoMin(float sueldo){
        sueldoMin = sueldo;
    }
    /**
     * Método que modifica el atributo proyecto 
     * @param proyecto Objeto Proyecto a sustituir
     */
    public void setProyecto(Proyecto proyecto){
        this.proyecto = proyecto;
    }
    /**
     * Método para modificar el sueldo máximo del usuario
     * @param sueldo Sueldo a sustituir
     */
    public void setSueldoMax(float sueldo){
        sueldoMax = sueldo;
    }
    /**
     * Método para modificar el atributo prestaciones
     */
    public void setPrestaciones(){
        prestaciones = true;
    }
    /**
     * Método para modificar el atributo tCompleto
     */
    public void setTCompleto(){
        tCompleto = true;
    }
    /**
     * Método para setear el atributo Experiencia
     * @param anios Entero que va a sustituir al atributo
     */
    public void setExperiencia(int anios){
        experiencia = anios;
    }
    /**
     * Método para setear los comentarios del empleo o del empleado
     * @param coment Valor que sustituye al atributo
     */
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
     * @param nombre Valor que va a sustituir al atributo
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
     * @param password Valor que va a sustituir al atributo
     */
    public void setPassword(char[] password) {
        this.password = password;
    }
    /**
     * Método de acceso variable campo
     * @return El campo de especialidad del usuario
     */
    public String getCampo(){
        return campo;
    }
    /**
     * Método de acceso variable sueldoMin  
     * @return El calor de la variable sueldoMin
     */
    public float getSueldoMin(){
        return sueldoMin;
    }
    /**
     * Método de acceso variable sueldoMax
     * @return el sueldo máximo del usuario
     */
    public float getSueldoMax(){
        return sueldoMax;
    }
    /**
     * Método de acceso variable prestaciones
     * @return booleano
     */
    public boolean getPrestaciones(){
        return prestaciones;
    }
    /**
     * Método de acceso variable tiempo completo
     * @return booleano
     */
    public boolean gettCompleto(){
        return tCompleto;
    }
    /**
     * Método de acceso variable experiencia
     * @return valor variable experiencia
     */
    public int getExperiencia(){
        return experiencia;
    }
    /**
     * Método de acceso variable comentarios
     * @return Valor atributo comentarios
     */
    public String getComentarios(){
        return comentarios;
    }
    /**
     * Método de acceso atributo proyecto
     * @return El objeto proyecto del usuario
     */
    public Proyecto getProyecto(){
        return proyecto;
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