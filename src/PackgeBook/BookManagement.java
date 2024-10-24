package PackgeBook;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;



public class BookManagement {
    public static ArrayList<Function> BookFunction = new ArrayList<>();
    public static void addBook(ArrayList<Book> BookList) {
        //도서정보 입력
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the ISBN: ");
        String isbn = sc.nextLine();
        System.out.printf("Enter the Title: ");
        String title = sc.nextLine();
        System.out.printf("Enter the Author: ");
        String author = sc.nextLine();
        System.out.printf("Enter the publisher: ");
        String publisher = sc.nextLine();
        System.out.printf("Enter the price: ");
        int price = sc.nextInt();
        System.out.printf("ISBN: %s\nTitle: %s\nAuthor: %s\nPublisher:%s\nPrice: %d\n", isbn, title, author, publisher, price);
        BookList.add(new Book(isbn,title,author,publisher,price));
        sc.close();
    }

    public static Book BookSelect(ArrayList<Book> BookList) {
        System.out.printf("책의 이름 또는 ISBN 을 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        String BookName = sc.nextLine();
        System.out.print("\n"+BookName);
        for (int i = 0; i < BookList.size(); i++) {
            if(Objects.equals(BookList.get(i).getBookName(), BookName) || Objects.equals(BookList.get(i).getIsbn(), BookName)) {
                System.out.printf("조회되었습니다.\n");
                return BookList.get(i);
            }
        }
        return null;
    }
    static int end = 0;//0 = 초기상태 , 1 = 책이 선택된 경우, 2 = 작업이 끝난 경우
    static Book AmendBook = null;
    public static void SetBook(ArrayList<Book> BookList){
        Scanner sc = new Scanner(System.in);
        int inputInt = 6;
        if (end == 0){
            AmendBook = BookSelect(BookList);
            end = 1;

        }
        if(AmendBook == null){return;}
        System.out.printf("==========%s==========",AmendBook.getBookName());
        System.out.printf("수정할 항목의 번호를 입력하시오 :");
        System.out.printf("0번 : 종료 | 1번 : ISBN | 2번 : 책 제목 | 3번 : 저자 | 4번 : 출판사 | 5번 : 가격 | 6번 : 다른 책 수정 | 입력 : ");
        inputInt = sc.nextInt();
        sc.nextLine();
        switch (inputInt) {
            case 1://ISBN
                System.out.printf("현제 ISBN의 값 : %s 변경할 값 : ", AmendBook.getIsbn().toString(),AmendBook.getIsbn());
                AmendBook.setIsbn(sc.nextLine());
                System.out.println("변경되었습니다.");
                break;
            case 2://ㅔㅈ목
                System.out.printf("책 제목 : %s 변경할 값 : ", AmendBook.getIsbn().toString(),AmendBook.getIsbn());
                AmendBook.setBookName(sc.nextLine());
                System.out.println("변경되었습니다.");
                break;
            case 3://저자
                System.out.printf("현제 저자의 이름 : %s 변경할 값 : ", AmendBook.getIsbn().toString(),AmendBook.getIsbn());
                AmendBook.setAuthor(sc.nextLine());
                System.out.println("변경되었습니다.");
                break;
            case 4://출판사
                System.out.printf("현제 출판사 값 : %s 변경할 값 : ", AmendBook.getIsbn().toString(),AmendBook.getIsbn());
                System.out.println("변경되었습니다.");
                AmendBook.setPublisher(sc.nextLine());
                break;
            case 5://가격
                System.out.printf("현제 가격 : %s 변경할 값 : ", AmendBook.getIsbn().toString(),AmendBook.getIsbn());
                System.out.println("변경되었습니다.");
                AmendBook.setPrice(sc.nextInt());
                break;
            case 6://책 선택
                end = 0;
                break;
            case 0:
                System.out.println("종료합니다.");
                end = 3;
                break;
            default:
                end = 3;
                break;
        }
        if(end != 3){
            SetBook(BookList);
        }

    }
    public static void DeleteBook(ArrayList<Book> BookList){
        AmendBook = BookSelect(BookList);
        BookList.remove(AmendBook);
        System.out.printf("지워졌습니다.");
    }
}


