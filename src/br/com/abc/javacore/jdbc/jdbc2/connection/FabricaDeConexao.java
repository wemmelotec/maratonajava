package br.com.abc.javacore.jdbc.jdbc2.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
}
