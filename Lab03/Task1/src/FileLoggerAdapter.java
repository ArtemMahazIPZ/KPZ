import java.io.IOException;

public class FileLoggerAdapter extends Logger {
    private FileWriterUtil fileWriterUtil;

    public FileLoggerAdapter(String filename) throws IOException {
        this.fileWriterUtil = new FileWriterUtil(filename);
    }

    @Override
    public void log(String message) {
        try {
            fileWriterUtil.writeLine("ЛОГ: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void error(String message) {
        try {
            fileWriterUtil.writeLine("ПОМИЛКА: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void warn(String message) {
        try {
            fileWriterUtil.writeLine("ПОПЕРЕДЖЕННЯ: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            fileWriterUtil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
