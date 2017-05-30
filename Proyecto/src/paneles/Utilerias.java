package paneles;

import paneles.ContenidoJFrame;
import paneles.ContenidoPanel;

/**
 * Clase encargada de manipulaciones entre JFrames y JPanels además de métodos adicionales
 */
public class Utilerias {

    /**
     * Metodo cuya funcion es asignar el JFrame actual al componente creado,
     * lo asigna a otro JFrame y lo hace visible, oculta el original
     * @param jframe 
     * @param componente 
     */
    public static void muestraComponente(ContenidoJFrame jframe, ContenidoPanel componente) {
        ContenidoJFrame f;
        f = new ContenidoJFrame(jframe.getChambapp());
        f.getContentPane().add(componente);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        jframe.setVisible(false);
    }
    
    /**
     * Metodo que se encarga de hacer visible al JFrame predecesor
     * @param actual
     */
    public static void cambiaComponentePadre(ContenidoPanel actual) {         
        actual.getVentana().setVisible(true);
        actual.getPadre().setVisible(false);
    }
    
    /**
     * Método que compara si son constraseñas son iguales
     * @param principal
     * @param secundario
     * @return 
     */
    public static boolean comparaPassword(char principal[], char secundario[]){
        if(principal.length == secundario.length){
            for(int i = 0; i < principal.length; i++){
                if(principal[i] != secundario[i])
                    return false;
            }
            return true;
        }
        return false;
    }
    public static String convierteACadena(Proyecto project){
       String cad = "Nombre: " + project.getNombre() + "\n";
       cad+="Descripcion: " + project.getDescripcion() + "\n";
       if(project.getEmpresa())
           cad += "Empresa Formal: Sí" + "\n";
       else
            cad += "Empresa Formal: Sí" + "\n";
       cad+="Monto: " + project.getMonto() + "\n";
       return cad;
    }
    public static String convierteACadena(Usuario user){
       String cad = "Nombre: " + user.getNombre() + "\n";
       cad += "Sueldo Minimo: " + user.getSueldoMin() + "\n";
       cad += "Sueldo Maximo: " +  user.getSueldoMax() + "\n";
       if(user.getPrestaciones())
           cad += "Prestaciones: Sí\n";
       else
           cad += "Prestaciones: No\n";
       if(user.gettCompleto())
           cad += "Tiempo Completo: Sí\n";
       else
           cad += "Tiempo Completo: No\n";
       cad += "Experiencia: " + user.getExperiencia() + "\n";
       cad += "Comentarios: " + user.getComentarios() + "\n";
       return cad;
    }
    
}
