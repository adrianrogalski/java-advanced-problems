package task4;

public class Circle extends Shape {
    private final int radius;

    public Circle(Point point, int radius) {
        super(new Point[] {
            new Point(point.x, point.y)
        });
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
