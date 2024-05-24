import java.io.IOException;
import java.util.regex.Pattern;

public class SmartTextReaderLocker extends SmartTextReader {
    private Pattern pattern;

    public SmartTextReaderLocker(String fileName, String regex) {
        super(fileName);
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public char[][] read() throws IOException {
        if (pattern.matcher(super.fileName).matches()) {
            System.out.println("У доступі відмовлено!");
            return new char[0][];
        } else {
            return super.read();
        }
    }
}
