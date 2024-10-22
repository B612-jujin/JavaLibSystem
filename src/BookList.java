import java.util.ArrayList;

public class BookList {
    private static ArrayList<Book> BookLsit = new ArrayList<>();

    public static ArrayList<Book> getBookLsit() {
        return BookLsit;
    }

    public static void setBookLsit(ArrayList<Book> bookLsit) {
        BookLsit = bookLsit;
    }
}
