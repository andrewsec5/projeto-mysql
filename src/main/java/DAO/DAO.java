package DAO;

import java.sql.*;

public class DAO {
    String url = "jdbc:mysql://localhost:3306/cadastro";
    String usuario = "root";
    String senha = "";

    public void listarCursos() throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select idcurso, nome from cursos");
            while (rs.next()) {
                int id = rs.getInt("idcurso");
                String nome = rs.getString("nome");
                System.out.printf("ID: %2d | Nome: %s\n", id, nome);
            }
        }catch (SQLException e) {
            throw new SQLException("Erro na conexão");
        }
    }

    public void inserirUsuario(String nome, String nascimento, String peso, String altura, String sexo) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
            String sql = "insert into gafanhotos (nome, nascimento, peso, altura, sexo) values (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, nome);
                ps.setString(2, nascimento);
                ps.setString(3, peso);
                ps.setString(4, altura);
                ps.setString(5, sexo);
                ps.executeUpdate();
                System.out.println("Usuário adicionado!");
            }
        }catch (SQLException e) {
            throw new SQLException("Erro na conexão");
        }
    }

    public void listarUsuarios() throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select nome, nascimento, peso, altura, sexo from gafanhotos");
            while (rs.next()) {
                String nome = rs.getString("nome");
                String nascimento = rs.getString("nascimento");
                double peso = rs.getDouble("peso");
                double altura = rs.getDouble("altura");
                String sexo = rs.getString("sexo");
                System.out.printf("Nome: %-30s | Nascimento: %10s | Peso: %6.2fkg | Altura: %1.2fm | Sexo: %1s\n", nome, nascimento, peso, altura, sexo);
            }
        }catch (SQLException e) {
            throw new SQLException("Erro na conexão");
        }
    }

    public static void main(String[] args) throws SQLException {
        DAO dao = new DAO();

        dao.listarUsuarios();

        System.out.println();

        dao.listarCursos();

        System.out.println();

        dao.inserirUsuario("Usuario Teste", "2006-04-24", "86", "2.03", "F");

        dao.listarUsuarios();
    }

}
