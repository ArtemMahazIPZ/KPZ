public class Circle extends Shape {
    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle ");
        renderer.render();
    }
}
