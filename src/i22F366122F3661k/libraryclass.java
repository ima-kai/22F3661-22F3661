package i22F366122F3661k;

import java.util.ArrayList;
import java.util.List;

public class libraryclass {
    private List<String> books = new ArrayList<>();

    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println(bookName + " added to library.");
    }

    public void listBooks() {
        System.out.println("Books in library: " + books);
    }   }



