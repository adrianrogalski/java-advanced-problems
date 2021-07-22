package task4;

public class Task04 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(new Point(10,10),10,5);
        shapes[1] = new Square(new Point(5, 10), 5);
        shapes[2] = new Section(new Point(0,0), new Point(5,5));
        shapes[3] = new Triangle(new Point(0,0), new Point(0, 5), new Point( 5, 0));
        shapes[4] = new Circle(new Point(5,5), 5);
        for (Shape s: shapes){
            System.out.println(s);
            if (s != null) {
                System.out.println("Pole powierzchni " + s.area());
                /**
                 4. Dopisz tutaj instrukcję, która rozpozna, który z obiektów jest prostokotąm
                 i wywoła metodę moveTo(new Point(0,0))
                 */
                if (s instanceof Rectangle) {
                    System.out.println("Znaleziono prostokąt");
                    ((Rectangle) s).moveTo(new Point(0,0));
                }
            }
        }
        /**
         * Oczekiwane wyniki
         * - pole trójkąta = 12.50
         * - pole koła     = 75.36
         */

    }
}
