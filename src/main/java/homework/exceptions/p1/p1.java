package homework.exceptions.p1;

public class p1 {
    public static void main(String[] args) {
        double result = divide(1, 0);
    }
    public static double divide(double a,  double b) {
        if (b == 0) {
            throw new CannotDivideBy0Exception();
        }
        return a / b;
    }
}
