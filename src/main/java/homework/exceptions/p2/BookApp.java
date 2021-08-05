package homework.exceptions.p2;

import java.time.LocalDate;

public class BookApp {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();
        repository.add(new Book(434322, "Ania z zielonego wzgórza", "Lingret", LocalDate.of(1999,04,11)));
        try {
            // repository.searchByID(3434);
            // repository.deleteByID(343);
            // repository.searchByTitle("Narnia");
            System.out.println(repository.searchByTitle("Ania z zielonego wzgórza"));
        }
        catch (NoBookFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
