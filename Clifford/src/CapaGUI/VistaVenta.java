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
public class VistaVenta extends javax.swing.JFrame {

    /**
     * Creates new form VistaVenta
     */
    public VistaVenta() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_idProducto = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nombreProducto = new javax.swing.JTextField();
        txt_precioUnitario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_venta = new javax.swing.JTable();
        bto_agregar = new javax.swing.JButton();
        bto_continuar = new javax.swing.JButton();
        bto_salir = new javax.swing.JButton();
        bto_cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_precioFinal = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("ID Producto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 150, 66, 16);

        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 180, 50, 16);

        jLabel3.setText("Precio Unitario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 240, 83, 16);

        jLabel5.setText("Fecha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 270, 34, 16);

        txt_idProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_idProducto);
        txt_idProducto.setBounds(170, 150, 178, 22);

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cantidad);
        txt_cantidad.setBounds(170, 180, 178, 22);

        jLabel6.setText("Nombre Producto");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 210, 99, 16);

        txt_nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombreProducto);
        txt_nombreProducto.setBounds(170, 210, 178, 22);

        txt_precioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_precioUnitario);
        txt_precioUnitario.setBounds(170, 240, 178, 22);

        table_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID producto", "Nombre Producto", "Cantidad", "Precio Unitario ", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(table_venta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 150, 452, 110);

        bto_agregar.setText("Agregar");
        bto_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_agregar);
        bto_agregar.setBounds(100, 310, 79, 25);

        bto_continuar.setText("Continuar");
        getContentPane().add(bto_continuar);
        bto_continuar.setBounds(731, 468, 87, 25);

        bto_salir.setText("Salir");
        bto_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_salirActionPerformed(evt);
            }
        });
        getContentPane().add(bto_salir);
        bto_salir.setBounds(840, 470, 59, 25);

        bto_cancelar.setText("Cancelar");
        getContentPane().add(bto_cancelar);
        bto_cancelar.setBounds(250, 310, 83, 25);

        jLabel4.setText("Precio Final");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(463, 405, 66, 16);
        getContentPane().add(txt_precioFinal);
        txt_precioFinal.setBounds(570, 402, 100, 22);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/IconMini.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(0, -10, 110, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idProductoActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void txt_nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProductoActionPerformed

    private void txt_precioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioUnitarioActionPerformed

    private void bto_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bto_agregarActionPerformed

    private void bto_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bto_salirActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_agregar;
    private javax.swing.JButton bto_cancelar;
    private javax.swing.JButton bto_continuar;
    private javax.swing.JButton bto_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_venta;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_idProducto;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_precioFinal;
    private javax.swing.JTextField txt_precioUnitario;
    // End of variables declaration//GEN-END:variables
}
