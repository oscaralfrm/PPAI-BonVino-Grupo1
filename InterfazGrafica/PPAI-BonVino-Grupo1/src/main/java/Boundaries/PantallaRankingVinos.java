/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Boundaries;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class PantallaRankingVinos extends javax.swing.JFrame {

    /**
     * Creates new form PantallaRankingVinos
     */
    public PantallaRankingVinos() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        dateFechaDesde = new com.toedter.calendar.JDateChooser();
        lblFechaDesde = new javax.swing.JLabel();
        dateFechaHasta = new com.toedter.calendar.JDateChooser();
        lblFechaHasta = new javax.swing.JLabel();
        cmbTipoResenia = new javax.swing.JComboBox<>();
        cmbTipoVisualizacion = new javax.swing.JComboBox<>();
        lblResenia = new javax.swing.JLabel();
        lblTipoVisualizacion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(114, 47, 55));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wine-vector-2.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/utn-white-48px.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DSI - 3k2 - Grupo 1");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 0, 210, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-bonvino.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 36, 0));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen-Cancelar-48px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        btnConfirmar.setBackground(new java.awt.Color(0, 153, 0));
        btnConfirmar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen-Aceptar-48px.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));
        jPanel2.add(dateFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 250, -1));

        lblFechaDesde.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblFechaDesde.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaDesde.setText("Ingresar Fecha Desde:");
        jPanel2.add(lblFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jPanel2.add(dateFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 250, -1));

        lblFechaHasta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblFechaHasta.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaHasta.setText("Ingresar Fecha Hasta:");
        jPanel2.add(lblFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        cmbTipoResenia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cmbTipoResenia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normales", "Sommelier - Premium", "Amigos" }));
        cmbTipoResenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoReseniaActionPerformed(evt);
            }
        });
        jPanel2.add(cmbTipoResenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 170, -1));

        cmbTipoVisualizacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cmbTipoVisualizacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDF", "Excel", "Pantalla - Tabla" }));
        cmbTipoVisualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoVisualizacionActionPerformed(evt);
            }
        });
        jPanel2.add(cmbTipoVisualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 170, -1));

        lblResenia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblResenia.setForeground(new java.awt.Color(0, 0, 0));
        lblResenia.setText("Tipo de Reseña:");
        jPanel2.add(lblResenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        lblTipoVisualizacion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTipoVisualizacion.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoVisualizacion.setText("Tipo de Visualización:");
        jPanel2.add(lblTipoVisualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ranking de Vinos");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Generar Reportes de");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
        JOptionPane.showMessageDialog(null, "La generación del archivo ha sido cancelada.", 
                "Cancelado", JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        int tipoReseniaSeleccionada = cmbTipoResenia.getSelectedIndex();
        int tipoVisualizacionSeleccionada = cmbTipoVisualizacion.getSelectedIndex();
        
        if (tipoReseniaSeleccionada == 1 && tipoVisualizacionSeleccionada == 0) {
            
               JOptionPane.showMessageDialog(null, "¡Se ha generado de forma exitosa el Ranking en formato PDF!", 
                "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cmbTipoReseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoReseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoReseniaActionPerformed

    private void cmbTipoVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoVisualizacionActionPerformed

    }//GEN-LAST:event_cmbTipoVisualizacionActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaRankingVinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRankingVinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRankingVinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRankingVinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRankingVinos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cmbTipoResenia;
    private javax.swing.JComboBox<String> cmbTipoVisualizacion;
    private com.toedter.calendar.JDateChooser dateFechaDesde;
    private com.toedter.calendar.JDateChooser dateFechaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFechaDesde;
    private javax.swing.JLabel lblFechaHasta;
    private javax.swing.JLabel lblResenia;
    private javax.swing.JLabel lblTipoVisualizacion;
    // End of variables declaration//GEN-END:variables

    public void setIconImage(ImageIcon icono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
