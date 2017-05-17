package proyecto;
import java.awt.*;

/**
 * Created by berna on 10/05/2017.
 */
public class Principal {
    public static void main(String []args){
        try{
            //Dimension tamano = new Dimension(600, 600);
            Dimension tamano = Toolkit.getDefaultToolkit().getScreenSize();
            Login login = new Login();
            Ventana ventana = new Ventana("ChambApp", tamano);
            ventana.add(login);
            ventana.setVisible(true);
        }
        catch (Exception e){
            System.out.println("Ocurrió Un Error Al Obtener Los Datos De Tu Monitor");
        }

    }
}
