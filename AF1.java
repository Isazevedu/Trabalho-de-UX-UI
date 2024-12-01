
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.Statement; 

/**
 * A classe AF representa um usuário do sistema e possui métodos para 
 * realizar a conexão com o banco de dados e verificar as credenciais 
 * de login do usuário.
 */

public class AF1 { // 1

    /**
     * Estabelece a conexão com o banco de dados.
     *
     * @return um objeto Connection que representa a conexão ativa com o banco de dados.
     *         Retorna null se a conexão falhar.
     */

    public Connection conectarBD() { // 2
        Connection conn = null; // 2
        try { // 3
            Class.forName("com.mysql.Driver").newInstance(); // 4
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123"; // 4
            conn = DriverManager.getConnection(url); // 4
            // MELHORIA: Poderia usar um arquivo de configuração para armazenar a URL e as credenciais.
        } catch (Exception e) { // 5
            e.printStackTrace(); // 6
            // MELHORIA: Poderia usar um logger ao invés de `printStackTrace` para melhor controle dos logs.
        }
        return conn; // 7
        // MELHORIA: Poderia adicionar uma mensagem de erro personalizada em caso de falha na conexão.
    }

    public String nome = ""; // 8
    public boolean result = false; // 8

    /**
     * Verifica se o usuário e a senha fornecidos são válidos no banco de dados.
     *
     * @param login o nome de usuário fornecido.
     * @param senha a senha fornecida.
     * @return true se o login e senha forem válidos, false caso contrário.
     */

    public boolean verificarUsuario(String login, String senha) { // 9
        String sql = ""; // 10
        Connection conn = conectarBD(); // 10
        // INSTRUÇÃO SQL
        sql += "select nome from usuarios "; // 10
        sql += "where login = '" + login + "'"; // 10
        sql += " and senha = '" + senha + "';"; // 10
        // MELHORIA: Essa abordagem é vulnerável a SQL Injection.
        try { // 11
            Statement st = conn.createStatement(); // 12
            ResultSet rs = st.executeQuery(sql); // 12
            if (rs.next()) { // 13
                result = true; // 14
                nome = rs.getString("nome"); // 14
            }
        } catch (Exception e) { // 15
            e.printStackTrace(); // 16
            // MELHORIA: Poderia tratar o erro de forma mais específica, exibindo mensagens claras.
        }
        return result; // 17
        // MELHORIA: Poderia garantir que a conexão seja fechada mesmo em caso de erro.
    }
}