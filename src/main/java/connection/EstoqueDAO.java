/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gbresende
 */
public class EstoqueDAO {

    private Conexao conexao;
    private Connection con;

    public EstoqueDAO() {
        conexao = new Conexao();
        con = conexao.getConnection();
    }

    public boolean inserirProduto(String nome, String categoria, String marca, Integer id_fornecedores, Integer qtd_estoque, Float preco) {

        String sql = "INSERT INTO estoque(nome_produto,categoria,marca,id_fornecedor,qtd_estoque,preco) VALUES (?,?,?,?,?,?)";

        try {
            if (nome == null || categoria == null || marca == null || id_fornecedores == null || qtd_estoque == null || preco == 0 || preco == null) {
                return false;
            } else {
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, nome);
                pstm.setString(2, categoria);
                pstm.setString(3, marca);
                pstm.setInt(4, id_fornecedores);
                pstm.setInt(5, qtd_estoque);
                pstm.setFloat(6, preco);
                pstm.executeUpdate();
                System.out.println("Teste de funcionamento para inserção de " + nome + " na tabela aluno");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }

    }

    public boolean removerProduto(String nome, String marca) {

        String sql = "DELETE FROM estoque WHERE nome = (?) AND marca = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, marca);
            pstm.executeUpdate();

            System.out.println("Teste de funcionamento para deletar " + nome + " na tabela aluno");
            return true;
        } catch (Exception e) {
            System.out.println("Deu certo não :(");
            return false;
        }
    }

    public boolean buscarPorID(Integer id) {
        String sql = "SELECT nome_produto,categoria,marca,id_fornecedor,qtd_estoque,preco FROM estoque WHERE id = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();

            ArrayList<Object> estoqueDados = new ArrayList<>();
            while (rs.next()) {
                String nome = rs.getString("nome_produto");
                String categoria = rs.getString("categoria");
                String marca = rs.getString("marca");
                Integer id_fornecedor = rs.getInt("id_fornecedor");
                Integer qtd_estoque = rs.getInt("qtd_estoque");
                Float preco = rs.getFloat("preco");

                estoqueDados.add(nome);
                estoqueDados.add(categoria);
                estoqueDados.add(marca);
                estoqueDados.add(id_fornecedor);
                estoqueDados.add(qtd_estoque);
                estoqueDados.add(preco);
                
                
            }
            System.out.println("Teste de busca por id, executado com sucesso");
            return true;

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }
    }

    public boolean alterarEstoque(String nome, String categoria, String marca, Integer id_fornecedores, Integer qtd_estoque, Float preco, Integer id) {
        String sql = "UPDATE estoque SET nome_produto = (?), categoria = (?), marca = (?) , id_fornecedor = (?), qtd_estoque = (?), preco = (?) WHERE id = (?)";

        try {
            if (nome == null || categoria == null || marca == null || id_fornecedores == null || qtd_estoque == null || preco == 0 || preco == null) {
                return false;
            } else {
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, nome);
                pstm.setString(2, categoria);
                pstm.setString(3, marca);
                pstm.setInt(4, id_fornecedores);
                pstm.setInt(5, qtd_estoque);
                pstm.setFloat(6, preco);
                pstm.setInt(7, id);

                pstm.executeUpdate();
                System.out.println("Teste de funcionamento para inserção de " + nome + " na tabela aluno");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }
        
        
        /* para puxar a tabela do banco ... adicionar no click do atualizar tabela
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/supramercado", "postgres", "xxxxxx");

            String sql = "SELECT * FROM estoque";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String nome = rs.getString("nome_produto");
                String categoria = rs.getString("categoria");
                String marca = rs.getString("marca");
                String id_fornecedor = String.valueOf(rs.getInt("id_fornecedor"));
                String qtd_estoque = String.valueOf(rs.getInt("qtd_estoque"));
                String preco = String.valueOf(rs.getFloat("preco"));

                String tbData[] = {id, nome, categoria, marca, id_fornecedor, qtd_estoque, preco};
                DefaultTableModel tblModel = (DefaultTableModel) jTEstoque.getModel();
                tblModel.addRow(tbData);
            }
            
            con.close();

        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e);
        }
        
        */
        

    }
 
}
