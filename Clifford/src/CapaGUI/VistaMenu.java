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
public class VistaMenu extends javax.swing.JFrame {

    
    
    public void validarTrabajador (String rut){
        

    }
    
    
    /**
     * Creates new form VistaMenu
     */
    public VistaMenu() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bto_ingresar = new javax.swing.JButton();
        bto_salir = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("¡Bienvenido!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 120, 74, 17);

        txt_rut.setToolTipText("");
        getContentPane().add(txt_rut);
        txt_rut.setBounds(420, 190, 107, 20);

        jLabel3.setText("Rut");
        jLabel3.setMaximumSize(new java.awt.Dimension(34, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(34, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(34, 14));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 190, 34, 14);

        bto_ingresar.setText("Ingresar");
        bto_ingresar.setMaximumSize(new java.awt.Dimension(80, 23));
        bto_ingresar.setPreferredSize(new java.awt.Dimension(100, 23));
        bto_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_ingresar);
        bto_ingresar.setBounds(360, 230, 100, 23);

        bto_salir.setText("Salir");
        bto_salir.setPreferredSize(new java.awt.Dimension(70, 23));
        bto_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_salirActionPerformed(evt);
            }
        });
        getContentPane().add(bto_salir);
        bto_salir.setBounds(470, 230, 70, 23);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/IconPeque.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(10, 130, 150, 128);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Fondopeque.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, -20, 680, 470);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 300, 34, 14);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 440, 73, 23);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_ingresarActionPerformed
        // TODO add your handling code here:
        
        
        VistaTrabajador pMenu = new VistaTrabajador();
        pMenu.setVisible(true);
        
    }//GEN-LAST:event_bto_ingresarActionPerformed

    private void bto_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.gc();
    }//GEN-LAST:event_bto_salirActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_ingresar;
    private javax.swing.JButton bto_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
}
