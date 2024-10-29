package PackgeBook;

import PackgeBook.Controller.LibraryController;
import PackgeBook.Model.Book;
import PackgeBook.Model.BookList;


public class Main {
    public static void main(String[] args) {
//메인
        BookList.SetBook(BookList.getBookLsit());
        int end = 0;
        while(end != 999){//프로그램 실행
                    end = LibraryController.UserInput(BookList.getBookLsit());
        }
    }


}