package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

    private String url, user, password;
    private Connection con;
    private Boolean validacao;
    
    public Conexao() {
        url = "jdbc:postgresql://localhost:5432/supramercado";
        user = "postgres";
        password = "XXXXXX";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Aeba funcionou");
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e);
        }
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }


    
    public boolean removerPorIdUsuario(Integer id) {

        String sql = "DELETE FROM alunos WHERE id = (?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
            pstm.close();
            con.close();

            System.out.println("Teste de funcionamento para deletar o id : " + id + " na tabela aluno");
            return true;
        } catch (Exception e) {
            System.out.println("Deu certo não :(");
            return false;
        }
    }

    public boolean login(String usuario, String senha) {
        String sql = "SELECT FROM funcionarios WHERE usuario = (?) AND senha = (?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, senha);
            pstm.executeUpdate();
            validacao = true;
            return true;
        } catch (Exception e) {
            System.out.println("Email ou senha invalido!" + e);
            validacao = false;
            return false;
            
        }
    }

    public Boolean getValidacao() {
        return validacao;
    }
    
    
    
}
