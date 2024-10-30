/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author gbresende
 */
public class VendasControl {
    private Conexao conexao;
    private Connection con;

    public VendasControl() {
        conexao = new Conexao();
        con = conexao.getConnection();
    }
   
    public boolean inserirProduto(Date data_venda, Integer id_produto, Integer qtd) {

        String sql = "INSERT INTO vendas(data_venda,id_produto,qtd) VALUES (?,?,?)";

        try {
            if (data_venda == null || id_produto == null || qtd == null) {
                return false;
            } else {
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setDate(1, data_venda);
                pstm.setInt(2, id_produto);
                pstm.setInt(3, qtd);
                pstm.executeUpdate();
                System.out.println("Teste de funcionamento para inserção de " + data_venda + " na tabela aluno");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }
    
    }
    
    public boolean removerProduto(Date data_venda, Integer id_produto, Integer qtd) {

        String sql = "DELETE FROM vendas WHERE id_produto = (?) AND data_venda = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id_produto);
            pstm.setDate(2, data_venda);
            pstm.executeUpdate();

            System.out.println("Teste de funcionamento para deletar " + id_produto + " na tabela aluno");
            return true;
        } catch (Exception e) {
            System.out.println("Deu certo não :(");
            return false;
        }
    }
    
    
    
}
