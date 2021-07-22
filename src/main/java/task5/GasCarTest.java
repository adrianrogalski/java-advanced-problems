package task5;

public class GasCarTest {
    public static void main(String[] args) {
        GasCar car = new GasCar(10);
        System.out.println(car.refuel(10));
        System.out.println(car.consume(8));
        System.out.println(car.consume(4));
        System.out.println(car.consume(-12));
        System.out.println(car.refuel(-12));
    }
}
