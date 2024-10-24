package PackgeBook;

public class Book {

    private String isbn;
    private String BookName;
    private String Author;
    private String Publisher;
    public int Price;

    public Book(String isbn, String bookName, String author, String publisher, int price) {
        this.isbn = isbn;
        BookName = bookName;
        Author = author;
        Publisher = publisher;
        Price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", Price=" + Price +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
//북 클레스