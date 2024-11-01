/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package JFrames;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author vinio
 */
public class JDialogFornecedores extends javax.swing.JDialog {

    /**
     * Creates new form JDialogFornecedores
     */
    public JDialogFornecedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jTFStatus = new javax.swing.JTextField();
        jTFTelefone = new javax.swing.JTextField();
        jTFNomeFornecedor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLblButtonProcurar = new javax.swing.JLabel();
        jLblButtonAtualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Fornecedor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome do Fornecedor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Status");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Telefone");

        jTFID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFID.setPreferredSize(new java.awt.Dimension(150, 30));
        jTFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIDKeyTyped(evt);
            }
        });

        jTFStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFStatus.setEnabled(false);
        jTFStatus.setPreferredSize(new java.awt.Dimension(150, 30));

        jTFTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFTelefone.setEnabled(false);
        jTFTelefone.setPreferredSize(new java.awt.Dimension(150, 30));
        jTFTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTelefoneKeyTyped(evt);
            }
        });

        jTFNomeFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFNomeFornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFNomeFornecedor.setEnabled(false);
        jTFNomeFornecedor.setPreferredSize(new java.awt.Dimension(150, 30));

        jPanel2.setBackground(new java.awt.Color(38, 133, 196));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(38, 133, 196));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLblButtonProcurar.setBackground(new java.awt.Color(31, 43, 68));
        jLblButtonProcurar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonProcurar.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonProcurar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonProcurar.setText("Procurar");
        jLblButtonProcurar.setToolTipText("");
        jLblButtonProcurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 133, 196), 2));
        jLblButtonProcurar.setOpaque(true);
        jLblButtonProcurar.setPreferredSize(new java.awt.Dimension(200, 30));
        jLblButtonProcurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonProcurarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonProcurarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonProcurarMouseExited(evt);
            }
        });

        jLblButtonAtualizar.setBackground(new java.awt.Color(31, 43, 68));
        jLblButtonAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonAtualizar.setText("Atualizar");
        jLblButtonAtualizar.setToolTipText("");
        jLblButtonAtualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 133, 196), 2));
        jLblButtonAtualizar.setOpaque(true);
        jLblButtonAtualizar.setPreferredSize(new java.awt.Dimension(200, 30));
        jLblButtonAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonAtualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonAtualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(jLblButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLblButtonProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblButtonProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTFNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLblButtonProcurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonProcurarMouseClicked
        // TODO add your handling code here:
        jTFNomeFornecedor.setEnabled(true);
        jTFStatus.setEnabled(true);
        jTFTelefone.setEnabled(true);

    }//GEN-LAST:event_jLblButtonProcurarMouseClicked

    private void jLblButtonProcurarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonProcurarMouseEntered
        // TODO add your handling code here:
        jLblButtonProcurar.setBackground(new Color(38, 133, 196));
        Border border = BorderFactory.createLineBorder(new Color(31, 43, 68), 2);
        jLblButtonProcurar.setBorder(border);
    }//GEN-LAST:event_jLblButtonProcurarMouseEntered

    private void jLblButtonProcurarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonProcurarMouseExited
        // TODO add your handling code here:
        jLblButtonProcurar.setBackground(new Color(31, 43, 68));
        Border border = BorderFactory.createLineBorder(new Color(38, 133, 196), 2);
        jLblButtonProcurar.setBorder(border);
    }//GEN-LAST:event_jLblButtonProcurarMouseExited

    private void jLblButtonAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAtualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLblButtonAtualizarMouseClicked

    private void jLblButtonAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAtualizarMouseEntered
        // TODO add your handling code here:
        jLblButtonAtualizar.setBackground(new Color(38, 133, 196));
        Border border = BorderFactory.createLineBorder(new Color(31, 43, 68), 2);
        jLblButtonAtualizar.setBorder(border);
    }//GEN-LAST:event_jLblButtonAtualizarMouseEntered

    private void jLblButtonAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAtualizarMouseExited
        // TODO add your handling code here:
        jLblButtonAtualizar.setBackground(new Color(31, 43, 68));
        Border border = BorderFactory.createLineBorder(new Color(38, 133, 196), 2);
        jLblButtonAtualizar.setBorder(border);
    }//GEN-LAST:event_jLblButtonAtualizarMouseExited

    private void jTFIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIDKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFIDKeyTyped

    private void jTFTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTelefoneKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFTelefoneKeyTyped

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
            java.util.logging.Logger.getLogger(JDialogFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogFornecedores dialog = new JDialogFornecedores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLblButtonAtualizar;
    private javax.swing.JLabel jLblButtonProcurar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNomeFornecedor;
    private javax.swing.JTextField jTFStatus;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
