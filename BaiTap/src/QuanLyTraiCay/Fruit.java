package QuanLyTraiCay;

import java.util.Scanner;

/**
 * Lớp cha trừu tượng cho Trái cây, triển khai IFruit.
 */
public abstract class Fruit implements IFruit {
    private int id;
    private String name;
    private double price; // Giá gốc

    public Fruit() {
    }

    public Fruit(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Phương thức nhập thông tin cơ bản cho trái cây.
     * Dùng chung cho các lớp con.
     */
    public void input(Scanner sc) {
        System.out.print("Nhập ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập Giá (gốc): ");
        this.price = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        // Trả về phần thông tin chung
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price;
    }

    // Lớp Fruit khai báo triển khai IFruit,
    // nhưng để lớp con định nghĩa chi tiết
    @Override
    public abstract double priceForSale();
}