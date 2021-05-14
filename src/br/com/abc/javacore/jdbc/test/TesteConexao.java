package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.connection.ConexaoFactory;
import br.com.abc.javacore.jdbc.db.CompradorDB;

import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
        //ConexaoFactory.getConexao(); linha para testar a conexão
        //inserir();
        //deletar();
        //atualizar();
        //selecionarTudo();
//        List<Comprador> compradorList = selecionarTudo();
//        for (Comprador comprador:compradorList) {
//            System.out.println(comprador);
//        }

//        List<Comprador> compradorList = selecionarPorNome("avo");
//        System.out.println(compradorList);

        //CompradorDB.selectMetaData();

        //CompradorDB.checkDriverStatus();

        CompradorDB.testTypeScroll();

    }

    public static void inserir() {
        Comprador comprador = new Comprador("123.123.456-78", "Gustavo");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(4);
        CompradorDB.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(5, "000.000.000-00", "Gustavo");
        CompradorDB.update(comprador);
    }

    //    public static void selecionarTudo(){
//        CompradorDB.selectAll();
//    }
    public static List<Comprador> selecionarTudo() {
        return CompradorDB.selectAll();
    }

    public static List<Comprador> selecionarPorNome(String nome) {
        return CompradorDB.searchByName(nome);
    }
}
