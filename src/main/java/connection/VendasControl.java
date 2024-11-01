/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

<<<<<<< HEAD
    public boolean removerVenda(Date data_venda, Integer id_produto, Integer qtd) {

        String sql = "DELETE FROM vendas WHERE id_produto = (?) AND data_venda = (?) AND qtd = (?) ";
=======
    public boolean removerProduto(Date data_venda, Integer id_produto, Integer qtd) {

        String sql = "DELETE FROM vendas WHERE id_produto = (?) AND data_venda = (?)";
>>>>>>> 62213652172e1655ce589b939b184d445d05b620

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id_produto);
            pstm.setDate(2, data_venda);
<<<<<<< HEAD
            pstm.setInt(3, qtd);
=======
>>>>>>> 62213652172e1655ce589b939b184d445d05b620
            pstm.executeUpdate();

            System.out.println("Teste de funcionamento para deletar " + id_produto + " na tabela aluno");
            return true;
        } catch (Exception e) {
            System.out.println("Deu certo não :(");
            return false;
        }
    }

    public boolean buscarPorID(Integer id) {
        String sql = "SELECT data_venda,id_produto,qtd FROM vendas WHERE id = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
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
            }
            System.out.println("Teste de busca por id, executado com sucesso");
            return true;

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }
    }

    public boolean alterarVenda(Date data_venda, Integer id_produto, Integer qtd, Integer id) {
<<<<<<< HEAD
        String sql = "UPDATE vendas SET data_venda = (?), id_produto = (?), qtd = (?) WHERE id = (?)";
=======
        String sql = "UPDATE fornecedores SET data_venda = (?), id_produto = (?), qtd = (?) WHERE id = (?)";
>>>>>>> 62213652172e1655ce589b939b184d445d05b620

        try {
            if (data_venda == null || id_produto == null || qtd == null) {
                return false;
            } else {
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setDate(1, data_venda);
                pstm.setInt(2, id_produto);
                pstm.setInt(3, qtd);
                pstm.setInt(4, id);

                pstm.executeUpdate();
                System.out.println("Teste de funcionamento para inserção de " + data_venda + " na tabela aluno");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }

    }
}
