package KeThua;

import java.util.Scanner;

public class ElectronicDevice {
    private String manufacturer;
    private long price;

    public ElectronicDevice() {
    }

    public ElectronicDevice(String manufacturer, long price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "manufacturer='" + manufacturer + '\'' +
                ", price=" + price;
    }

    public void input(Scanner sc) {
        System.out.print("Nhập nhà sản xuất: ");
        this.manufacturer = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        this.price = sc.nextLong();
        sc.nextLine(); // Tiêu thụ ký tự newline
    }
}