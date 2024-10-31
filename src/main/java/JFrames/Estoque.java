/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import connection.Conexao;
import connection.EstoqueControl;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinio
 */
public class Estoque extends javax.swing.JFrame {

    /**
     * Creates new form Estoque
     */
    public Estoque() {
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
        jPanelMenu = new javax.swing.JPanel();
        jLblButtonMenu = new javax.swing.JLabel();
        jLblButtonEstoque = new javax.swing.JLabel();
        jLblButtonFornecedores = new javax.swing.JLabel();
        jLblButtonFuncionarios = new javax.swing.JLabel();
        jLblButtonVendas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLblButtonAdicionar = new javax.swing.JLabel();
        jLblButtonRemover = new javax.swing.JLabel();
        jLblButtonAlterar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNomeProduto = new javax.swing.JTextField();
        jTFCategoria = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFQntEstoque = new javax.swing.JTextField();
        jTFForncedores = new javax.swing.JTextField();
        jTFPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEstoque = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estoque");

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonFuncionariosMouseClicked(evt);
            }
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Tabela de estoque.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLblButtonAdicionar.setBackground(new java.awt.Color(31, 43, 68));
        jLblButtonAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonAdicionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonAdicionar.setText("Adicionar ");
        jLblButtonAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 133, 196), 2));
        jLblButtonAdicionar.setOpaque(true);
        jLblButtonAdicionar.setPreferredSize(new java.awt.Dimension(200, 30));
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

        jLblButtonRemover.setBackground(new java.awt.Color(31, 43, 68));
        jLblButtonRemover.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonRemover.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonRemover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonRemover.setText("Remover");
        jLblButtonRemover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 133, 196), 2));
        jLblButtonRemover.setOpaque(true);
        jLblButtonRemover.setPreferredSize(new java.awt.Dimension(200, 30));
        jLblButtonRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonRemoverMouseExited(evt);
            }
        });

        jLblButtonAlterar.setBackground(new java.awt.Color(31, 43, 68));
        jLblButtonAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jLblButtonAlterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblButtonAlterar.setText("Alterar");
        jLblButtonAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 133, 196), 2));
        jLblButtonAlterar.setOpaque(true);
        jLblButtonAlterar.setPreferredSize(new java.awt.Dimension(200, 30));
        jLblButtonAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblButtonAlterarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblButtonAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblButtonAlterarMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome do produto ");

        jTFNomeProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFNomeProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFNomeProduto.setPreferredSize(new java.awt.Dimension(150, 30));

        jTFCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFCategoria.setPreferredSize(new java.awt.Dimension(150, 30));

        jTFMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFMarca.setPreferredSize(new java.awt.Dimension(150, 30));

        jTFQntEstoque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFQntEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFQntEstoque.setPreferredSize(new java.awt.Dimension(150, 30));

        jTFForncedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFForncedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFForncedores.setPreferredSize(new java.awt.Dimension(150, 30));

        jTFPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTFPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFPreco.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Categoria");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Qnt. Estoque ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Fornecedores");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Preço");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLblButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLblButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLblButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFForncedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFQntEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFQntEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFForncedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jTEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTEstoque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", ""},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Categoria", "Marca", "Fornecedores", "Qnt. Estoque", "Preço"
            }
        ));
        jTEstoque.setGridColor(new java.awt.Color(0, 0, 0));
        jTEstoque.setPreferredSize(new java.awt.Dimension(452, 402));
        jScrollPane1.setViewportView(jTEstoque);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
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

    private void jLblButtonFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonFornecedoresMouseClicked
        // TODO add your handling code here:
        Fornecedores fornecedores = new Fornecedores();
        fornecedores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLblButtonFornecedoresMouseClicked

    private void jLblButtonFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonFuncionariosMouseClicked
        // TODO add your handling code here:
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLblButtonFuncionariosMouseClicked

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

    private void jLblButtonRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonRemoverMouseEntered
        // TODO add your handling code here:
        jLblButtonRemover.setBackground(new Color(38, 133, 196));
        Border border = BorderFactory.createLineBorder(new Color(31, 43, 68), 2);
        jLblButtonRemover.setBorder(border);
    }//GEN-LAST:event_jLblButtonRemoverMouseEntered

    private void jLblButtonRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonRemoverMouseExited
        // TODO add your handling code here:
        jLblButtonRemover.setBackground(new Color(31, 43, 68));
        Border border = BorderFactory.createLineBorder(new Color(38, 133, 196), 2);
        jLblButtonRemover.setBorder(border);
    }//GEN-LAST:event_jLblButtonRemoverMouseExited

    private void jLblButtonAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAlterarMouseEntered
        // TODO add your handling code here:
        jLblButtonAlterar.setBackground(new Color(38, 133, 196));
        Border border = BorderFactory.createLineBorder(new Color(31, 43, 68), 2);
        jLblButtonAlterar.setBorder(border);
    }//GEN-LAST:event_jLblButtonAlterarMouseEntered

    private void jLblButtonAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAlterarMouseExited
        // TODO add your handling code here:
        jLblButtonAlterar.setBackground(new Color(31, 43, 68));
        Border border = BorderFactory.createLineBorder(new Color(38, 133, 196), 2);
        jLblButtonAlterar.setBorder(border);
    }//GEN-LAST:event_jLblButtonAlterarMouseExited

    private void jLblButtonAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAdicionarMouseClicked
        // TODO add your handling code here:
        EstoqueControl estoque = new EstoqueControl();

        String nomeProduto = jTFNomeProduto.getText();
        String categoria = jTFCategoria.getText();
        String marca = jTFMarca.getText();
        Integer fornecedores = Integer.parseInt(jTFForncedores.getText());
        Integer qtdEstoque = Integer.parseInt(jTFQntEstoque.getText());
        Float preco = Float.parseFloat(jTFPreco.getText());

        if (estoque.inserirProduto(nomeProduto, categoria, marca, fornecedores, qtdEstoque, preco) == true) {
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor insira todos os campos", "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLblButtonAdicionarMouseClicked

    private void jLblButtonAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblButtonAlterarMouseClicked

    }//GEN-LAST:event_jLblButtonAlterarMouseClicked

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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLblButtonAdicionar;
    private javax.swing.JLabel jLblButtonAlterar;
    private javax.swing.JLabel jLblButtonEstoque;
    private javax.swing.JLabel jLblButtonFornecedores;
    private javax.swing.JLabel jLblButtonFuncionarios;
    private javax.swing.JLabel jLblButtonMenu;
    private javax.swing.JLabel jLblButtonRemover;
    private javax.swing.JLabel jLblButtonVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTEstoque;
    private javax.swing.JTextField jTFCategoria;
    private javax.swing.JTextField jTFForncedores;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFNomeProduto;
    private javax.swing.JTextField jTFPreco;
    private javax.swing.JTextField jTFQntEstoque;
    // End of variables declaration//GEN-END:variables
}
