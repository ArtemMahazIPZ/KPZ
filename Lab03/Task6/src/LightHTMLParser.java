import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LightHTMLParser {

    public LightElementNode parseBook(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;
            LightElementNode root = new LightElementNode("html");
            LightElementNode body = new LightElementNode("body");
            root.addChild(body);

            while ((line = br.readLine()) != null) {
                LightElementNode element;
                if (firstLine) {
                    element = new LightElementNode("h1");
                    firstLine = false;
                } else if (line.length() < 20) {
                    element = new LightElementNode("h2");
                } else if (line.startsWith(" ")) {
                    element = new LightElementNode("blockquote");
                } else {
                    element = new LightElementNode("p");
                }
                element.addChild(new LightTextNode(line.trim()));
                body.addChild(element);
            }
            return root;
        }
    }
}
