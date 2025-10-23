package OOPCacPhuongThuc;

import java.util.Scanner;

public class Book {
    private String name;
    private double price;
    private int quantity;

    // Constructors
    public Book() {}
    public Book(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters (Rất quan trọng cho Ví dụ 13)
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Setters (Bỏ qua cho ngắn gọn)
    public void setPrice(double price) { this.price = price; }
    public void setName(String name) { this.name = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }


    // toString
    @Override
    public String toString() {
        return "Book[name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity + ']';
    }

    /**
     * Phương thức cho phép nhập thông tin Book từ bàn phím.
     * @param sc Đối tượng Scanner để đọc input.
     */
    public void input(Scanner sc) {
        System.out.print("Nhập tên sách: ");
        this.name = sc.nextLine();

        System.out.print("Nhập giá sách: ");
        this.price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        this.quantity = Integer.parseInt(sc.nextLine());
    }
}