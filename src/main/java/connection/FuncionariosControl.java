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
public class FuncionariosControl {

    private Conexao conexao;
    private Connection con;

    public FuncionariosControl() {
        conexao = new Conexao();
        con = conexao.getConnection();
    }
   
    public boolean inserirFuncionario(String nome, String cpf, String usuario, String senha, String cargo) {

        String sql = "INSERT INTO funcionarios(nome,cpf,usuario,senha,cargo) VALUES (?,?,?,?,?)";

        try {
            if (nome == null || cpf == null || usuario == null || senha == null || cargo == null) {
                return false;
            } else {
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, nome);
                pstm.setString(2, cpf);
                pstm.setString(3, usuario);
                pstm.setString(4, senha);
                pstm.setString(5, cargo);
                pstm.executeUpdate();
                System.out.println("Teste de funcionamento para inserção de " + nome + " na tabela fornecedor");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
            return false;
        }
    
    }
    
    public boolean removerFornecedorPorNome(String nome) {

        String sql = "DELETE FROM funcionarios WHERE nome = (?)";

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
    
    public boolean removerFornecedorPorCargo(String cargo) {

        String sql = "DELETE FROM funcionarios WHERE cargo = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, cargo);
            pstm.executeUpdate();
            pstm.close();
            con.close();

            System.out.println("Teste de funcionamento para deletar " + cargo + " na tabela fornecedores");
            return true;
        } catch (Exception e) {
            System.out.println("Deu certo não :(");
            return false;
        }
    }
    
    public boolean removerFornecedorPorUsuario(String usuario) {

        String sql = "DELETE FROM funcionarios WHERE usuario = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.executeUpdate();
            pstm.close();
            con.close();

            System.out.println("Teste de funcionamento para deletar " + usuario + " na tabela fornecedores");
            return true;
        } catch (Exception e) {
            System.out.println("Deu certo não :(");
            return false;
        }
    }
    
    public boolean removerFornecedorGeral(String usuario, String nome, String cargo) {

        String sql = "DELETE FROM funcionarios WHERE usuario = (?) AND nome = (?) AND cargo = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, nome);
            pstm.setString(3, cargo);
            pstm.executeUpdate();

            System.out.println("Teste de funcionamento para deletar " + usuario + " na tabela fornecedores");
            return true;
        } catch (Exception e) {
            System.out.println("Deu certo não :(");
            return false;
        }
    }
}


