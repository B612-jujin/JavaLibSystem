package PackgeBook;

import PackgeBook.Controller.LibraryController;
import PackgeBook.View.BookView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//메인
        SetBook(BookList.getBookLsit());
        int end = 0;
        while(end != 999){
                    end = LibraryController.UserInput(BookList.getBookLsit());
        }
    }

public static void SetBook(ArrayList<Book> MainBook) {
        //isbn
    MainBook.add(new Book("0001","초원의 집","로라 잉걸스 와이더","동아출판",5600));
    MainBook.add(new Book("0002","메리골드 마음 세탁소","로라 잉걸스 와이더","김석희",5600));
    MainBook.add(new Book("0003","불편한 편의점","로라 잉걸스 와이더","김석희",5600));
    MainBook.add(new Book("0004","어린왕자","로라 잉걸스 와이더","김석희",5600));
    MainBook.add(new Book("0005","15소년 표류기","로라 잉걸스 와이더","김석희",5600));
    MainBook.add(new Book("0006","로빈후드","로라 잉걸스 와이더","김석희",5600));
    MainBook.add(new Book("0007","호빗","로라 잉걸스 와이더","김석희",5600));
    MainBook.add(new Book("0008","논어","로라 잉걸스 와이더","김석희",5600));
    MainBook.add(new Book("0009","사람은 무엇으로 사는가","로라 잉걸스 와이더","김석희",5600));
    MainBook.add(new Book("0010","양말도깨비","로라 잉걸스 와이더","김석희",5600));


}
}