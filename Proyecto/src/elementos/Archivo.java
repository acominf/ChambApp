package elementos;
import java.io.*;

//TODO: Checar que la clase funcione correctamente
/**
 * Clase encargada de la escritura y lectura de archivos de la aplicacion.
 */
public class Archivo {
    private Usuario user;
    private String nombreArchivoS;
    private String nombreArchivoE;
    private FileOutputStream nuevousuario = null;
    private ObjectOutputStream fichero = null;
    private ObjectInputStream entrada = null;
    private FileInputStream usuario;

    /**
     * Constructor utilizado para inicializar el usuario a escribir
     * @param user Parametro que recibe un usuario para escribirlo en archivo
     */
    public Archivo(Usuario user){
        this.user = user;
        nombreArchivoS = this.user.getNombre()+ ".dat";
    }
    /**
     * Constructor utilizado para inicializar el nombre del archivo a leer
     * @param nombre Equivalente al nombre de usuario para la lectura de archivo
     */
    public Archivo(String nombre){
        nombreArchivoE = nombre + ".dat";
    }

    /**
     * Método que se encarga de escribir en un archivo un objeto usuario
     */
    public void escribeArchivo(){
        try {
            nuevousuario = new FileOutputStream(nombreArchivoS);
            fichero = new ObjectOutputStream(nuevousuario);
            fichero.writeObject(user);
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
                if(nuevousuario != null)
                    nuevousuario.close();
                if(fichero != null)
                    fichero.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    /**
     * Método que se encarga de leer de un archivo un objeto usuario
     * @return Usuario
     */
    public Usuario leeArchivo(){
        try {
            usuario = new FileInputStream(nombreArchivoE);
            entrada = new ObjectInputStream(usuario);
            user = (Usuario) entrada.readObject();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
                if(usuario != null)
                    usuario.close();
                if(fichero != null)
                    fichero.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        return user;
    }
}
