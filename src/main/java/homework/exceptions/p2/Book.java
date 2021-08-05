package homework.exceptions.p2;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final int isbn;
    private final String title;
    private final String author;
    private final LocalDate releaseDate;

    public Book(int isbn, String title, String author, LocalDate releaseDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }


    @Override
    public String toString() {
        return "Książka: " +
                "isbn=" + isbn +
                ", tytuł='" + title + '\'' +
                ", autor='" + author + '\'' +
                ", data wydania =" + releaseDate;
    }

}
