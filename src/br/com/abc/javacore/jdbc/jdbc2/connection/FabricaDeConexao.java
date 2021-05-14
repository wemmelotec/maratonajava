package br.com.abc.javacore.jdbc.jdbc2.connection;

import java.sql.*;

public class FabricaDeConexao {

    public static Connection pegarConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String usuario = "root";
        String senha = "";
        try {
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void fecharConexao(Connection connection){
        try {
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fecharConexao(Connection connection, Statement statement){
        fecharConexao(connection);
        try {
            if(statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fecharConexao(Connection connection, Statement statement, ResultSet resultSet){
        fecharConexao(connection,statement);
        try {
            if(resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
