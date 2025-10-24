package QuanLySach;

import java.util.Scanner;

public class EBook extends Book {
    private String format; // (e.g., PDF, EPUB)
    private double fileSizeMB;

    // Constructor
    public EBook() {
        super();
    }

    public EBook(int bookID, String title, String author, long price, String format, double fileSizeMB) {
        super(bookID, title, author, price);
        this.format = format;
        this.fileSizeMB = fileSizeMB;
    }

    // Getters & Setters
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return super.toString() + // Gọi toString() của lớp cha
                ", format='" + format + '\'' +
                ", fileSizeMB=" + fileSizeMB +
                ", type=EBook]"; // Thêm thông tin loại sách
    }

    // Ghi đè input()
    @Override
    public void input(Scanner sc) {
        System.out.println("--- Nhập thông tin Sách Điện Tử ---");
        super.input(sc); // Gọi input() của lớp cha

        System.out.print("Nhập Định dạng (Format): ");
        this.format = sc.nextLine();

        System.out.print("Nhập Kích thước file (MB): ");
        this.fileSizeMB = Double.parseDouble(sc.nextLine());
    }

    // Phương thức riêng của EBook
    public boolean isBigBook() {
        return this.fileSizeMB > 200;
    }
}
