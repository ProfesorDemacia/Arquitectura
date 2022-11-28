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
        VistaMenu pMenu = new VistaMenu();
        lbl_rut.setText(pMenu.rut_empleado);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bto_venta = new javax.swing.JButton();
        bto_cancelar = new javax.swing.JButton();
        bto_reporte = new javax.swing.JButton();
        lbl_rut = new javax.swing.JLabel();
        bto_cerrar = new javax.swing.JButton();
        jLabelBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Rut Administrador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, -1));

        bto_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/compras.png"))); // NOI18N
        bto_venta.setText("Venta");
        bto_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(bto_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 190, 60));

        bto_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/eliminar.png"))); // NOI18N
        bto_cancelar.setText("Cancelar Venta");
        bto_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 190, 60));

        bto_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/nuevo.png"))); // NOI18N
        bto_reporte.setText("Reportes");
        bto_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_reporteActionPerformed(evt);
            }
        });
        getContentPane().add(bto_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 190, 60));

        lbl_rut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lbl_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 30));

        bto_cerrar.setText("Cerrar Sesión");
        bto_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 120, -1));

        jLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/banner.jpg"))); // NOI18N
        getContentPane().add(jLabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_ventaActionPerformed
        // TODO add your handling code here:
        VistaDetalleVenta pMenu = new VistaDetalleVenta();
        pMenu.setVisible(true);
    }//GEN-LAST:event_bto_ventaActionPerformed

    private void bto_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_cancelarActionPerformed
        // TODO add your handling code here:
        VistaCancelarVenta pMenu = new VistaCancelarVenta();
        pMenu.setVisible(true);
    }//GEN-LAST:event_bto_cancelarActionPerformed

    private void bto_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_reporteActionPerformed
        // TODO add your handling code here:
        VistaRegistro pMenu = new VistaRegistro();
        pMenu.setVisible(true);
    }//GEN-LAST:event_bto_reporteActionPerformed

    private void bto_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_cerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.gc();
        VistaMenu pMenu = new VistaMenu();
        pMenu.setVisible(true);
        
    }//GEN-LAST:event_bto_cerrarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_cancelar;
    private javax.swing.JButton bto_cerrar;
    private javax.swing.JButton bto_reporte;
    private javax.swing.JButton bto_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBanner;
    private javax.swing.JLabel lbl_rut;
    // End of variables declaration//GEN-END:variables
}
