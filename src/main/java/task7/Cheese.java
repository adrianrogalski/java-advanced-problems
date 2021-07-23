package task7;

import java.math.BigDecimal;

public class Cheese implements ValuableIngredient {
    private final static double CALORIES_PER_GRAM = 2;
    private final double weight;
    private final String name;

    public Cheese(double weight, String name) {
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
        return "Cheese{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(3);
    }
}
