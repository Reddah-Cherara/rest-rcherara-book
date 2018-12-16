package ca.rcherara.example.util;

import java.util.ArrayList;
import java.util.List;

import ca.rcherara.example.domain.Book;

/**
 * @author rcherara
 *
 */
public class UserUtil {

    private static final String author = "author";
    private static final String title = "title";

    private UserUtil() {
    }

    public static Book createBook() {
        return new Book(1L, author, title);
    }

    public static List<Book> createBookList(int howMany) {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            bookList.add(new Book((long) i, author, title));
        }
        return bookList;
    }

}
