/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

/**
 *
 * @author valay
 */
public class VistaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form VistaAdministrador
     */
    public VistaAdministrador() {
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

        bto_cerrar = new javax.swing.JButton();
        jLabelBanner = new javax.swing.JLabel();
        bto_venta = new javax.swing.JButton();
        bto_cancelar = new javax.swing.JButton();
        bto_reportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bto_cerrar.setText("Cerrar Sesión");
        getContentPane().add(bto_cerrar);
        bto_cerrar.setBounds(820, 90, 111, 25);

        jLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/banner.jpg"))); // NOI18N
        jLabelBanner.setText("jLabel1");
        getContentPane().add(jLabelBanner);
        jLabelBanner.setBounds(0, 0, 980, 140);

        bto_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/compras.png"))); // NOI18N
        bto_venta.setText("Venta");
        bto_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(bto_venta);
        bto_venta.setBounds(380, 190, 200, 60);

        bto_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/eliminar.png"))); // NOI18N
        bto_cancelar.setText("Cancelar Venta");
        getContentPane().add(bto_cancelar);
        bto_cancelar.setBounds(380, 280, 200, 60);

        bto_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/nuevo.png"))); // NOI18N
        bto_reportes.setText("Reportes");
        getContentPane().add(bto_reportes);
        bto_reportes.setBounds(380, 370, 200, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bto_ventaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_cancelar;
    private javax.swing.JButton bto_cerrar;
    private javax.swing.JButton bto_reportes;
    private javax.swing.JButton bto_venta;
    private javax.swing.JLabel jLabelBanner;
    // End of variables declaration//GEN-END:variables
}
