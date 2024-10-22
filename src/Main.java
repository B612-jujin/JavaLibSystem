import java.util.ArrayList;
import static View.BookView.*;

public class Main {
    public static void main(String[] args) {
//메인
        ArrayList<Book> MainBook = BookList.getBookLsit();
        SetBook(MainBook);
        BookManagement.addBook(MainBook);
        for (int i = 0; i < MainBook.size(); i++) {
            System.out.printf("도서정보 :\n%s\n", MainBook.get(i).toString());
        }

    }

public static void SetBook(ArrayList<Book> MainBook) {
        MainBook.add(new Book("1111","초원의 집","로라 잉걸스 와이더","김석희",5600));
}
}