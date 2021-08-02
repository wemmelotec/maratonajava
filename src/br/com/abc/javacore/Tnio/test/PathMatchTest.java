package br.com.abc.javacore.Tnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/*
essa classe PathMatch faz buscas com mais qualidade
 */

/*
classe criada para buscar mais de um tipo de arquivo
 */
class FindAllTest extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
    @Override//esse método server para percorrer todoo o diretório
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class PathMatchTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("E:/intellij/maratona-java/src/br/com/abc/javacore/nio/folder/subfolder/file.bkp");
        Path path2 = Paths.get("file.bkp");
        matches(path2,"glob:*.bkp");
        System.out.println("**************************");
        try {
            Files.walkFileTree(Paths.get("./"),new FindAllTest());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void matches(Path path, String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob+": "+pathMatcher.matches(path));
    }
}
