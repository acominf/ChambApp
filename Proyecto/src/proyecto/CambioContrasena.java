package proyecto;

import javax.swing.JFrame;

/**
 *
 * @author davidazullo
 */
public class CambioContrasena extends ContenidoPanel {

    /**
     * Creates new form CambioContrasena
     */
    public CambioContrasena(JFrame ventana) {
        super(ventana);
        initComponents();
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
        TPregunta = new javax.swing.JLabel();
        Pregunta = new javax.swing.JComboBox<>();
        TNueva = new javax.swing.JLabel();
        Respuesta = new javax.swing.JPasswordField();
        TRespuesta = new javax.swing.JLabel();
        Nueva = new javax.swing.JPasswordField();
        Enviar = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Restableciendo contraseña");

        TPregunta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPregunta.setText("Pregunta de seguridad");

        Pregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿En qué escuela estudiaste?" }));
        Pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreguntaActionPerformed(evt);
            }
        });

        TNueva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TNueva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TNueva.setText("Nueva contraseña");

        Respuesta.setText("12345");

        TRespuesta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRespuesta.setText("Respuesta");

        Nueva.setText("12345");

        Enviar.setText("Aceptar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TNueva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Respuesta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nueva, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TRespuesta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Respuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(Nueva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreguntaActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JPasswordField Nueva;
    private javax.swing.JComboBox<String> Pregunta;
    private javax.swing.JPasswordField Respuesta;
    private javax.swing.JLabel TNueva;
    private javax.swing.JLabel TPregunta;
    private javax.swing.JLabel TRespuesta;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
