package QuanLySach;

import java.util.Scanner;

public class Book {
    private int bookID;
    private String title;
    private String author;
    private long price;

    // Constructor
    public Book() {
    }

    public Book(int bookID, String title, String author, long price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters & Setters
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "Book[" +
                "bookID=" + bookID +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price;
        // Dấu ']' sẽ được thêm bởi các lớp con
    }

    // Phương thức input
    public void input(Scanner sc) {
        System.out.print("Nhập Book ID: ");
        // Sử dụng parseXXX để tránh lỗi trôi lệnh của nextLine()
        this.bookID = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập Tiêu đề (Title): ");
        this.title = sc.nextLine();

        System.out.print("Nhập Tác giả (Author): ");
        this.author = sc.nextLine();

        System.out.print("Nhập Giá (Price): ");
        this.price = Long.parseLong(sc.nextLine());
    }
}