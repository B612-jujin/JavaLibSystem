import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class BookManagement {

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
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        sc.close();
        return BookList.get(index-1);

    }

    public static void SetBook(Book Books){
        Scanner sc = new Scanner(System.in);
        System.out.printf("수정하고 싶은 항목의 번호를 입력하시오: ");
    }
    public static void DeleteBook(ArrayList<Book> books){

    }
}


