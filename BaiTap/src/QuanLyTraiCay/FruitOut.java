package QuanLyTraiCay;

import java.util.Scanner;

/**
 * Lớp Trái cây nhập khẩu, kế thừa Fruit.
 */
public class FruitOut extends Fruit {
    private String origin; // Xuất xứ
    private double extraOut; // Phí nhập khẩu

    public FruitOut() {
        super();
    }

    public FruitOut(int id, String name, double price, String origin, double extraOut) {
        super(id, name, price);
        this.origin = origin;
        this.extraOut = extraOut;
    }

    // Getters & Setters
    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }
    public double getExtraOut() { return extraOut; }
    public void setExtraOut(double extraOut) { this.extraOut = extraOut; }

    /**
     * Ghi đè phương thức input để nhập thêm xuất xứ và phí nhập khẩu.
     */
    @Override
    public void input(Scanner sc) {
        System.out.println("--- Nhập Trái cây Nhập khẩu ---");
        super.input(sc); // Gọi input của lớp cha (nhập id, name, price)
        System.out.print("Nhập Xuất xứ (Origin): ");
        this.origin = sc.nextLine();
        System.out.print("Nhập Phí nhập khẩu (extraOut): ");
        this.extraOut = Double.parseDouble(sc.nextLine());
    }

    /**
     * Ghi đè toString để hiển thị đầy đủ thông tin.
     */
    @Override
    public String toString() {
        return "FruitOut[" + super.toString() + // Gọi toString của cha
                ", origin='" + origin + '\'' +
                ", extraOut=" + extraOut +
                ", finalPrice=" + priceForSale() + // Hiển thị giá bán
                "]";
    }

    /**
     * Triển khai công thức tính giá cho FruitOut.
     */
    @Override
    public double priceForSale() {
        // Giá bán = giá + phí nhập khẩu + 10% phí nhập khẩu
        return this.getPrice() + this.extraOut + (0.1 * this.extraOut);
        // Hoặc: return this.getPrice() + (1.1 * this.extraOut);
    }
}
