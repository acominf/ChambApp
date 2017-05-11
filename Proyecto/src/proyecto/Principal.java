package proyecto;

import java.awt.*;

/**
 * Created by berna on 10/05/2017.
 */
public class Principal {
    public static void main(String []args){
        try{
            /*Dimension tamano = Toolkit.getDefaultToolkit().getScreenSize();
            Ventana ventana = new Ventana("ChambApp", tamano);
            ventana.setVisible(true);*/
            new Login().setVisible(true);
        }
        catch (Exception e){
            System.out.println("Ocurrió Un Error Al Obtener Los Datos De Tu Monitor");
        }

    }
}
