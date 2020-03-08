

public class Book extends Product {

    private String type;
    private String authorName;
    private String bookName;
    private String ISBN;

    public Book() {
        super();
        type = "";
        authorName = "";
        bookName = "";
        this.ISBN = "";
    }

    public Book(int productNo, String description, int price, int stock, String type, String authorName, String bookName, String ISBN) {
        super(productNo, description, price, stock);
        this.type = type;
        this.authorName = authorName;
        this.bookName = bookName;
        this.ISBN = ISBN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return type + ",\nAuthor Name: " + authorName + ",\nBook Title: " + bookName + ",\nISBN: " + ISBN + super.toString();
    }
}
