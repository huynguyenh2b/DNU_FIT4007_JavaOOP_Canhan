package CauDieuKien;

import java.util.Scanner;

public class LowercaseChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " là chữ cái in thường.");
        } else {
            System.out.println(ch + " không phải là chữ cái in thường.");
        }

        scanner.close();
    }
}