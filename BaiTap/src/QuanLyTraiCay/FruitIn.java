package QuanLyTraiCay;

import java.util.Scanner;

/**
 * Lớp Trái cây trong nước, kế thừa Fruit.
 */
public class FruitIn extends Fruit {
    private double extraIn; // Phí nội bộ

    public FruitIn() {
        super();
    }

    public FruitIn(int id, String name, double price, double extraIn) {
        super(id, name, price);
        this.extraIn = extraIn;
    }

    public double getExtraIn() {
        return extraIn;
    }

    public void setExtraIn(double extraIn) {
        this.extraIn = extraIn;
    }

    /**
     * Ghi đè phương thức input để nhập thêm phí nội bộ.
     */
    @Override
    public void input(Scanner sc) {
        System.out.println("--- Nhập Trái cây Trong nước ---");
        super.input(sc); // Gọi input của lớp cha (nhập id, name, price)
        System.out.print("Nhập Phí nội bộ (extraIn): ");
        this.extraIn = Double.parseDouble(sc.nextLine());
    }

    /**
     * Ghi đè toString để hiển thị đầy đủ thông tin.
     */
    @Override
    public String toString() {
        return "FruitIn[" + super.toString() + // Gọi toString của cha
                ", extraIn=" + extraIn +
                ", finalPrice=" + priceForSale() + // Hiển thị giá bán
                "]";
    }

    /**
     * Triển khai công thức tính giá cho FruitIn.
     */
    @Override
    public double priceForSale() {
        // Giá bán = giá + phí nội bộ
        return this.getPrice() + this.extraIn;
    }
}