package task8;

enum Color {
    // Zgodnie z zasadą deklaruje typy wyliczeniowe i jednoczesnie przekazuje argument value dla konstruktora z parametrem
    RED(0xF00),
    GREEN(0x0F0),
    BLUE(0x00F);

    // zmienna przechowujaca wartosc typu enum
    private final int value;

    // deklaruje konstruktor prywatny dla typu enum
    Color(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
