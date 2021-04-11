import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;


public class FileSystem {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Path path = Paths.get("fat32.img");
        byte[] data = Files.readAllBytes(path);
    }
}

