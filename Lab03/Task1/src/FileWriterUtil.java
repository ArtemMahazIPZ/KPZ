import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
    private FileWriter fileWriter;

    public FileWriterUtil(String filename) throws IOException {
        File file = new File(filename);
        this.fileWriter = new FileWriter(file, true);
    }

    public void write(String message) throws IOException {
        fileWriter.write(message);
    }

    public void writeLine(String message) throws IOException {
        fileWriter.write(message + System.lineSeparator());
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}
