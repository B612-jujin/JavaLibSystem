package PackgeBook.View;
import PackgeBook.Book;
import PackgeBook.BookManagement;

import java.util.ArrayList;

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
    public static void Changed(){
        System.out.println("변경되었습니다.");
    }
    public static void AmendBookMsg(Book AmendBook){
        System.out.printf("==========%s==========\n",AmendBook.getBookName());
        System.out.printf("0번 : 종료 | 1번 : ISBN | 2번 : 책 제목 | 3번 : 저자 | 4번 : 출판사 | 5번 : 가격 | 6번 : 다른 책 수정 | 입력 : ");
        System.out.printf("수정할 항목의 번호를 입력하시오 :");
    }
    public static void DeleteBookMsg(){
        System.out.printf("지워졌습니다.\n");
    }
    public static void SetBookMsg(int inputInt, Book AmendBook) {
        switch (inputInt) {
            case 1://ISBN
                System.out.printf("현제 ISBN의 값 : %s 변경할 값 : ", AmendBook.getIsbn().toString(), AmendBook.getIsbn());
                break;
            case 2://ㅔㅈ목
                System.out.printf("책 제목 : %s 변경할 값 : ", AmendBook.getIsbn().toString(), AmendBook.getIsbn());
                break;
            case 3://저자
                System.out.printf("현제 저자의 이름 : %s 변경할 값 : ", AmendBook.getIsbn().toString(), AmendBook.getIsbn());

                break;
            case 4://출판사
                System.out.printf("현제 출판사 값 : %s 변경할 값 : ", AmendBook.getIsbn().toString(), AmendBook.getIsbn());
                break;
            case 5://가격
                System.out.printf("현제 가격 : %s 변경할 값 : ", AmendBook.getIsbn().toString(), AmendBook.getIsbn());
                break;
            case 6://책 선택
                System.out.printf("다른 ");
                break;
            case 0:
                System.out.println("종료합니다.\n");
                break;

        }
    }
    public static void UserInputMsg(){
        System.out.println("원하시는 서비스의 번호를 입력하세요: ");
    }
    public static void ShowBookList(ArrayList<Book> BookList) {//나중에 VIEW로 옮기기
        for (int i =0; i<BookList.size(); i++) {
            System.out.printf("[%s] 에 대한 정보 = | ISBN: %s | 제목 : %s | 저자 : %s | 출판사 : %s | 가격 : %d |\n",
                    BookList.get(i).getBookName(),BookList.get(i).getIsbn(),BookList.get(i).getBookName(),BookList.get(i).getAuthor(),BookList.get(i).getPublisher(),BookList.get(i).Price);

        }
    }
}
