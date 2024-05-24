import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            SmartTextReader reader = new SmartTextChecker("test.txt");
            char[][] content = reader.read();

            for (char[] line : content) {
                System.out.println(line);
            }

            System.out.println("\n");

            SmartTextReader lockedReader = new SmartTextReaderLocker("secret.txt", ".*secret.*");
            char[][] lockedContent = lockedReader.read();

            for (char[] line : lockedContent) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
