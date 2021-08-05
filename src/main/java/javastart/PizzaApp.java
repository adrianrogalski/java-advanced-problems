package javastart;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze: ");
        for (Pizza pizza : Pizza.values()) {
            System.out.println(pizza.name());
        }
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        Pizza pizzaChoice = Pizza.fromDescription(userInput);
        System.out.println("Wybrano pizze: " + pizzaChoice);
    }

}
