package KeThua;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo một hình vuông có kích thước là 10
        Square sq1 = new Square(10);

        // In ra thông tin, chu vi, diện tích
        System.out.println("--- Hình vuông 1 (cạnh 10) ---");
        System.out.println("Thông tin: " + sq1.toString());
        System.out.println("Chu vi: " + sq1.getPerimeter());
        System.out.println("Diện tích: " + sq1.getArea());

        System.out.println("\n-----------------------------");

        // Sửa lại kích thước hình vuông là 20
        sq1.setSide(20);

        // In ra thông tin, chu vi, diện tích
        System.out.println("--- Hình vuông 1 (cạnh 20) ---");
        System.out.println("Thông tin: " + sq1.toString());
        System.out.println("Chu vi: " + sq1.getPerimeter());
        System.out.println("Diện tích: " + sq1.getArea());

        System.out.println("\n-----------------------------");

        // Nhập vào thông tin một hình vuông
        Square sq2 = new Square();
        System.out.println("--- Nhập hình vuông 2 ---");
        sq2.input(sc);

        // In ra chu vi, diện tích
        System.out.println("Thông tin: " + sq2.toString());
        System.out.println("Chu vi: " + sq2.getPerimeter());
        System.out.println("Diện tích: " + sq2.getArea());

        sc.close();
    }
}
