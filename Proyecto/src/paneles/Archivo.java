package paneles;
import java.io.*;
import java.util.ArrayList;

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
    private ArrayList<String> comentarios;

    /**
     * Constructor utilizado para inicializar el usuario a escribir
     * @param user Parametro que recibe un usuario para escribirlo en archivo
     */
    public Archivo(Usuario user){
        this.user = user;
        this.nombreArchivoS = this.user.getNombre()+ ".dat";
    }

    /**
     * Constructor utilizado para inicializar la lista de comentarios a escribir
     * @param comentarios Texto a excribir en el archivo        
     * @param ruta Ubicación de escritura del archivo
     */
    public Archivo(ArrayList<String> comentarios, String ruta){
        this.comentarios = comentarios;
        this.nombreArchivoS = ruta+".dat";
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
     * Método que se encarga de escribir en un archivo un objeto usuario
     */
    public void escribeComentarios(){
        try {
            nuevousuario = new FileOutputStream(nombreArchivoS);
            fichero = new ObjectOutputStream(nuevousuario);
            fichero.writeObject(comentarios);
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
    
    /**
     * Método que se encarga de leer de un archivo un arraylist de comentarios
     * @return ArrayList de Strings
     */
    public ArrayList<String> leeComentarios() {
        try {
            usuario = new FileInputStream(nombreArchivoE);
            entrada = new ObjectInputStream(usuario);
            comentarios = (ArrayList<String>) entrada.readObject();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException | ClassNotFoundException e){
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
        return comentarios;
    }
    /**
     * Metodo utilizado para borrar el archivo actual
     * @return Valor de éxito en la operación
     */
    public boolean eliminaArchivo(){
        File f = new File(nombreArchivoE);
        return f.delete();
    }
    /**
     * Utilizado para comprobar la existencia de un archivo
     * @return Valor de éxito en la operación
     */
    public boolean existe(){
        File f = new File(nombreArchivoE);
        return f.exists();
    }
}
