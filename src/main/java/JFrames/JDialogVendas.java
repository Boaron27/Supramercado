/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package JFrames;

<<<<<<< HEAD
import connection.VendasControl;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
=======
import java.awt.Color;
import javax.swing.BorderFactory;
>>>>>>> 62213652172e1655ce589b939b184d445d05b620
import javax.swing.border.Border;

/**
 *
 * @author vinio
 */
public class JDialogVendas extends javax.swing.JDialog {

    /**
     * Creates new form JDialogVendas
     */
    public JDialogVendas(java.awt.Frame parent, boolean modal) {
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
        jLabel7 = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jTFQuantidade = new javax.swing.JTextField();
        jTFDataVenda = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLblButtonProcurar = new javax.swing.JLabel();
        jLblButtonAtualizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFProduto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar venda");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Data da venda");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Quantidade");

        jTFID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFID.setPreferredSize(new java.awt.Dimension(150, 30));
        jTFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIDKeyTyped(evt);
            }
        });

        jTFQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFQuantidade.setEnabled(false);
        jTFQuantidade.setPreferredSize(new java.awt.Dimension(150, 30));
        jTFQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyTyped(evt);
            }
        });

        jTFDataVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFDataVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFDataVenda.setEnabled(false);
        jTFDataVenda.setPreferredSize(new java.awt.Dimension(150, 30));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Produto");

        jTFProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFProduto.setEnabled(false);
        jTFProduto.setPreferredSize(new java.awt.Dimension(150, 30));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTFProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLblButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jLblButtonProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDataVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))))
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
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTFProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTFDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIDKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFIDKeyTyped

    private void jTFQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFQuantidadeKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFQuantidadeKeyTyped

    private void jLblButtonProcurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonProcurarMouseClicked
        // TODO add your handling code here:
<<<<<<< HEAD

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/supramercado", "postgres", "210058");

            String sql = "SELECT data_venda,id_produto,qtd FROM vendas WHERE id = (?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            Integer id = Integer.parseInt(jTFID.getText());
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            ArrayList<Object> vendasDados = new ArrayList<>();
            while (rs.next()) {
                Date data_venda = rs.getDate("data_venda");
                Integer id_produto = rs.getInt("id_produto");
                Integer qtd = rs.getInt("qtd");

                vendasDados.add(data_venda);
                vendasDados.add(id_produto);
                vendasDados.add(qtd);


                jTFProduto.setText(String.valueOf(id_produto));
                jTFDataVenda.setText(String.valueOf(data_venda));
                jTFQuantidade.setText(String.valueOf(qtd));

            }

            jTFProduto.setEnabled(true);
            jTFDataVenda.setEnabled(true);
            jTFQuantidade.setEnabled(true);

            System.out.println("Teste de busca por id, executado com sucesso");

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

=======
        jTFProduto.setEnabled(true);
        jTFDataVenda.setEnabled(true);
        jTFQuantidade.setEnabled(true);
>>>>>>> 62213652172e1655ce589b939b184d445d05b620
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
<<<<<<< HEAD
        
        VendasControl vendas = new VendasControl();
        
        Date data_venda = Date.valueOf(jTFDataVenda.getText());
        Integer id_produto = Integer.parseInt(jTFProduto.getText());
        Integer qtd = Integer.parseInt(jTFQuantidade.getText());
        Integer id = Integer.parseInt(jTFID.getText());

        if (vendas.alterarVenda(data_venda, id_produto, qtd,id) == true) {
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor insira todos os campos", "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
        }
=======
>>>>>>> 62213652172e1655ce589b939b184d445d05b620
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
            java.util.logging.Logger.getLogger(JDialogVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogVendas dialog = new JDialogVendas(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField jTFDataVenda;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFProduto;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables
}
