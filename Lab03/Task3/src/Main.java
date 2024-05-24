public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new RasterRenderer());
        Shape square = new Square(new VectorRenderer());
        Shape triangle = new Triangle(new RasterRenderer());

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
