package javastart;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

enum Pizza {
    MARGHERITA(new String[]{"sos pomidorowy", "ser"}),
    CAPRICIOSA(new String[]{"sos pomidorowy", "ser", "pieczarki"}),
    PROSCIUTTO(new String[]{"sos pomidorowy", "ser", "szynka"});

    private String[] ingredients;

    Pizza(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public static Pizza fromDescription(String description) {
        for (Pizza pizza : Pizza.values()) {
            if (pizza.name().equals(description.toUpperCase(Locale.ROOT))) {
                return pizza;
            }
        }
        throw new IllegalArgumentException("Brak podanej pizzy");
    }

    @Override
    public String toString() {
        return name() + " ingredients: " + Arrays.toString(ingredients);
    }
}
