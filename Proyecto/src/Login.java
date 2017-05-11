import javax.swing.*;
import java.awt.*;

/**
 * Created by berna on 10/05/2017.
 */
public class Login extends JPanel {
    public Login(){

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension tamano = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon fondo = new ImageIcon("src/Imagenes/Login.jpg");
        g.drawImage(fondo.getImage(), 0, 0, tamano.width, tamano.height, null);
    }
}
