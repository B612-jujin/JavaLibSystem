package PackgeBook.Controller;

import PackgeBook.Model.Book;
import PackgeBook.BookManagement;
import PackgeBook.View.BookView;

import java.util.ArrayList;
import java.util.Scanner;


public class LibraryController {

    public static int UserInput(ArrayList<Book> BookList) {//값을 받아 이벤트 실행
        BookView.ShowMainMenu();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        BookView.ViewInput(input);//북 view
        switch (input) {
            case 1://도서정보 추가
                BookManagement.addBook(BookList);
                return 0;
            case 2://도서조회
                Book resultBook = BookManagement.BookSelect(BookList);
                BookView.ShowBook(resultBook);
                return 0;
            case 3://도서정보 수정
                BookManagement.SetBook(BookList);
                return 0;
            case 4://도서정보 삭제
                BookManagement.DeleteBook(BookList);
                return 0;
            case 5://도서정보 출력
                BookView.ShowBookList(BookList);
                return 0;
            default:
                return 999;
        }

    }


}
