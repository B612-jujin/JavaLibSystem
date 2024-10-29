package PackgeBook;

import PackgeBook.View.BookView;

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
        BookView.AmendBookMsg(AmendBook);
        if (sc.hasNext()) {
            inputInt = sc.nextInt();
            // thirdElement 사용
        } else {
            System.out.println("No more elements");
        }

        BookView.SetBookMsg(inputInt, AmendBook);
        switch (inputInt) {
            case 1://ISBN
                AmendBook.setIsbn(sc.nextLine());
                BookView.Changed();
                break;
            case 2://ㅔㅈ목
                AmendBook.setBookName(sc.nextLine());
                BookView.Changed();
                break;
            case 3://저자
                AmendBook.setAuthor(sc.nextLine());
                BookView.Changed();
                break;
            case 4://출판사
                AmendBook.setPublisher(sc.nextLine());
                BookView.Changed();
                break;
            case 5://가격
                AmendBook.setPrice(sc.nextInt());
                BookView.Changed();
                break;
            case 6://책 선택
                end = 0;
                break;
            case 0:
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
        BookView.DeleteBookMsg();
    }

    public static void ShowBookList(ArrayList<Book> BookList) {//나중에 VIEW로 옮기기
        for (int i =0; i<BookList.size(); i++) {
            System.out.printf("[%s] 에 대한 정보 = | ISBN: %s | 제목 : %s | 저자 : %s | 출판사 : %s | 가격 : %d |\n",
                    BookList.get(i).getBookName(),BookList.get(i).getIsbn(),BookList.get(i).getBookName(),BookList.get(i).getAuthor(),BookList.get(i).getPublisher(),BookList.get(i).Price);

        }
    }
}


