package paneles;
import java.awt.*;

/**
 * Created by berna on 10/05/2017.
 */
public class Principal {
    public static void main(String []args){
        try{
            //Dimension tamano = new Dimension(600, 600);
            Dimension tamano = Toolkit.getDefaultToolkit().getScreenSize();
            //EmpleadoCV login = new EmpleadoCV();
            Menu menu = new Menu("ChambApp");
            menu.setVisible(true);
        }
        catch (Exception e){
            System.out.println("Ocurrió Un Error Al Obtener Los Datos De Tu Monitor");
        }

    }
}
