/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mercadoweb;

import connection.FuncionariosControl;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author vinio
 */
public class Funcionarios extends javax.swing.JFrame {

    FuncionariosControl funcionarios = new FuncionariosControl();

    public Funcionarios() {
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

        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jLblButtonMenu = new javax.swing.JLabel();
        jLblButtonEstoque = new javax.swing.JLabel();
        jLblButtonFornecedores = new javax.swing.JLabel();
        jLblButtonFuncionarios = new javax.swing.JLabel();
        jLblButtonVendas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLblButtonAdicionar = new javax.swing.JLabel();
        JLblButtonRemover = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTFNomeFuncionario = new javax.swing.JTextField();
        jTFCPF = new javax.swing.JTextField();
        jTFCargo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTFuncionarios = new javax.swing.JTable();

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionários");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanelMenu.setPreferredSize(new java.awt.Dimension(1000, 60));
        jPanelMenu.setLayout(new java.awt.GridLayout(1, 0));

        jLblButtonMenu.setBackground(new java.awt.Color(38, 133, 196));
        jLblButtonMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonMenu.setText("Menu");
        jLblButtonMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 43, 68), 2));
        jLblButtonMenu.setOpaque(true);
        jLblButtonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonMenuMouseExited(evt);
            }
        });
        jPanelMenu.add(jLblButtonMenu);

        jLblButtonEstoque.setBackground(new java.awt.Color(38, 133, 196));
        jLblButtonEstoque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonEstoque.setText("Estoque");
        jLblButtonEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 43, 68), 2));
        jLblButtonEstoque.setOpaque(true);
        jLblButtonEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonEstoqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonEstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonEstoqueMouseExited(evt);
            }
        });
        jPanelMenu.add(jLblButtonEstoque);

        jLblButtonFornecedores.setBackground(new java.awt.Color(38, 133, 196));
        jLblButtonFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonFornecedores.setText("Fornecedores");
        jLblButtonFornecedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 43, 68), 2));
        jLblButtonFornecedores.setOpaque(true);
        jLblButtonFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonFornecedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonFornecedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonFornecedoresMouseExited(evt);
            }
        });
        jPanelMenu.add(jLblButtonFornecedores);

        jLblButtonFuncionarios.setBackground(new java.awt.Color(38, 133, 196));
        jLblButtonFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonFuncionarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonFuncionarios.setText("Funcionários");
        jLblButtonFuncionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 43, 68), 2));
        jLblButtonFuncionarios.setOpaque(true);
        jLblButtonFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonFuncionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonFuncionariosMouseExited(evt);
            }
        });
        jPanelMenu.add(jLblButtonFuncionarios);

        jLblButtonVendas.setBackground(new java.awt.Color(38, 133, 196));
        jLblButtonVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonVendas.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonVendas.setText("Vendas");
        jLblButtonVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 43, 68), 2));
        jLblButtonVendas.setOpaque(true);
        jLblButtonVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonVendasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonVendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonVendasMouseExited(evt);
            }
        });
        jPanelMenu.add(jLblButtonVendas);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tabela de funcionarios.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLblButtonAdicionar.setBackground(new java.awt.Color(31, 43, 68));
        jLblButtonAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonAdicionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonAdicionar.setText("Adicionar ");
        jLblButtonAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 133, 196), 2));
        jLblButtonAdicionar.setOpaque(true);
        jLblButtonAdicionar.setPreferredSize(new java.awt.Dimension(250, 30));
        jLblButtonAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonAdicionarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonAdicionarMouseExited(evt);
            }
        });

        JLblButtonRemover.setBackground(new java.awt.Color(31, 43, 68));
        JLblButtonRemover.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLblButtonRemover.setForeground(new java.awt.Color(255, 255, 255));
        JLblButtonRemover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLblButtonRemover.setText("Remover ");
        JLblButtonRemover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 133, 196), 2));
        JLblButtonRemover.setOpaque(true);
        JLblButtonRemover.setPreferredSize(new java.awt.Dimension(250, 30));
        JLblButtonRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLblButtonRemoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLblButtonRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLblButtonRemoverMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Nome do Funcionário");

        jTFNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFNomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFNomeFuncionario.setPreferredSize(new java.awt.Dimension(150, 30));

        jTFCPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFCPF.setPreferredSize(new java.awt.Dimension(150, 30));

        jTFCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFCargo.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("CPF");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Cargo");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Usuário");

        jTFSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFSenha.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Senha");

        jTFUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFUsuario.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jTFNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLblButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(JLblButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLblButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jTFuncionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Usuário", "Senha", "Cargo"
            }
        ));
        jTFuncionarios.setGridColor(new java.awt.Color(0, 0, 0));
        jTFuncionarios.setPreferredSize(new java.awt.Dimension(452, 402));
        jScrollPane2.setViewportView(jTFuncionarios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jLblButtonMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonMenuMouseEntered
        // TODO add your handling code here:
        jLblButtonMenu.setBackground(new Color(51, 0, 204));
    }//GEN-LAST:event_jLblButtonMenuMouseEntered

    private void jLblButtonMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonMenuMouseExited
        // TODO add your handling code here:
        jLblButtonMenu.setBackground(new Color(38, 133, 196));
    }//GEN-LAST:event_jLblButtonMenuMouseExited

    private void jLblButtonEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonEstoqueMouseEntered
        // TODO add your handling code here:
        jLblButtonEstoque.setBackground(new Color(51, 0, 204));
    }//GEN-LAST:event_jLblButtonEstoqueMouseEntered

    private void jLblButtonEstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonEstoqueMouseExited
        // TODO add your handling code here:
        jLblButtonEstoque.setBackground(new Color(38, 133, 196));
    }//GEN-LAST:event_jLblButtonEstoqueMouseExited

    private void jLblButtonFornecedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonFornecedoresMouseEntered
        // TODO add your handling code here:
        jLblButtonFornecedores.setBackground(new Color(51, 0, 204));
    }//GEN-LAST:event_jLblButtonFornecedoresMouseEntered

    private void jLblButtonFornecedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonFornecedoresMouseExited
        // TODO add your handling code here:
        jLblButtonFornecedores.setBackground(new Color(38, 133, 196));
    }//GEN-LAST:event_jLblButtonFornecedoresMouseExited

    private void jLblButtonFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonFuncionariosMouseEntered
        // TODO add your handling code here:
        jLblButtonFuncionarios.setBackground(new Color(51, 0, 204));
    }//GEN-LAST:event_jLblButtonFuncionariosMouseEntered

    private void jLblButtonFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonFuncionariosMouseExited
        // TODO add your handling code here:
        jLblButtonFuncionarios.setBackground(new Color(38, 133, 196));
    }//GEN-LAST:event_jLblButtonFuncionariosMouseExited

    private void jLblButtonVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonVendasMouseEntered
        // TODO add your handling code here:
        jLblButtonVendas.setBackground(new Color(51, 0, 204));
    }//GEN-LAST:event_jLblButtonVendasMouseEntered

    private void jLblButtonVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonVendasMouseExited
        // TODO add your handling code here:
        jLblButtonVendas.setBackground(new Color(38, 133, 196));
    }//GEN-LAST:event_jLblButtonVendasMouseExited

    private void jLblButtonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonMenuMouseClicked
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLblButtonMenuMouseClicked

    private void jLblButtonEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonEstoqueMouseClicked
        // TODO add your handling code here:
        Estoque estoque = new Estoque();
        estoque.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLblButtonEstoqueMouseClicked

    private void jLblButtonFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonFornecedoresMouseClicked
        // TODO add your handling code here:
        Fornecedores fornecedores = new Fornecedores();
        fornecedores.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLblButtonFornecedoresMouseClicked

    private void jLblButtonVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonVendasMouseClicked
        // TODO add your handling code here:
        Vendas vendas = new Vendas();
        vendas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLblButtonVendasMouseClicked

    private void jLblButtonAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAdicionarMouseEntered
        // TODO add your handling code here:
        jLblButtonAdicionar.setBackground(new Color(38, 133, 196));
        Border border = BorderFactory.createLineBorder(new Color(31, 43, 68), 2);
        jLblButtonAdicionar.setBorder(border);
    }//GEN-LAST:event_jLblButtonAdicionarMouseEntered

    private void jLblButtonAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAdicionarMouseExited
        // TODO add your handling code here:
        jLblButtonAdicionar.setBackground(new Color(31, 43, 68));
        Border border = BorderFactory.createLineBorder(new Color(38, 133, 196), 2);
        jLblButtonAdicionar.setBorder(border);
    }//GEN-LAST:event_jLblButtonAdicionarMouseExited

    private void JLblButtonRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLblButtonRemoverMouseEntered
        // TODO add your handling code here:
        JLblButtonRemover.setBackground(new Color(38, 133, 196));
        Border border = BorderFactory.createLineBorder(new Color(31, 43, 68), 2);
        JLblButtonRemover.setBorder(border);
    }//GEN-LAST:event_JLblButtonRemoverMouseEntered

    private void JLblButtonRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLblButtonRemoverMouseExited
        // TODO add your handling code here:
        JLblButtonRemover.setBackground(new Color(31, 43, 68));
        Border border = BorderFactory.createLineBorder(new Color(38, 133, 196), 2);
        JLblButtonRemover.setBorder(border);
    }//GEN-LAST:event_JLblButtonRemoverMouseExited

    private void jLblButtonAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAdicionarMouseClicked

        String nome = jTFNomeFuncionario.getText();
        String cpf = jTFCPF.getText();
        String usuario = jTFUsuario.getText();
        String senha = jTFSenha.getText();
        String cargo = jTFCargo.getText();

        if (funcionarios.inserirFuncionario(nome, cpf, usuario, senha, cargo) == true) {
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Adicione todas informações sobre um novo funcionario", "Erro",
                    JOptionPane.WARNING_MESSAGE);
        }
        

    }//GEN-LAST:event_jLblButtonAdicionarMouseClicked

    private void JLblButtonRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLblButtonRemoverMouseClicked
        String nome = jTFNomeFuncionario.getText();
        String cargo = jTFCargo.getText();
        String usuario = jTFUsuario.getText();

        if (usuario == null && cargo == null) {
            if (funcionarios.removerFornecedorPorNome(nome) == true) {
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar um funcionario com este nome, por favor verifique!", "Erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }else if(nome == null && usuario == null){
            if (funcionarios.removerFornecedorPorCargo(cargo) == true) {
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar um funcionario com este cargo, por favor verifique!", "Erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }else if(nome == null && cargo == null){
             if (funcionarios.removerFornecedorPorUsuario(usuario) == true) {
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar um funcionario com este usuario, por favor verifique!", "Erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }else{
            if (funcionarios.removerFornecedorGeral(usuario, nome , cargo) == true) {
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar um funcionario com este usuario, por favor verifique!", "Erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_JLblButtonRemoverMouseClicked

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
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblButtonRemover;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblButtonAdicionar;
    private javax.swing.JLabel jLblButtonEstoque;
    private javax.swing.JLabel jLblButtonFornecedores;
    private javax.swing.JLabel jLblButtonFuncionarios;
    private javax.swing.JLabel jLblButtonMenu;
    private javax.swing.JLabel jLblButtonVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFCargo;
    private javax.swing.JTextField jTFNomeFuncionario;
    private javax.swing.JTextField jTFSenha;
    private javax.swing.JTextField jTFUsuario;
    private javax.swing.JTable jTFuncionarios;
    // End of variables declaration//GEN-END:variables
}
