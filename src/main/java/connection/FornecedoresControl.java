/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

        String sql = "DELETE FROM estoque WHERE nome = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.executeUpdate();
            pstm.close();
            con.close();

            System.out.println("Teste de funcionamento para deletar " + nome + " na tabela fornecedores");
            return true;
        } catch (Exception e) {
            System.out.println("Deu certo não :(");
            return false;
        }
    }
}


