package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.db.CompradorDBOLD;

import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
        //ConexaoFactory.getConexao(); linha para testar a conexão
        //inserir();
        //deletar();
        //atualizar();

//        selecionarTudo();
//        List<Comprador> compradorList = selecionarTudo();
//        for (Comprador comprador:compradorList) {
//            System.out.println(comprador);
//        }

//        List<Comprador> compradorList = selecionarPorNome("avo");
//        System.out.println(compradorList);

        //CompradorDB.selectMetaData();

        //CompradorDB.checkDriverStatus();

        //CompradorDB.testTypeScroll();

        //CompradorDB.updateNomesToLowerCase();
        //System.out.println(CompradorDB.searchByNamePreparedStatement("we"));
        //CompradorDB.updatePreparedStatement(new Comprador(5,"000.000.000-22","gustavo medeiros"));
//        System.out.println(CompradorDB.searchByNameCallableStatement("%we%"));
       // System.out.println(CompradorDB.searchByNameRowSet("we"));
        //CompradorDB.updateRowSet(new Comprador(1,"000.111.000-22","merlim"));
        CompradorDBOLD.updateCachedRowSet(new Comprador(1,"000.111.000-22","merlim"));

    }

    public static void inserir() {
        Comprador comprador = new Comprador("123.123.456-78", "Gustavo");
        CompradorDBOLD compradorDBOLD = new CompradorDBOLD();
        compradorDBOLD.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(4);
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(5, "000.000.000-00", "Gustavo");
        CompradorDBOLD.update(comprador);
    }

    //    public static void selecionarTudo(){
//        CompradorDB.selectAll();
//    }
    public static List<Comprador> selecionarTudo() {
        return CompradorDBOLD.selectAll();
    }

    public static List<Comprador> selecionarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }
}
