package task4;

import java.math.BigDecimal;

public class Triangle extends Shape {

    public Triangle(Point point, Point point2, Point point3) {
        super(new Point[] {
                new Point(point.x, point.y),
                new Point(point2.x, point2.y),
                new Point(point3.x, point3.y)
        });
    }

    @Override
    double area() {
        return 0.5 * Math.abs((points[1].x - points[0].x) * (points[2].y - points[0].y) - (points[1].y - points[0].y) * (points[2].x - points[0].x));
    }
}
