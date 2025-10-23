package KeThua;

import java.util.Scanner;

public class Laptop extends ElectronicDevice {
    private String screenSize;

    public Laptop() {
        super(); // Tự động gọi constructor mặc định của lớp cha
    }

    public Laptop(String manufacturer, long price, String screenSize) {
        super(manufacturer, price); // Gọi constructor có tham số của lớp cha
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        // Gọi các phương thức getter của lớp cha để lấy thông tin
        return "Laptop[" +
                super.toString() + // Sử dụng lại toString() của cha
                ", screenSize='" + screenSize + '\'' +
                ']';
    }

    @Override
    public void input(Scanner sc) {
        System.out.println("Nhập thông tin Laptop:");
        super.input(sc); // Gọi input() của lớp cha để nhập manufacturer và price
        System.out.print("Nhập kích thước màn hình: ");
        this.screenSize = sc.nextLine();
    }
}
