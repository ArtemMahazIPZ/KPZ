import java.io.IOException;

public class SmartTextChecker extends SmartTextReader {

    public SmartTextChecker(String fileName) {
        super(fileName);
    }

    @Override
    public char[][] read() throws IOException {
        System.out.println("Відкриваємо файл: " + super.fileName);
        char[][] content = super.read();
        System.out.println("Файл успішно відкрито.");
        int lines = content.length;
        int characters = 0;
        for (char[] line : content) {
            characters += line.length;
        }
        System.out.println("Всього рядків: " + lines);
        System.out.println("Всього символів: " + characters);
        System.out.println("Закрито файл: " + super.fileName);
        return content;
    }
}
