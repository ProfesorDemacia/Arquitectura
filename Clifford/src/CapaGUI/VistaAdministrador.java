/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

/**
 *
 * @author Cesar
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

        bto_venta = new javax.swing.JButton();
        bto_cancelar = new javax.swing.JButton();
        bto_registro = new javax.swing.JButton();
        bto_cerrarSesion = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bto_venta.setText("Venta");
        getContentPane().add(bto_venta);
        bto_venta.setBounds(44, 129, 65, 25);

        bto_cancelar.setText("Cancelar Venta");
        getContentPane().add(bto_cancelar);
        bto_cancelar.setBounds(317, 129, 119, 25);

        bto_registro.setText("Registro de Ventas");
        getContentPane().add(bto_registro);
        bto_registro.setBounds(146, 129, 141, 25);

        bto_cerrarSesion.setText("Cerrar Sesion");
        getContentPane().add(bto_cerrarSesion);
        bto_cerrarSesion.setBounds(314, 13, 111, 25);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/IconMini.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(0, 0, 90, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton bto_cerrarSesion;
    private javax.swing.JButton bto_registro;
    private javax.swing.JButton bto_venta;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
}
