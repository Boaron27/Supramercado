package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    private String url, user, password;
    private Connection con;
    
    public Conexao() {
        url = "jdbc:postgresql://localhost:5432/supramercado";
        user = "postgres";
        password = "XXXXX";

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

    public boolean login(String usuario, String senha) {
        String sql = "SELECT usuario, senha FROM funcionarios WHERE usuario = (?) AND senha = (?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, senha);
            
            ResultSet rs = pstm.executeQuery();
            
            if(rs.next()){
                return true;
            }else{
                System.out.println("Email ou senha invalido");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return false;
            
        }
    }  
}
