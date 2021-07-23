package task7;

public class Salt implements Ingredient {
    private final static double CALORIES_PER_GRAM = 0;
    private final double weight;
    private final String name;

    public Salt(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return CALORIES_PER_GRAM *  weight;
    }

    @Override
    public String toString() {
        return "Salt{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
