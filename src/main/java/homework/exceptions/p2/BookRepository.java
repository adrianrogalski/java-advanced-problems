package homework.exceptions.p2;

import java.util.*;

public class BookRepository {
    private List<Book> books = new LinkedList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void delete(Book book) {
        books.remove(book);
    }

    public List<Book> searchByTitle(String title) throws NoBookFoundException {
        List<Book> booksFound = new LinkedList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksFound.add(book);
            }
        }
        if (booksFound.isEmpty()) {
            throw new NoBookFoundException("Nie znaleziono ksiązki o tytule: " + title);
        }
        return booksFound;
    }

    public List<Book> searchByID(int isbn) throws NoBookFoundException {
        List<Book> booksFound = new LinkedList<>();
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                booksFound.add(book);
            }
        }
        if (booksFound.isEmpty()) {
            throw new NoBookFoundException("Nie znaleziono książki o indeksie: " + isbn);
        }
        return booksFound;
    }

    public void deleteByID(int isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Nie znaleziono książki o indeksie: " + isbn);
    }




}
