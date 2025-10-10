package CauDieuKien;

import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int n = scanner.nextInt();

        double sqrt = Math.sqrt(n);

        if (sqrt == (int)sqrt) {
            System.out.println(n + " là số chính phương.");
        } else {
            System.out.println(n + " không phải là số chính phương.");
        }

        scanner.close();
    }
}