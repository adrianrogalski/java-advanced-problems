package task7;

import java.math.BigDecimal;

public interface Valuable {
    // definiuje metode abstrakcyjna podania ceny ktora kazdy obiekt implementujacy bedzie musial podac
    abstract BigDecimal getPrice();
}
