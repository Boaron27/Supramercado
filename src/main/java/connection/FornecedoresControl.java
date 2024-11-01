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
 * @author gabri
 */
public class FornecedoresControl {

    private Conexao conexao;
    private Connection con;

    public FornecedoresControl() {
        conexao = new Conexao();
        con = conexao.getConnection();
    }

    public boolean inserirFonecedor(String nome, String telefone, String status) {

        String sql = "INSERT INTO fornecedores(nome,telefone,status) VALUES (?,?,?)";

        try {
            if (nome == null || telefone == null || status == null) {
                return false;
            } else {
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, nome);
                pstm.setString(2, telefone);
                pstm.setString(3, status);
                pstm.executeUpdate();
                System.out.println("Teste de funcionamento para inserção de " + nome + " na tabela fornecedor");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }

    }

    public boolean removerFornecedor(String nome) {

        String sql = "DELETE FROM fornecedores WHERE nome = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.executeUpdate();
            pstm.close();
            con.close();

            System.out.println("Teste de funcionamento para deletar " + nome + " na tabela fornecedores");
            return true;
        } catch (Exception e) {
            System.out.println("Erro" + e);
            return false;
        }
    }

    public boolean buscarPorID(Integer id) {
        String sql = "SELECT nome,telefone,status FROM fornecedores WHERE id = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            ArrayList<String> fornecedoresDados = new ArrayList<>();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String status = rs.getString("status");

                fornecedoresDados.add(nome);
                fornecedoresDados.add(telefone);
                fornecedoresDados.add(status);
            }
            System.out.println("Teste de busca por id, executado com sucesso");
            return true;

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }
    }

    public boolean alterarFornecedor(String nome, String telefone, String status, Integer id) {
        String sql = "UPDATE fornecedores SET nome = (?), telefone = (?), status = (?) WHERE id = (?)";

        try {
            if (nome == null || telefone == null || status == null) {
                return false;
            } else {
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, nome);
                pstm.setString(2, telefone);
                pstm.setString(3, status);
                pstm.setInt(4, id);
                pstm.executeUpdate();
                System.out.println("Teste de funcionamento para inserção de " + nome + " na tabela fornecedor");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }

    }
}
