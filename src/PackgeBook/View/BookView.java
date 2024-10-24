package PackgeBook.View;
import PackgeBook.Book;
import PackgeBook.BookManagement;

public class BookView {
    public static void ShowBook(Book book) {
        System.out.printf("ISBN: %s\nTitle: %s\nAuthor: %s\nPublisher:%s\nPrice: %d\n", book.getIsbn(), book.getBookName(), book.getAuthor(), book.getPublisher(), book.Price);
    }
    public static void ShowMainMenu() {
        System.out.printf("======📜LibraryManagementSystem=====\n" +
                          "| [1번] 도서정보 추가 : 새로운 도서 등록 | [2번] 도서조회 : 도서 조회 | [3번] 도서정보 수정 : 도서의 정보 수정 | [4번] 도서정보 삭제 ㅣ [5번] 도서정보 출력 : 전체 도서리스트 출력 |\n");
    }
    public static void ViewInput(int input){
        switch (input) {
            case 1://도서정보 추가
                System.out.printf("도서정보를 추가합니다.➕\n");
                break;
            case 2://도서조회
                System.out.printf("도서를 조회합니다.👆\n");
                break;
            case 3://도서정보 수정
                System.out.printf("도서정보를 수정합니다.📝\n");
                break;
            case 4://도서정보 삭제
                System.out.printf("도서정보를 삭제합니다.🗑\n");
                break;
            case 5://도서정보 출력
                System.out.printf("도서정보를 출력합니다.📜\n");
                break;
        }
    }


}
