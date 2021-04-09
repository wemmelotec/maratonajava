package br.com.abc.javacore.colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "letra a");
        map.put("B", "letra b");
        map.put("C", "letra c");
        map.put("D", "letra d");
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(map.headMap("C"));
        System.out.println(map.headMap("C",true));
    }
}
