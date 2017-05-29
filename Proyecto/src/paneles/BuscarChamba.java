package paneles;
import elementos.Archivo;
import elementos.Usuario;
import elementos.Utilerias;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase que se encarga de buscar empleos que ofrezcan los empleadores
 */
public class BuscarChamba extends ContenidoPanel {

    /**
     * Constructor de la interfaz de usuario de BuscarChamba
     */
    public BuscarChamba(ContenidoJFrame ventana) {
        super(ventana);
        initComponents();
    }

    /**
     * Método que se encarga de validar el formulario
     */
    private void validarFormulario() {
        float minimo = (float)Minimo.getValue();
        float maximo = (float)Maximo.getValue();
        String campo = (String)CamposDeTrabajo.getSelectedItem();
        int experiencia = (int)Experiencia.getValue();
        boolean prestaciones = Prestaciones.isSelected();
        boolean tCompleto = TiempoCompleto.isSelected();
        if(minimo == 0 || maximo == 0){
            JOptionPane.showMessageDialog(null, "Introduzca Un Intervalo De Sueldo", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
            ArrayList<Usuario> usuarios = new ArrayList<>();
            File f = new File(System.getProperty("user.dir"));
            if(f.exists()){
                File[] ficheros = f.listFiles(); 
                for (File fichero : ficheros) {
                    String temp = fichero.getName();
                    if(temp.endsWith(".dat")){
                        String archivo = temp.substring(0, temp.length()-4);
                        Archivo empleador = new Archivo(archivo);
                        Usuario temporal = empleador.leeArchivo();
                        if(temporal.getSueldoMin() >= minimo && 
                        temporal.getSueldoMax() <= maximo &&
                        temporal.getCampo().equals(campo) &&
                        temporal.getExperiencia() >= experiencia &&
                        temporal.getPrestaciones() == prestaciones &&
                        temporal.gettCompleto() == tCompleto &&
                        temporal.getTipo().equals("Empleador"))
                            usuarios.add(temporal);
                    }
                }
            }
            if(usuarios.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay empleos con los paramétros especificados", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                String cadena = "Usuarios Que Cumplen Con El Perfil Solicitado: \n";
                for(Usuario user : usuarios)
                    cadena += Utilerias.convierteACadena(user);
                JOptionPane.showMessageDialog(null, cadena, "", JOptionPane.INFORMATION_MESSAGE);
                Utilerias.cambiaComponentePadre(this);
            }
        }
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
        CamposDeTrabajo = new javax.swing.JComboBox<>();
        CampoTrabajo = new javax.swing.JLabel();
        Rango = new javax.swing.JLabel();
        Instrucciones = new javax.swing.JLabel();
        Minimo = new javax.swing.JSpinner();
        TMinimo = new javax.swing.JLabel();
        TMaximo = new javax.swing.JLabel();
        Maximo = new javax.swing.JSpinner();
        Prestaciones = new javax.swing.JCheckBox();
        TPrestaciones = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        TTiempoCompleto = new javax.swing.JLabel();
        TiempoCompleto = new javax.swing.JCheckBox();
        ExperienciaTitulo = new javax.swing.JLabel();
        TExperiencia = new javax.swing.JLabel();
        Experiencia = new javax.swing.JSpinner();
        Regresar = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Buscador de Chamba");

        CamposDeTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnologías de la información",
            "Mercadotecnía",
            "Industria",
            "Administración de empresas" }));

CampoTrabajo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
CampoTrabajo.setText("Campo:");

Rango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
Rango.setText("Rango de saldo esperado:");

Instrucciones.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
Instrucciones.setText("Complete los siguientes campos para realizar su búsqueda");

Minimo.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

TMinimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
TMinimo.setText("Mínimo:");

TMaximo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
TMaximo.setText("Máximo:");

Maximo.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

Prestaciones.setText("Sí");

TPrestaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
TPrestaciones.setText("Necesita prestaciones");

Enviar.setText("Subir solicitud");
Enviar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        EnviarActionPerformed(evt);
    }
    });

    TTiempoCompleto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    TTiempoCompleto.setText("Disponible tiempo completo");

    TiempoCompleto.setText("Sí");

    ExperienciaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    ExperienciaTitulo.setText("Años de experiencia en el área especificada");

    TExperiencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    TExperiencia.setText("Años");

    Experiencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
    Experiencia.setToolTipText("");

    Regresar.setText("Regresar");
    Regresar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RegresarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Prestaciones)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(255, 255, 255))
                .addComponent(Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(CampoTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(415, 415, 415))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Rango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(281, 281, 281))
                .addComponent(CamposDeTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(Regresar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Enviar))
                .addComponent(TiempoCompleto)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(TTiempoCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(222, 222, 222))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ExperienciaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(171, 171, 171))
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(TExperiencia)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(TMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(6, 6, 6))
                        .addComponent(TPrestaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(310, 310, 310)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(Titulo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Instrucciones)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(CampoTrabajo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(CamposDeTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Rango)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TMinimo)
                .addComponent(Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TMaximo)
                .addComponent(Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TPrestaciones)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Prestaciones)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TTiempoCompleto)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TiempoCompleto)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ExperienciaTitulo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TExperiencia)
                .addComponent(Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Enviar)
                .addComponent(Regresar))
            .addContainerGap())
    );
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        validarFormulario();
    }//GEN-LAST:event_EnviarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Utilerias.cambiaComponentePadre(this);
    }//GEN-LAST:event_RegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CampoTrabajo;
    private javax.swing.JComboBox<String> CamposDeTrabajo;
    private javax.swing.JButton Enviar;
    private javax.swing.JSpinner Experiencia;
    private javax.swing.JLabel ExperienciaTitulo;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JSpinner Maximo;
    private javax.swing.JSpinner Minimo;
    private javax.swing.JCheckBox Prestaciones;
    private javax.swing.JLabel Rango;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel TExperiencia;
    private javax.swing.JLabel TMaximo;
    private javax.swing.JLabel TMinimo;
    private javax.swing.JLabel TPrestaciones;
    private javax.swing.JLabel TTiempoCompleto;
    private javax.swing.JCheckBox TiempoCompleto;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
