/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
    
    public boolean removerProduto(String nome ,String marca) {

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
    
    
    
}
