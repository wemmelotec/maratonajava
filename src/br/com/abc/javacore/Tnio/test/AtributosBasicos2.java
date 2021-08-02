package br.com.abc.javacore.Tnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class AtributosBasicos2 {
    public static void main(String[] args) {
        Path path = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\assertivas\\test\\AssertTest.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isWritable(path));
        //BasicFileAttributes, PosixFileAttributes, DosFilesAttributes : apenas lê
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path,BasicFileAttributes.class);
            System.out.println(basicFileAttributes.creationTime());
            System.out.println(basicFileAttributes.lastAccessTime());
            System.out.println(basicFileAttributes.lastModifiedTime());
            System.out.println(basicFileAttributes.isDirectory());
            System.out.println("*********************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //BasicFileAttributesView, ..., ... : apenas para modificar
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path,BasicFileAttributes.class);
            FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
            FileTime created = basicFileAttributes.creationTime();
            FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());
            BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
            basicFileAttributeView.setTimes(lastModifiedTime,created,lastAcess);
            System.out.println(basicFileAttributes.creationTime());
            System.out.println(basicFileAttributes.lastAccessTime());
            System.out.println(basicFileAttributes.lastModifiedTime());
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
