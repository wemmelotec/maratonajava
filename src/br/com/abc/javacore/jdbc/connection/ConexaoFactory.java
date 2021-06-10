package br.com.abc.javacore.jdbc.connection;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

/*
o jdcb � uma biblioteca java que serve para abstrair os problemas dos banco de dados
ent�o o que eu devo aprender a fazer � utilizar as interfaces do pacote java.sql
Connection - buscar a conex�o,
    createStatment
Statement - realizar opera��es que v�o afetar o estado do banco,
    executeUpdate - modifica o banco
    executeQuery - faz uma consulta ao banco (ResultQuery)
ResultSet - trabalha com os resultados daquela consulta
    pegar meta dados, por exemplo nome das colunas, quantidade de colunas
    com o resultset voc� pode mover o cursor para a linha que desejar
    pode fazer tamb�m update mais complexos
Classe DriveManager = a conex�o vem atrav�s desta classe que vai buscar o conector daquele banco de dados
O DriverManeger � uma f�brica de objetos que vai te devolver uma conex�o baseado na url que voc� especificar
RowSet � um ResultSet a diferen�a s�o os tipos, um que mant�m a conex�o direto com o BD e o desconectado
    que salva os registros em mem�ria fica trabalhando com eles e atualiza o banco depois, vantagens � mais simples
    n�o precisa criar Statments n�o precisa ficar criando a conex�o, ele faz tudo isso.
    Com o RowSet n�o podemos utilizar comandos update, insert ou delete
Java Bean � uma classe Java normal com getters e setters.
CachedRowSet � um tipo de RowSet que trabalha desconectado, ou seja, ele faz a query, trabalha no resultado e se houver
    altera��o ele envia no final

 */
public class ConexaoFactory {
    //m�todo respons�vel por pegar a conex�o
    public static Connection getConexao() {
        //Vamos obter nossa conex�o, precisamos de tr�s coisas: url, users and password
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String user = "root";
        String password = "";
        //agora vou pegar a conex�o atrav�s da DriverManager
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            //System.out.println(connection); imprime minha conex�o na tela
            return connection;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    //M�todo Connection para o RowSet
    public static JdbcRowSet getRowSetConexao() {
        //Vamos obter nossa conex�o, precisamos de tr�s coisas: url, users and password
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String user = "root";
        String password = "";
        //agora vou pegar um objeto do tipo RowSet
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);

            return jdbcRowSet;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    //M�todo Connection para o CachedRowSet
    public static CachedRowSet getRowSetConexaoCached() {
        //Vamos obter nossa conex�o, precisamos de tr�s coisas: url, users and password
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&relaxAutoCommit=true";
        String user = "root";
        String password = "";
        //agora vou pegar um objeto do tipo RowSet
        try {
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);

            return cachedRowSet;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    //m�todo sobre carregado para fechar a conex�o do RowSet
    public static void close(JdbcRowSet jdbcRowSet) {
        try {
            if (jdbcRowSet != null)//tratamento para o caso de ser nulo
                jdbcRowSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //m�todo criado para fechar a conex�o
    public static void close(Connection connection) {
        try {
            if (connection != null)//tratamento para o caso de ser nulo
                connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //m�todo sobrecarregado para fechar a statment
    public static void close(Connection connection, Statement statement) {
        close(connection);
        try {
            if (statement != null)//tratamento para o caso de ser nulo
                statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //m�todo sobrecarregado para fechar o resultSet
    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        close(connection,statement);
        try {
            if (resultSet != null)//tratamento para o caso de ser nulo
                resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
