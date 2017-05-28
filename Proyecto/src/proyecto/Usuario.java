package proyecto;

/**
*Clase encargada de la creacion de un nuevo usuario
*@author José Bernardo Bernal Cabrera
*/
import java.io.Serializable;
public class Usuario implements Serializable{
	private String nombre;
	private String pregunta;
	private String respuesta;
    private String password;
	public Usuario(String nombre,String password, String pregunta, String respuesta){
		this.nombre = nombre;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.password = password;
	} 
	/**
	*Método encargado de la modificacion de datos del usuario
	*/
	public void modificarDatos(){
		
	}

    /**
     * Metodo de acceso al atributo nombre de un usuario
     * @return nombre del usuario
     */
	public String devuelveNombre(){
		return nombre;
	}
    /**
     * Metodo de acceso al atributo pregunta de un usuario
     * @return pregunta de seguridad del usuario
     */
    public String devuelvePregunta(){
        return pregunta;
    }
    /**
     * Metodo de acceso al atributo respuesta de un usuario
     * @return respuesta a la pregunta de seguridad del usuario
     */
    public String devuelveRespuesta(){
        return respuesta;
    }
    /**
     * Metodo de acceso al atributo contraseña de un usuario
     * @return contraseña del usuario
     */
    public String devuelvePassword(){
        return password;
    }
}