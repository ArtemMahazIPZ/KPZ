import java.util.HashMap;
import java.util.Map;

public class FlyweightLightElementNode extends LightElementNode {
    private static Map<String, FlyweightLightElementNode> flyweights = new HashMap<>();

    private FlyweightLightElementNode(String tagName) {
        super(tagName);
    }

    public static FlyweightLightElementNode getInstance(String tagName) {
        return flyweights.computeIfAbsent(tagName, FlyweightLightElementNode::new);
    }
}
