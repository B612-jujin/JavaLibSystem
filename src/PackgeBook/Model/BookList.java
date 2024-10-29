package PackgeBook.Model;

import java.util.ArrayList;

public class BookList {
    private static ArrayList<Book> BookLsit = new ArrayList<>();

    public static ArrayList<Book> getBookLsit() {
        return BookLsit;
    }

    public static void setBookLsit(ArrayList<Book> bookLsit) {
        BookLsit = bookLsit;
    
    }

    public static void SetBook(ArrayList<Book> MainBook) {
        //isbn
        MainBook.add(new Book("0001","초원의 집","로라 잉걸스 와이더","비룡소",131000));
        MainBook.add(new Book("0002","메리골드 마음 세탁소","윤정은","북로망스",13500));
        MainBook.add(new Book("0003","불편한 편의점","김호연","나무옆의자",12600));
        MainBook.add(new Book("0004","어린왕자","앙투안 드 생텍쥐페리","열린책들",8820));
        MainBook.add(new Book("0005","2년간의 방학","쥘 베른","비룡소",22500));
        MainBook.add(new Book("0006","로빈 후드의 모험","하워드 파일","비룡소",16200));
        MainBook.add(new Book("0007","호빗","J. R. R. 톨킨","씨앗을뿌리는사람",10800));
        MainBook.add(new Book("0008","이토록 찬란한 어둠","김문정","흐름출판",13500));
        MainBook.add(new Book("0009","사람은 무엇으로 사는가","레프 톨스토이","현대지성",5600));
        MainBook.add(new Book("0010","양말도깨비","만물상","재미주의",12000));


    }
}
