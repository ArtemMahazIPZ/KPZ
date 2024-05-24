import java.util.ArrayList;
import java.util.List;

public class LightElementNode extends LightNode {
    private String tagName;
    private String displayType;
    private String closingType;
    private List<String> cssClasses;
    private List<LightNode> children;

    public LightElementNode(String tagName, String displayType, String closingType) {
        this.tagName = tagName;
        this.displayType = displayType;
        this.closingType = closingType;
        this.cssClasses = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void addCssClass(String cssClass) {
        cssClasses.add(cssClass);
    }

    public void addChild(LightNode child) {
        children.add(child);
    }

    @Override
    public String getOuterHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);

        if (!cssClasses.isEmpty()) {
            sb.append(" class=\"").append(String.join(" ", cssClasses)).append("\"");
        }

        if (closingType.equals("single")) {
            sb.append("/>");
        } else {
            sb.append(">");
            for (LightNode child : children) {
                sb.append(child.getOuterHTML());
            }
            sb.append("</").append(tagName).append(">");
        }

        return sb.toString();
    }

    @Override
    public String getInnerHTML() {
        StringBuilder sb = new StringBuilder();
        for (LightNode child : children) {
            sb.append(child.getOuterHTML());
        }
        return sb.toString();
    }
}
