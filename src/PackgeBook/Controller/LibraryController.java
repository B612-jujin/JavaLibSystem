package PackgeBook.Controller;

import PackgeBook.Book;

import java.util.ArrayList;

public class LibraryController {
    public static void ShowBookList(ArrayList<Book> BookList) {
        for (int i =0; i<BookList.size(); i++) {
            System.out.printf("%s 에 대한 정보\n|제목 : %s | 저자 : %s | 출판사 : %s | 가격 : %d |",BookList.get(i).);

        }
    }

}
