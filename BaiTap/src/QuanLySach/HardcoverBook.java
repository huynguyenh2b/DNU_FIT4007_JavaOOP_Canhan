package QuanLySach;

import java.util.Scanner;

public class HardcoverBook extends Book {
    private String coverMaterial;
    private int numberOfPages;

    // Constructor
    public HardcoverBook() {
        super();
    }

    public HardcoverBook(int bookID, String title, String author, long price, String coverMaterial, int numberOfPages) {
        super(bookID, title, author, price);
        this.coverMaterial = coverMaterial;
        this.numberOfPages = numberOfPages;
    }

    // Getters & Setters
    public String getCoverMaterial() {
        return coverMaterial;
    }

    public void setCoverMaterial(String coverMaterial) {
        this.coverMaterial = coverMaterial;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return super.toString() + // Gọi toString() của lớp cha
                ", coverMaterial='" + coverMaterial + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", type=Hardcover]"; // Thêm thông tin loại sách
    }

    // Ghi đè input()
    @Override
    public void input(Scanner sc) {
        System.out.println("--- Nhập thông tin Sách Cứng ---");
        super.input(sc); // Gọi input() của lớp cha để nhập thông tin chung

        System.out.print("Nhập Chất liệu bìa (Cover Material): ");
        this.coverMaterial = sc.nextLine();

        System.out.print("Nhập Số trang (Number of Pages): ");
        this.numberOfPages = Integer.parseInt(sc.nextLine());
    }
}
