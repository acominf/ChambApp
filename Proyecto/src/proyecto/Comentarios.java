/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author davidazullo
 */
public class Comentarios extends javax.swing.JPanel {

    /**
     * Creates new form Comentarios
     */
    public Comentarios() {
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
        Instrucciones = new javax.swing.JLabel();
        Instrucciones2 = new javax.swing.JLabel();
        Comentarios = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Comentarios y feedback");

        Instrucciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Inserte sus comentarios acerca de nuestra aplicación y diganos");

        Instrucciones2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Instrucciones2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones2.setText("en que le gustaría que mejoraramos");

        Enviar.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Comentarios)
                        .addComponent(Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Instrucciones2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Enviar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instrucciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Enviar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Comentarios;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JLabel Instrucciones2;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
