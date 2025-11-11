import java.util.ArrayList;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

    private ArrayList<Estudiante> ListaEstudiante;
public class frmCliente extends javax.swing.JFrame {



    public frmCliente() {
        initComponents();
        
    }
ArrayList<Estudiante> ListaEstudiante = new ArrayList<>();

 @SuppressWarnings("unchecked")
    private void initComponents() {
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextcarnet = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Carnet:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Harlow Solid Italic", 2, 48)); // NOI18N
        jLabel5.setText("Registro de:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Nuevo Estudiante");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 330, 60));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 210));

        jPanel2.setBackground(new java.awt.Color(255, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Teléfono:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        try {
            jTextTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 350, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Carnet:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jTextNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombresKeyTyped(evt);
            }
        });
        jPanel2.add(jTextNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 360, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombres:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        try {
            jTextcarnet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-#####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTextcarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 360, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 680, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    String carnet = jTextcarnet.getText().trim();
    String Nombres = jTextNombres.getText().trim();
String Telefono = jTextTelefono.getText().trim();


    if (carnet.isEmpty() || Nombres.isEmpty() || Telefono.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Complete todos los campos");
        return;
    }

    // Guardar como arreglo de Strings: {carnet, nombres, telefono}
    Estudiante e = new Estudiante(carnet, Nombres, Telefono);
    ListaEstudiante.add(e);

    JOptionPane.showMessageDialog(null, "Alumno agregado correctamente");

    // Limpiar campos
    jTextcarnet.setText("");
    jTextNombres.setText("");
    jTextTelefono.setText("");
}

        private static class Estudiante {

            public Estudiante() {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombresKeyTyped
char car = evt.getKeyChar();
if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
    && car != 'á' // Minúsculas acentuadas
    && car != 'é'
    && car != 'í'
    && car != 'ó'
    && car != 'ú'
    && car != 'ü'
    && car != 'Á' // Mayúsculas acentuadas
    && car != 'É'
    && car != 'Í'
    && car != 'Ó'
    && car != 'Ú'
    && car != 'Ü'
    && car != 'ñ'  // Letra ñ minúscula
    && car != 'Ñ'  // Letra ñ mayúscula
    && car != (char) KeyEvent.VK_SPACE) {
    evt.consume();        
    }//GEN-LAST:event_jTextNombresKeyTyped
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
StringBuilder sb = new StringBuilder("Lista de estudiantes:\n");
        for (Estudiante e : ListaEstudiante) {
            sb.append(e.toString()).append("\n");

}
JOptionPane.showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
 }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
}
        
         java.awt.EventQueue.invokeLater(() -> {
            new frmCliente().setVisible(true);
        }); 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextNombres;
    private javax.swing.JFormattedTextField jTextTelefono;
    private javax.swing.JFormattedTextField jTextcarnet;
    // End of variables declaration//GEN-END:variables
}
