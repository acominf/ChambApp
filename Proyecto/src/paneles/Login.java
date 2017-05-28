package paneles;
import elementos.Utilerias;

/**
 * Clase que se encarga de administrar el logueo de los usuarios
 */
public class Login extends ContenidoPanel {

    /**
     * Constructor de Login
     * @param ventana
     */
    public Login(ContenidoJFrame ventana) {
        super(ventana);
        initComponents();
        //TODO: Cambiar datos de acceso, poner ejemplo
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        TUsuario = new javax.swing.JLabel();
        TPassword = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        Cambio = new javax.swing.JButton();
        Resgitro = new javax.swing.JButton();
        TCambio = new javax.swing.JLabel();
        TRegistro = new javax.swing.JLabel();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Login");

        Usuario.setText("Braulio García");

        TUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TUsuario.setText("Usuario");

        TPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPassword.setText("Password");

        Entrar.setText("Entrar");
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });

        Cambio.setText("Solicitar cambio de contraseña");
        Cambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambioMouseClicked(evt);
            }
        });

        Resgitro.setText("Registrarse");
        Resgitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResgitroMouseClicked(evt);
            }
        });

        TCambio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TCambio.setText("¿Olvidaste tu contraseña?");

        TRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRegistro.setText("¿Aún no tienes cuenta?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cambio)
                    .addComponent(Resgitro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(TUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(TCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resgitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambioMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new CambioContrasena(this.getPadre()) );
    }//GEN-LAST:event_CambioMouseClicked

    private void ResgitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResgitroMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new RegistrarUsuario(this.getPadre()) );
    }//GEN-LAST:event_ResgitroMouseClicked

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        // TODO: Validar logueo de usuario
    }//GEN-LAST:event_EntrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambio;
    private javax.swing.JButton Entrar;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Resgitro;
    private javax.swing.JLabel TCambio;
    private javax.swing.JLabel TPassword;
    private javax.swing.JLabel TRegistro;
    private javax.swing.JLabel TUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Usuario;
    // End of variables declaration//GEN-END:variables
}