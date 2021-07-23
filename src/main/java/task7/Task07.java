package task7;

import java.awt.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

/**
 * 1. Zdefiniuj klasy implementujące interfejs Ingredient, która opisuje wagę i kaloryczność składnika dania
 *    - Cheese
 *    - Tomato
 *    - Cake
 *    - Salt
 *    Przy definicji wzoruj się na klasie Egg, możesz też samodzielnie dodać dodakowe pole, jak np. smak, czy koloryczność jednostkową podawaną w konstruktorze
 * 2. Zdefiniuj klasę Dish też implementującą interfejs Ingredient,
 *    - z polem w postaci tablicy obiektów implementujących Ingredient
 *    - z konstruktorem przyjmujący tablicę takich obiektów np. Dish(new Ingredients[]{chees, cake}), gdzie cheese i cake są obiektami klas Cheese i Cake
 *    - z metodami interfejsowymi zwracającymi wagę i kaloryczność całego dania
 * 3. Stwórz kilka różnych obiektów klasy Dish, z różnymi składnikami i przetestuj czy poprawnie działają metody klasy
 * 4. Stwórz obiekt klasy Dish, w którym jednym ze składników jest inne danie.
 * Dla chętnych i ambitnych
 * 5. Zrób całe zadanie uwzględniając cenę składników i całego dania, przy czym nie każdy składnik musi mieć cenę (np. Salt), ale każde danie cenę posiada
 * Wskazówki
 * 1. Zdefiniuj osobno interfejs Valuable z metodą abstrakcyjną zwracająca cenę składnika, oraz interfejs ValuableIngredient łączący oba interfejsy
 * 2. Przy obliczaniu ceny dania należy operatorem instanceof wykryć, który składnik ma cenę
 */
public class Task07 {
    public static void main(String[] args) {
        Dish dish1 = new Dish(new Ingredient[]{
                new Cake(4,"jabłecznik"),
                new Cheese(15,"mascarpone")
        });
        System.out.println(dish1.weight());
        System.out.println(dish1.calories());
        System.out.println(dish1.getPrice());
        System.out.println("Danie 2");
        Dish dish2 = new Dish(new Ingredient[]{
                new Egg("jajko kurze", 2),
                new Tomato(2, "malinowy"),
                new Salt(0.1,"morska")
        });
        System.out.println(dish2.calories());
        System.out.println(dish2.getPrice());
        System.out.println("Danie 3");
        Dish missMach = new Dish(new Ingredient[]{
                dish1,
                new Egg("kurze", 2)
        });
        System.out.println(missMach.calories());
        System.out.println(missMach.getPrice());

    }
}