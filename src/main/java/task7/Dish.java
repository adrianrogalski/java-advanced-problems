package task7;

import java.math.BigDecimal;

public class Dish implements ValuableIngredient {

    // Stworz tablice obiektow dziedziczacych po interfejsie Ingredient
    Ingredient[] ingredients;

    public Dish(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Ingredient ingredient: ingredients) {
            // Jako ze kazda klasa dziedziczaca po main musi miec funkcje weight wywołaj ją dla każdego obiektu w tablicy
            weight += ingredient.weight();
        }
        return weight;
    }

    @Override
    public double calories() {
        double calories = 0;
        for (Ingredient ingredient: ingredients) {
            calories += ingredient.calories();
        }
        return calories;
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;
        for (Ingredient ingredient: ingredients) {
            if (ingredient instanceof ValuableIngredient) {
                // jawne rzutowanie
                price = price.add(((ValuableIngredient) ingredient).getPrice());
            }
        }
        return price;
    }
}
