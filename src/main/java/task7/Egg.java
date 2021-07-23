package task7;

import java.math.BigDecimal;

public class Egg implements ValuableIngredient {
    private static final double CALORIES_PER_GRAM = 1.5;
    private final double weight;
    private final String name;

    public Egg(String name, double weight) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return weight * CALORIES_PER_GRAM;
    }

    @Override
    public String toString() {
        return "Egg{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(2);
    }
}