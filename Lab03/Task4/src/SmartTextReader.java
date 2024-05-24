import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SmartTextReader {
    protected String fileName;

    public SmartTextReader(String fileName) {
        this.fileName = fileName;
    }

    public char[][] read() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return br.lines().map(String::toCharArray).toArray(char[][]::new);
        }
    }
}
