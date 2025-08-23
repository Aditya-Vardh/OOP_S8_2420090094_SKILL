package skill_4;

class Book {
   
    private String title;
    private String author;
    private double price;
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Book Title: " + title + " Author: " + author + "Price: $" + price;
    }
}
public class book_class {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);
    }
}