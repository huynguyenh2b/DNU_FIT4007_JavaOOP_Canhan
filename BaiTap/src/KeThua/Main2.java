package KeThua;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo thông tin 2 con mèo
        System.out.println("--- Nhập thông tin mèo 1 ---");
        Cat cat1 = new Cat();
        cat1.input(sc);

        System.out.println("\n--- Nhập thông tin mèo 2 ---");
        Cat cat2 = new Cat();
        cat2.input(sc);

        System.out.println("\n-----------------------------");

        // In ra thông tin 2 con mèo đó
        System.out.println("Thông tin mèo 1: " + cat1.toString());
        System.out.println("Thông tin mèo 2: " + cat2.toString());

        // In ra năm sinh của con mèo thứ 2
        System.out.println("Năm sinh của mèo 2: " + cat2.getYearOfBirth());

        // Kiểm tra xem 2 con mèo có cùng giới tính không
        if (cat1.equalBreed(cat2)) {
            System.out.println("Hai con mèo cùng giới tính.");
        } else {
            System.out.println("Hai con mèo khác giới tính.");
        }

        sc.close();
    }
}