import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            LightHTMLParser parser = new LightHTMLParser();
            LightElementNode root = parser.parseBook("mybook.txt");

            System.out.println("Результат:");
            System.out.println(root.getOuterHTML());

            MemoryUsage.printMemoryUsage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
