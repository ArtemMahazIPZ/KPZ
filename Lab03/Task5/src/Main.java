public class Main {
    public static void main(String[] args) {
        LightElementNode table = new LightElementNode("table", "block", "double");
        table.addCssClass("my-table");

        LightElementNode tr1 = new LightElementNode("tr", "block", "double");
        LightElementNode td1 = new LightElementNode("td", "inline", "double");
        LightElementNode td2 = new LightElementNode("td", "inline", "double");

        LightTextNode text1 = new LightTextNode("Комірка 1");
        LightTextNode text2 = new LightTextNode("Комірка 2");

        td1.addChild(text1);
        td2.addChild(text2);

        tr1.addChild(td1);
        tr1.addChild(td2);

        table.addChild(tr1);

        System.out.println("Outer HTML:");
        System.out.println(table.getOuterHTML());

        System.out.println("Inner HTML:");
        System.out.println(table.getInnerHTML());
    }
}
