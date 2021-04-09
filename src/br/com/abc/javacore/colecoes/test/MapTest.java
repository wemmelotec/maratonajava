package br.com.abc.javacore.colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //chave -> valor
        Map<String, String> map = new HashMap<>();//por ser um Hash tenho que lembrar que a cole��o n�o guarda ordem
        /*
        caso eu queira preservar a ordem de inser��o basta modificar a segunda coluna para LinkedHashMap
        assim como fazemos no Set
         */
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc", "voc�");
        //iterar sobre o map
        //iterar sobre as chaves
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        //iterar sobre o valor
        for (String value: map.values()) {
            System.out.println(value);
        }
        //iterar sobre os dois
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }
    }
}
