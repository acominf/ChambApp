package paneles;

import elementos.Utilerias;
import static java.lang.System.exit;

/**
 * Clase que representa las funciones que el empleado puede hacer
 */
public class Empleado extends ContenidoPanel {
    private String nombre;
    /**
     * Constructor del Empleado
     * @param ventana
     */
    public Empleado(ContenidoJFrame ventana) {
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
        BuscaChamba = new javax.swing.JButton();
        BuscaSocio = new javax.swing.JButton();
        SubirProyecto = new javax.swing.JButton();
        CalificarEmpleador = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        CambiaPassword = new javax.swing.JButton();
        BuscarCursos = new javax.swing.JButton();
        CamposExtra = new javax.swing.JButton();
        BuscarProyecto = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Empleado");

        BuscaChamba.setText("Buscar Chamba");
        BuscaChamba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscaChambaMouseClicked(evt);
            }
        });

        BuscaSocio.setText("Buscar Socio");
        BuscaSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscaSocioMouseClicked(evt);
            }
        });

        SubirProyecto.setText("Subir proyecto");
        SubirProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubirProyectoMouseClicked(evt);
            }
        });

        CalificarEmpleador.setText("Calificar Empleador");
        CalificarEmpleador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalificarEmpleadorMouseClicked(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        CambiaPassword.setText("Cambiar contraseña");
        CambiaPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiaPasswordMouseClicked(evt);
            }
        });

        BuscarCursos.setText("Buscar cursos");
        BuscarCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarCursosMouseClicked(evt);
            }
        });

        CamposExtra.setText("Añadir campos extra");
        CamposExtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CamposExtraMouseClicked(evt);
            }
        });

        BuscarProyecto.setText("BuscarProyecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscaChamba)
                            .addComponent(CalificarEmpleador)
                            .addComponent(CambiaPassword)
                            .addComponent(BuscarCursos))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CamposExtra)
                            .addComponent(SubirProyecto)
                            .addComponent(BuscaSocio)
                            .addComponent(Salir)))
                    .addComponent(BuscarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscaChamba)
                    .addComponent(BuscaSocio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubirProyecto)
                    .addComponent(CalificarEmpleador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarCursos)
                    .addComponent(CamposExtra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuscarProyecto)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(CambiaPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscaChambaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscaChambaMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new BuscarChamba(this.getPadre()) );
    }//GEN-LAST:event_BuscaChambaMouseClicked

    private void BuscaSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscaSocioMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new BuscarSocio(this.getPadre()) );
    }//GEN-LAST:event_BuscaSocioMouseClicked

    private void CalificarEmpleadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalificarEmpleadorMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new CalificarEmpleador(this.getPadre()) );
    }//GEN-LAST:event_CalificarEmpleadorMouseClicked

    private void SubirProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubirProyectoMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new SubirProyecto(this.getPadre()) );
    }//GEN-LAST:event_SubirProyectoMouseClicked

    private void BuscarCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarCursosMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new CursosDisponibles(this.getPadre()) );
    }//GEN-LAST:event_BuscarCursosMouseClicked

    private void CamposExtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CamposExtraMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new EmpleadoAdicional(this.getPadre()) );
    }//GEN-LAST:event_CamposExtraMouseClicked

    private void CambiaPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiaPasswordMouseClicked
        Utilerias.muestraComponente( this.getPadre(), new CambioContrasena(this.getPadre()));
    }//GEN-LAST:event_CambiaPasswordMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscaChamba;
    private javax.swing.JButton BuscaSocio;
    private javax.swing.JButton BuscarCursos;
    private javax.swing.JButton BuscarProyecto;
    private javax.swing.JButton CalificarEmpleador;
    private javax.swing.JButton CambiaPassword;
    private javax.swing.JButton CamposExtra;
    private javax.swing.JButton Salir;
    private javax.swing.JButton SubirProyecto;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
