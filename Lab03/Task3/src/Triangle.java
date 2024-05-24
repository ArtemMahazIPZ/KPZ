public class Triangle extends Shape {
    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Triangle ");
        renderer.render();
    }
}
